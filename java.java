public class PrintUtils {

     
    public void print(int a) {
        System.out.println("Integer: " + a);
    }

    
    public void print(double a) {
        System.out.println("Double: " + a);
    }

    
    public void print(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        PrintUtils printer = new PrintUtils();
        
        printer.print(10); 
        printer.print(10.5); 
        printer.print("Hello"); 
    }
}
