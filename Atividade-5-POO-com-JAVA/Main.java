public class Main {
    public static void main(String[] args) {
        try {
            Administrativo admin = new Administrativo("Gustavo", 21, 9500, "RH");
            admin.exibirInformacoes();

            System.out.println();

            Tecnico tecnico = new Tecnico("Camila", 28, 10500, "TI", "Redes");
            tecnico.exibirInformacoes();

            tecnico.setNome(" Camila Santos");
            tecnico.setEspecialidade("Biologia");

            System.out.println("\n--- Dados do Técnico atualizados ---");
            tecnico.exibirInformacoes();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar funcionário: " + e.getMessage());
        }
    }
}
