
public class Main {

    public static void main(String[] args) {
        
        SimpleCollection c = new SimpleCollection("test");
        c.add("first");
        System.out.println(c);

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);

        System.out.println();

        j.add("magneto");
        System.out.println(j);

        System.out.println();

        j.add("mystique");
        System.out.println(j);

        System.out.println();

        j.add("phoenix");
        System.out.println(j);

        

    }
}
