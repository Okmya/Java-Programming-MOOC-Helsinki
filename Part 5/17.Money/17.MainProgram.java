
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 7,40e
        System.out.println(c);  // 2,60e

        c = c.minus(a);       // 0,0

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
    
}
