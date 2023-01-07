package P6;

public class Printer {
    private static Printer printer = new Printer();
    private int counter = 0;


    private Printer() {
    }

    public static Printer getPrinter() {
        return printer;
    }

    public void Print(String contents) {
        this.counter++;
        System.out.println(this.counter);
        System.out.print(contents);
    }

}