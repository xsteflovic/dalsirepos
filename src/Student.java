public class Student implements Person {
    private String studentID;
    private String name;
    private String surname;
    private int age;

    // Constructor
    public Student(String studentID, String name, String surname, int age) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Implementation of getInfo from the Person interface
    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + name);
        System.out.println("Student Surname: " + surname);
        System.out.println("Student Age: " + age + "\n");
    }
}