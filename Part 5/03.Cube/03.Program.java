
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Cube cube = new Cube(2);
        
        System.out.println(cube.volume());
        System.out.println(cube);

        // Experiment with your program here
    }
}
