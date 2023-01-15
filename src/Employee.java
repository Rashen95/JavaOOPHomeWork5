public class Employee {
    private final int id;
    private String firstName;
    private String lastName;
    private int salary;
    static private int currentId = 1;

    public Employee(String argFirstName, String argLastName, int argSalary) {
        this.firstName = argFirstName;
        this.lastName = argLastName;
        this.salary = argSalary;
        this.id = currentId;
        currentId++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastNameName(String newLastName) {
        this.lastName = newLastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }
}