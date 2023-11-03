import java.util.Scanner; //исключения
public class ExceptionDemo { //тест1
    public void exceptionDemo() {
        try{
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("You can't divide by 0!");
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("That’s not an integer!");
        } finally {
            System.out.println("This is the final block, it always executes even if exceptions happen or not");
        }
    }
}