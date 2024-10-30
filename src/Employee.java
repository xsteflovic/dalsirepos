public class Employee implements Person {
    private String name;
    private String surname;
    private int age;
    private int yearsToWork;

    // Constructor
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.yearsToWork = 62 - age; // Assuming retirement age is 62
    }

    // Implementation of getInfo from the Person interface
    @Override
    public void getInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Surname: " + surname);
        System.out.println("Employee Age: " + age);
        System.out.println("Years to Work: " + yearsToWork + "\n");
    }
}
