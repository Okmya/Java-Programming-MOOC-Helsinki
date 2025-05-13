
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int j = 1;
        //height ostatniej galezi to zawsze height * 2 - 1, np. dla height = 4 mamy ostatnia galaz rowna 7
        for (int i = 1; i <= height * 2 - 1; i += 2) { // tworzenie 4 galezi, kazda dluzsza o 2 gwiazdki
            // dodajemy odpowiednie spacje, dla height = 4 mamy 3,2,1,0
            printSpaces(height - j);
            printStars(i);
            j++;
        }

        int trunkSpaces = height - 2;
        //dodajemy korzen, ktory znajduje sie o height * 2 - 2 / 3 spacji daleko od ostatniej galezi
        for (int i = 1; i <= 2; i++) {
            printSpaces(trunkSpaces);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(7);
    }
}
