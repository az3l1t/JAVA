class Student {
    int iDNumber;
    String name;
    double gpa;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
        this.name = "Bart";
        this.gpa = 5;

    }
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.iDNumber = 5;
    }
    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;

    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}