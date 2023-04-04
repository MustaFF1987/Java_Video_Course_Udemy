package OOP;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.employeeName = "Pavel_Yu";
        employee1.employeeAge = 36;
        employee1.employeeDepartment = "IT";

        employee2.employeeName = "Max_Yu";
        employee2.employeeAge = 46;
        employee2.employeeDepartment = "IT";


        System.out.print("Employee1 " + employee1.employeeName);
        System.out.print(", Age " + employee1.employeeAge);
        System.out.print(", Department " + employee1.employeeDepartment);
        System.out.println(", New Salary: " + (int)employee1.increaseSalary(2000)+ "€");

        System.out.print("Employee2 " + employee2.employeeName);
        System.out.print(", Age " + employee2.employeeAge);
        System.out.print(", Department " + employee2.employeeDepartment);
        System.out.print(", New Salary: " + (int)employee2.increaseSalary(3000) + "€");
    }

}
