package ByblosBank;

public class Main {
    public static void main(String[] args) {

        Branches Branch = new Branches("Komitas", "Komitas38/2",
                "060616104", 904);
        System.out.println(Branch);
        Employee employee = new Employee("David");
        ServDepEmployee servDepEmployee = new ServDepEmployee("Tatev","Developer",500000);
        servDepEmployee.setEmployeeName("Mariam");
        System.out.println(servDepEmployee.getEmployeeName());
        servDepEmployee.setSalary(250000);
        System.out.println(servDepEmployee.getSalary());
        System.out.println(servDepEmployee);
        PersonalBanker personalBanker = new PersonalBanker("Melanya", 300000, 0067);
        System.out.println(personalBanker);
    }
}
