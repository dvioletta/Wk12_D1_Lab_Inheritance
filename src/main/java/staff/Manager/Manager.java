package staff.Manager;

import staff.Employee;

public class Manager extends Employee {

    protected String deptname;

    public Manager(String name, String NI_nunber, Integer salary, String deptname){
        super(name, NI_nunber, salary);
        this.deptname = deptname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI_number() {
        return NI_number;
    }

    public void setNI_number(String NI_number) {
        this.NI_number = NI_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double raiseSalary(double raiseMultiplier){
        return this.salary * raiseMultiplier;
    }

    public double payBonus(double payBonusMultiplier){
        return this.salary * payBonusMultiplier;
    }


    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
