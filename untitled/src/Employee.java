public abstract class Employee {
    private String name, email;
    private int id, age, phone;

    public Employee() {

    }

    public Employee(int id, String name, int age, int phone, String email) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    public double SalaryCalculator() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + " id: " + id+ "email" + email + " age" + age + " phone" + phone;
    }
}
