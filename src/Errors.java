public class Errors {
    public void noMenuItem() {
        System.out.println("========================================");
        System.out.println("         Такого пункта меню нет         ");
    }

    public void noID() {
        System.out.println("========================================");
        System.out.println("        Нет сотрудника с таким ID       ");
        System.out.println("========================================");
    }

    public void salaryError() {
        System.out.println("========================================");
        System.out.println("   Зарплата должна быть целым числом    ");
        System.out.println("========================================");
    }
}
