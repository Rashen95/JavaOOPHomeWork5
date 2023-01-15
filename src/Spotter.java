public class Spotter implements Checker {
    public void changeEmployee(EmployeeBase myBase) {
        boolean flag = false;
        while (!flag) {
            System.out.println("============================================================");
            System.out.println("Введите ID сотрудника или * для возврата в предыдущее меню: ");
            String input = new UserInput().input();
            if (input.equals("*")) {
                flag = true;
                new Menu().mainMenu(myBase);
            } else if (Checker.isDigit(input)) {
                int inputInt = Integer.parseInt(input);
                if (myBase.checkID(inputInt)) {
                    flag = true;
                    System.out.printf("""
                                    ====================
                                    Выбранный сотрудник:
                                    ID: %d
                                    FirstName: %s
                                    LastName: %s
                                    Salary: %d
                                    """, myBase.getEmployee(inputInt).getId(), myBase.getEmployee(inputInt).getFirstName(),
                            myBase.getEmployee(inputInt).getLastName(), myBase.getEmployee(inputInt).getSalary());
                    boolean flag1 = false;
                    while (!flag1) {
                        System.out.println("""
                                ===========================
                                1. Изменить имя
                                2. Изменить фамилию
                                3. Изменить зарплату
                                4. Вернуться к выбору сотрудника
                                5. Вернуться в главное меню
                                ===========================
                                """);
                        System.out.println("Выберите пункт меню: ");
                        switch (new UserInput().input()) {
                            case "1" -> {
                                System.out.println("==================");
                                System.out.println("Введите новое имя: ");
                                myBase.getEmployee(inputInt).setFirstName(new UserInput().input());
                                System.out.println("===========================");
                                System.out.println("Имя изменено");
                            }
                            case "2" -> {
                                System.out.println("======================");
                                System.out.println("Введите новую фамилию: ");
                                myBase.getEmployee(inputInt).setLastNameName(new UserInput().input());
                                System.out.println("===========================");
                                System.out.println("Фамилия изменена");
                            }
                            case "3" -> {
                                boolean flag2 = false;
                                while (!flag2) {
                                    System.out.println("=======================");
                                    System.out.println("Введите новую зарплату: ");
                                    String s = new UserInput().input();
                                    if (Checker.isDigit(s)) {
                                        flag2 = true;
                                        int sInt = Integer.parseInt(s);
                                        myBase.getEmployee(inputInt).setSalary(sInt);
                                        System.out.println("===========================");
                                        System.out.println("Зарплата изменена");
                                    } else {
                                        new Errors().salaryError();
                                    }
                                }
                            }
                            case "4" -> {
                                flag1 = true;
                                new Spotter().changeEmployee(myBase);
                            }
                            case "5" -> {
                                flag1 = true;
                                new Menu().mainMenu(myBase);
                            }
                            default -> new Errors().noMenuItem();
                        }
                    }
                } else {
                    new Errors().noID();
                }
            } else {
                new Errors().noID();
            }
        }
    }
}
