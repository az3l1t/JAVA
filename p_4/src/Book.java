public class Book {
    public String writer;
    public String theme;
    public Book(){
        this.writer="Dostoevskiy";
        this.theme="Romance";
    }

    public Book(String writer){
        this.writer=writer;
        this.theme="Romance";
    }

    public Book(String writer,String theme){
        this.writer=writer;
        this.theme=theme;
    }

    public String getWriter() {return writer; }
    public String getTheme() {return theme; }
    public void setWriter(String writer) {this.writer=writer; }
    public void setTheme(String theme) {this.theme=theme; }

    public String toString() {
        return "Writer: " + this.writer + ", Theme: "+ this.theme;
    }
}
