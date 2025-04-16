public class ParttimeEmployee extends Employee {
    private int time;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(int id, String name, int age, int phone, String email, int time) {
        super(id, name, age, phone, email);
        this.time = time;
    }

    @Override
    public double SalaryCalculator() {
        return time * 100000;
    }

    public String toString() {
        return super.toString() + " ParttimeEmployee " + SalaryCalculator();
    }

}
