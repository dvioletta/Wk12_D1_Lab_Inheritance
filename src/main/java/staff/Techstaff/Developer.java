package staff.Techstaff;

import staff.Employee;

public
class Developer extends Employee {

    public Developer(String name, String NI_nunber, Integer salary) {
        super(name, NI_nunber, salary);
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getNI_number () {
        return NI_number;
    }

    public void setNI_number (String NI_number){
        this.NI_number = NI_number;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary ( int salary){
        this.salary = salary;
    }

    public double raiseSalary ( double raiseMultiplier){
        return this.salary * raiseMultiplier;
    }

    public double payBonus ( double payBonusMultiplier){
        return this.salary * payBonusMultiplier;
    }


}
