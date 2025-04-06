package ProxyDesignPattern;

public class Employee {

   private int employeeID;
   private String name;

   public Employee(){}

    public Employee( int employeeid, String name) {
            this.employeeID = employeeid;
            this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
