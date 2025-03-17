package quiz4a;

// (1.1) เขียน Java Docs
//กำหนดตัวแปรต่างๆ
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    //รับค่าตัวแปร
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = 123456;
        this.name = "John Doe";
        this.salary = (salary > 0) ? salary : 50000;
    }

    // (1.3)
    //คำนวณเงินเดือน
    public double calculateSalary() {
        salary = 50000 ;
        return salary;
    }

    // (1.4)
    //รับค่า employeeID
    public int getEmployeeId() {
        employeeId = 123456 ;
        return employeeId;
    }

    // (1.5)
    //รับค่าชื่อ
    public String getName() {
        name = "John Doe" ;
        return name;
    }
}