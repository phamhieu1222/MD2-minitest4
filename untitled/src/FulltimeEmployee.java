public class FulltimeEmployee extends Employee {
    private double fine, bonus, salary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int id, String name, int age, int phone, String email, double fine, double bonus, double salary) {
        super(id, name, age, phone, email);
        this.fine = fine;
        this.bonus = bonus;
        this.salary = salary;
    }

    @Override
    public double SalaryCalculator() {
        return salary - fine + bonus;
    }

public String toString(){
    return super.toString() + " FulltimeEmployee " + SalaryCalculator() ;
}
}
