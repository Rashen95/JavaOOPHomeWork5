public class EmployeeBaseInit {
    public EmployeeBase init() {
        Employee e1 = new Employee("Artem", "Privalov", 35000);
        Employee e2 = new Employee("Artem", "Zamaev", 55000);
        Employee e3 = new Employee("Zinaida", "Rastorgueva", 35000);
        Employee e4 = new Employee("Anastasia", "Burtovaya", 115000);
        Employee e5 = new Employee("Alex", "Freud", 15000);
        Employee e6 = new Employee("Nick", "Zamaev", 190000);
        Employee e7 = new Employee("Sergio", "Akapulko", 355000);
        Employee e8 = new Employee("Fidel", "Castro", 15000);
        Employee e9 = new Employee("Oleg", "Gamaev", 356000);
        Employee e10 = new Employee("Anton", "Fadeev", 355000);
        EmployeeBase base = new EmployeeBase();
        base.addBase(e1);
        base.addBase(e2);
        base.addBase(e3);
        base.addBase(e4);
        base.addBase(e5);
        base.addBase(e6);
        base.addBase(e7);
        base.addBase(e8);
        base.addBase(e9);
        base.addBase(e10);
        return base;
    }
}
