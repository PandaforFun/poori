class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployeeSalary() {
        return String.format("₹%.2f", employee_salary);
    }

    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Jack Sparrow");
        emp.setEmployeeSalary(75000.50);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());
    }
}
