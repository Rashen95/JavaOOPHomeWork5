public class DelEmployee {
    public void del(EmployeeBase myBase) {
        boolean flag = false;
        while (!flag) {
            System.out.println("Введите ID увольняемого сотрудника или * для возврата в предыдущее меню: ");
            String input = new UserInput().input();
            if (input.equals("*")) {
                flag = true;
                new Menu().mainMenu(myBase);
            } else if (Checker.isDigit(input)) {
                int inputInt = Integer.parseInt(input);
                if (myBase.checkID(inputInt)) {
                    flag = true;
                    myBase.delEmployee(inputInt);
                    System.out.println("===========================");
                    System.out.println("Работник уволен");
                    new Menu().mainMenu(myBase);
                } else {
                    new Errors().noID();
                }
            } else {
                new Errors().noID();
            }
        }
    }
}