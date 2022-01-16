package ByblosBank;

public class Employee {
    private String employeeName;
    private int age ;
    private  int IDnumber;

    public Employee (String employeeName){

        this.employeeName= employeeName;
    }

    public Employee(){

    }
    public Employee(int IDnumber){
        this.IDnumber=IDnumber;
    }
    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    public String getEmployeeName() {

        return employeeName;
    }



    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setIDnumber(int IDnumber) {

        this.IDnumber = IDnumber;
    }

    public int getIDnumber() {

        return IDnumber;
    }


}
