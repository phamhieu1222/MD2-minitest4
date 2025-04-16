import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParttimeEmployee p1 = new ParttimeEmployee(1, "A", 12, 123456789, "a@gmail.com", 5);
        ParttimeEmployee p2 = new ParttimeEmployee(2, "B", 12, 123226789, "b@gmail.com", 6);
        ParttimeEmployee p3 = new ParttimeEmployee(3, "C", 12, 123756789, "c@gmail.com", 7);
        FulltimeEmployee f1 = new FulltimeEmployee(4, "D", 14, 51165151, "d@gmail.com", 5000, 4000, 45000);
        FulltimeEmployee f2 = new FulltimeEmployee(5, "E", 12, 25151851, "e@gmail.com", 5100, 5000, 60000);
        FulltimeEmployee f3 = new FulltimeEmployee(6, "F", 15, 25159951, "e@gmail.com", 5200, 5600, 50000);
        Employee[] employees = new Employee[]{p1, p2, p3, f1, f2, f3};
        int n = employees.length;


        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += employees[i].SalaryCalculator();
        }
        double avg = sum / n;
        System.out.println("Average Salary: " + avg);


        System.out.println("\nFulltime Employees under average salary: ");
        for (int i = 0; i < n; i++) {
            if (employees[i] instanceof FulltimeEmployee && employees[i].SalaryCalculator() < avg) {
                System.out.println(employees[i]);
            }
        }


        double totalpart = 0;
        for (int i = 0; i < n; i++) {
            if (employees[i] instanceof ParttimeEmployee) {
                totalpart += employees[i].SalaryCalculator();
            }
        }
        System.out.println("\n💰 Total Partime salary: " + totalpart);


        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (employees[i] instanceof FulltimeEmployee &&
                        employees[j] instanceof FulltimeEmployee &&
                        employees[i].SalaryCalculator() > employees[j].SalaryCalculator()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("\nlist Fulltime Employees base on average salary: ");
        for (int i = 0; i < n; i++) {
            if (employees[i] instanceof FulltimeEmployee) {
                System.out.println(employees[i]);
            }
        }

    }
}
