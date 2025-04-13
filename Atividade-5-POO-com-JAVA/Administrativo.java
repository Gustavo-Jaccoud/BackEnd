public class Administrativo extends Funcionarios {

    public Administrativo(String nome, int idade, float salario, String departamento) throws IllegalArgumentException {
        super(nome, idade, salario, departamento);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---- Administrativo ----");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Departamento: " + getDepartamento());
    }
}
