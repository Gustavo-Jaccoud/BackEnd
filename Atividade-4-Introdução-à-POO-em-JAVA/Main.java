public class Main {
    public static void main(String[] args) {

        Tamagoshi tamagoshi1 = new Tamagoshi("Fufi", 5, 80, 2);
        Tamagoshi tamagoshi2 = new Tamagoshi("Lulu", 3, 90, 1);

        tamagoshi1.setNome("Fufi Jr.");
        tamagoshi1.setFome(7);
        tamagoshi1.setSaude(70);
        tamagoshi1.setIdade(3);

        tamagoshi2.setNome("Luluzinha");
        tamagoshi2.setFome(2);
        tamagoshi2.setSaude(85);
        tamagoshi2.setIdade(2);

        System.out.println("Tamagoshi 1:");
        System.out.println(tamagoshi1);

        System.out.println("\nTamagoshi 2:");
        System.out.println(tamagoshi2);
    }
}
