public class Menu {
    public void initMenu() {
        System.out.println("========================================");
        System.out.println(" Вы зашли в базу работников предприятия ");
        EmployeeBase myBase = new EmployeeBaseInit().init();
        mainMenu(myBase);
    }

    public void mainMenu(EmployeeBase myBase) {
        boolean flag = false;
        while (!flag) {
            System.out.print("""
                    ========================================
                    1. Вывести информацию о всех сотрудниках
                    2. Откорректировать данные сотрудника
                    3. Уволить сотрудника
                    4. Добавить сотрудника
                    5. Завершить работу базы
                    ========================================
                    """);
            System.out.println("Выберите пункт меню: ");
            switch (new UserInput().input()) {
                case "1" -> myBase.getBase();
                case "2" -> {
                    flag = true;
                    new Spotter().changeEmployee(myBase);
                }
                case "3" -> {
                    flag = true;
                    new DelEmployee().del(myBase);
                }
                case "4" -> {
                    flag = true;
                    new AddEmployee().add(myBase);
                }
                case "5" -> {
                    flag = true;
                    new CloseApp().close();
                }
                default -> new Errors().noMenuItem();
            }
        }
    }
}
