package ByblosBank;

public class ServDepEmployee  extends Employee{
    private String position ;
    private int salary;
    public ServDepEmployee( String employeeName , String position, int salary){
        super(employeeName);
        this.position=position;
        this.salary= salary;
    }
    public ServDepEmployee(){

    }
    public ServDepEmployee( String employeeName , int salary, int IDnuber){
        super(employeeName);
        this.salary= salary;
        super(IDnumber);

    }
    public ServDepEmployee( String employeeName ,  int IDnuber){
        super(employeeName,IDnumber);

    }

    @Override
    public String toString() {
        return "ServDepEmployee{" +
                "name='" + getEmployeeName() +'\''+
                ",position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public String getPosition() {

        return position;
    }
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("incorrect value");
        }
    }

    public int getSalary() {
        return salary;
    }
}

