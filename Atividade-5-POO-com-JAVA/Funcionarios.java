public abstract class Funcionarios {
    private String nome;
    private int idade;
    private float salario;
    private String departamento;

    protected Funcionarios(String nome, int idade, float salario, String departamento) throws IllegalArgumentException {
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
        setDepartamento(departamento);
    }

    protected String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected float getSalario() {
        return salario;
    }

    protected String getDepartamento() {
        return departamento;
    }

    protected void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome == "") {
            throw new IllegalArgumentException("Nome inválido! O nome não pode estar vazio.");
        }
        this.nome = nome;
    }

    protected void setIdade(int idade) throws IllegalArgumentException {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade inválida! Deve ser maior que 0.");
        }
        this.idade = idade;
    }

    protected void setSalario(float salario) throws IllegalArgumentException {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário inválido! Deve ser maior que 0.");
        }
        if (salario <= 10000) {
            this.salario = salario;
        } else {
            this.salario = 10000;
            System.out.println("Salário ultrapassou o limite. Definido como R$10.000.");
        }
    }

    protected void setDepartamento(String departamento) throws IllegalArgumentException {
        if (departamento == null || departamento == "") {
            throw new IllegalArgumentException("Departamento inválido! Não pode estar vazio.");
        }
        this.departamento = departamento;
    }

    protected abstract void exibirInformacoes();
}
