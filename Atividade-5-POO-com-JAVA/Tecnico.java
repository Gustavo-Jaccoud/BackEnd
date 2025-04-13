public class Tecnico extends Funcionarios {
    private String especialidade;

    public Tecnico(String nome, int idade, float salario, String departamento, String especialidade)
            throws IllegalArgumentException {
        super(nome, idade, salario, departamento);
        setEspecialidade(especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws IllegalArgumentException {
        if (especialidade == null || especialidade == "") {
            throw new IllegalArgumentException("Especialidade inválida! Não pode estar vazia.");
        }
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---- Técnico ----");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Especialidade: " + getEspecialidade());
    }
}
