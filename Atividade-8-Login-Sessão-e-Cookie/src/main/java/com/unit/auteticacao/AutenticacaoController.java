package com.unit.auteticacao;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("auth")
public class AutenticacaoController {

    private static String EMAIL_PADRAO = "gustavo@gmail.com";

    private static String SENHA_PADRAO = "12345678";

    @PostMapping("/login")
    public String login(@RequestBody loginDTO login, HttpServletResponse response, HttpServletRequest request) {

        if (EMAIL_PADRAO.equals(login.email()) && SENHA_PADRAO.equals(login.senha())) {
            HttpSession session = request.getSession();
            session.setAttribute("usuarioLogado", login.email());

            Cookie cookie = new Cookie("email", login.email());
            cookie.setMaxAge(3600);
            cookie.setPath("/");
            response.addCookie(cookie);

            return "Login efetuado com sucesso!";
        }
        return "Email ou senha inválidos!";

    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        Cookie cookie = new Cookie("email", "");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);

        return "Logout realizado com sucesso!";
    }

    @GetMapping("/status")
    public String status(HttpServletRequest request,
            @CookieValue(value = "email", defaultValue = "Nenhum") String email) {
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("usuarioLogado") != null) {
            return "Usuário logado: " + session.getAttribute("usuarioLogado") + " | Cookie: " + email;
        }
        return "Nenhum usuário logado.";

    }
}
