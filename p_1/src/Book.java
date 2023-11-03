public class Book {
    private String author;
    private String Theme;
    public Book(String a,String t){
        author=a;
        Theme=t;
    }
    public Book(String a){
        author=a;
    }
    public Book(){
        author="Dostoevsky";
        Theme="Romance";
    }
    public void setTheme(String Theme){
        this.Theme=Theme;
    }
    public String getTheme(){
        return Theme;
    }
    public String toString(){
        return this.Theme +" - is the Theme of the book ";
    }
}
