import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book b1=new Book("Dostoevsky","Romance");
        Book b2=new Book();
        System.out.println(b1);
        b2.setTheme("Horror");
        System.out.println(b2.getTheme());
    }
}
