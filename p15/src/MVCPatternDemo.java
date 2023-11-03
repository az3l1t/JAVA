//
public class MVCPatternDemo { //model
    public static void main(String[] args) {
        // Имитация получения студента из базы данных
        Student model = retrieveStudentFromDatabase();

        // Создание вида, связанного со студентом
        StudentView view = new StudentView();

        // Создание контроллера, связывающего модель и вид
        StudentController controller = new StudentController(model, view);

        // Обновление данных студента через контроллер
        controller.setStudentName("John Doe");
        controller.setStudentRollNo("12345");

        // Вывод информации о студенте
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Jane Smith");
        student.setRollNo("54321");
        return student;
    }
}
