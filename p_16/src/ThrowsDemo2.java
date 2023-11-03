import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        while(key.equals("")) {
            System.out.println("Enter a key:");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Caught an exception in printDetails method. " + e.getMessage());
                key = "";  // Reset key to give the user another attempt
            }
        }
        myScanner.close(); // Close the scanner outside the while loop
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        try {
            Integer.parseInt(key);   // try to convert the key into an integer
        } catch (NumberFormatException e) {
            throw new Exception("Key is not an integer");  // key is not an integer
        }
        return "data for " + key;
    }
}

