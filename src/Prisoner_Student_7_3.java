// Classe PrisonTest
public class Prisoner_Student_7_3 {
    public static void main(String[] args) {
        // Instanciando um prisioneiro e definindo seus campos usando o método setFields()
        Prisoner p02 = new Prisoner();
        p02.setFields("Twitch", 1.73, 3);

        Prisoner p01 = new Prisoner();
        p01.setFields("Bubba", 2.08, 4);

        // Imprimindo as informações dos prisioneiros
        System.out.println("Variavel: p02");
        p02.printInfo();
        System.out.println("\nVariavel: p01");
        p01.printInfo();
    }
}

// Classe Prisoner
class Prisoner {
    String name;
    double height;
    int sentence;

    // Método para definir os valores dos campos
    public void setFields(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    // Método para imprimir informações do prisioneiro
    public void printInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Altura: " + height + "m");
        System.out.println("Sentenca: " + sentence + " anos");
    }
}