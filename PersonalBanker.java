package ByblosBank;

public class PersonalBanker extends ServDepEmployee {
    public PersonalBanker(String name, int salary, int IDnumber) {
        super(name, salary, IDnumber);
    }



    @Override
    public String toString() {
        return "PersonalBanker{" +
                "name='" + getEmployeeName() + '\'' +
                ",position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
