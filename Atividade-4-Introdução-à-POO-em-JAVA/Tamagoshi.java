public class Tamagoshi {

    private String nome;
    private int idade, saude, fome;

    Tamagoshi(String nome, int idade, int saude, int fome) {
        this.nome = nome;
        this.idade = idade;
        this.saude = saude >= 0 ? saude : 0;
        this.fome = fome >= 0 ? fome : 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSaude() {
        return saude;
    }

    public int getFome() {
        return fome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaude(int saude) {
        if (saude >= 0) {
            this.saude = saude;
        } else {
            System.out.println("Valor de saúde inválido.");
        }
    }

    public void setFome(int fome) {
        if (fome >= 0) {
            this.fome = fome;
        } else {
            System.out.println("Valor de fome inválido.");
        }
    }

    @Override
    public String toString() {
        return String.format("""
                    Nome: %s
                    Fome: %d
                    Saúde: %d
                    Idade: %d
                """, nome, fome, saude, idade);
    }
}
