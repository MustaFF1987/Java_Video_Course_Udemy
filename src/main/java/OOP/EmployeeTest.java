package OOP;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(123,"Pavel_Yu", 36, 1500,"IT");
        Employee employee2 = new Employee(456,"Max_Wu", 45,3250, "IT");


        System.out.println("1st Employee's name is " + employee1.employeeName +" "+ "and his new salary is " + employee1.increaseSalary()+"€");
        System.out.println("2nd Employee's name is " + employee2.employeeName +" "+ "and his new salary is " + employee2.increaseSalary()+"€");


    }

}
