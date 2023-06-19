package staticKeyword;

public class StaticBlocks {
    static double pi;
    static String shape;

    //Sometimes before psvm are run, variables should be ready. Because of thar we use static blocks.
    //if static variables are initialized in static block, they are ready in that class before everything.
    static {
        pi=3.14;
        System.out.println("static block 1");
    }

    static {
        shape="Circle";
        System.out.println("static blok 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }
}
