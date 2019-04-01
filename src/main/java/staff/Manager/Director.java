package staff.Manager;


public class Director extends Manager {

    private Integer budget;

    public Director(String name, String NI_number, Integer salary, String deptname, Integer budget){
        super(name, NI_number, salary, deptname);
        this.budget = budget;
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

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}
