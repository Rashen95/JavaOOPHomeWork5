public class AddEmployee implements Checker {
    public void add(EmployeeBase myBase) {
        System.out.println("Введите имя нового сотрудника: ");
        String newFirstName = new UserInput().input();
        System.out.println("Введите фамилию нового сотрудника: ");
        String newLastName = new UserInput().input();
        int newSalary = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("Введите зарплату нового сотрудника: ");
            String strNewSalary = new UserInput().input();
            if (Checker.isDigit(strNewSalary)) {
                flag = true;
                newSalary = Integer.parseInt(strNewSalary);
            } else {
                new Errors().salaryError();
            }
        }
        myBase.addBase(new Employee(newFirstName, newLastName, newSalary));
        System.out.println("===========================");
        System.out.println("Новый пользователь добавлен");
        new Menu().mainMenu(myBase);
    }
}
