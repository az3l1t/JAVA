import java.io.Console;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Dostoevsky", "dost1j@mail.ru", 'M');
        a1.setEmail("dsffd2@mail.ru");
        System.out.println(a1.getEmail());
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.toString());
    }
}
