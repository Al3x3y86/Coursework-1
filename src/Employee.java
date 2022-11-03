public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private double salary;
    private int department;
    private final int id;
    public static int counter = 1;

    public Employee(String firstName, String middleName, String lastName, double salary, int department) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getId() {
        return id;
    }

    public String getFullName(Employee[] employee) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        return firstName + "" + middleName + "" + lastName;
    }

    @Override
    public String toString() {
        return  "ФИО: " + firstName + middleName + lastName +
                ", Зарплата: " + salary +
                ", Отдел: " + department +
                ", ID: " + id;
    }
}