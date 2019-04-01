package staff;

public abstract class Employee {

    protected String name;
    protected String NI_number;
    protected Integer salary;


    public Employee(String name, String NI_number, Integer salary) {
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
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
}
