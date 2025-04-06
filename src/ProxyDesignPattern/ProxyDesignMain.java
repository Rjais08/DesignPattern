package ProxyDesignPattern;

public class ProxyDesignMain {
    public static void main(String[] args) throws Exception {
        try {
            EmployeeDAO employeeDAOObj = new EmployeeDaoProxy();
            employeeDAOObj.create("ADMIN", new Employee(123, "rahul"));
            employeeDAOObj.delete("USER : ", 123);
            employeeDAOObj.get("ADMIN", 123);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
