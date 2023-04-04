package OOP;

public class Employee {

    int employeeId;
    String employeeName;
    int employeeAge;
    double employeeSalary;
    String employeeDepartment;

    public Employee(int employeeId, String employeeName, int employeeAge, double employeeSalary, String employeeDepartment) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
    }

    double increaseSalary(){
    return (employeeSalary*2);
    }

}


