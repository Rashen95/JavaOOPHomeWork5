import java.util.HashMap;

public class EmployeeBase {
    private final HashMap<Integer, Employee> Employees = new HashMap<>();

    public void addBase(Employee e) {
        Employees.put(e.getId(), e);
    }

    public void getBase() {
        for (HashMap.Entry<Integer, Employee> item : Employees.entrySet()) {
            System.out.printf("""
                    >++++++++++++++++++++++++++++++++++++++<
                    ID: %d
                    FirstName: %s
                    LastName: %s
                    Salary: %d
                    """, item.getKey(), item.getValue().getFirstName(), item.getValue().getLastName(), item.getValue().getSalary());
        }
    }

    public Employee getEmployee(int ID) {
        return this.Employees.get(ID);
    }

    public boolean checkID(int ID) {
        return this.Employees.containsKey(ID);
    }

    public void delEmployee(int ID) {
        this.Employees.remove(ID);
    }
}
