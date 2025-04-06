package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDAO{
    @Override
    public void create(String client, Employee employee) {
        System.out.println("Created new Row in Employee Table");
    }

    @Override
    public void delete(String client, int employeeID) {
        System.out.println("Deleted  row with EmployeeID :" + employeeID);
    }

    @Override
    public Employee get(String client, int employeeID) {
        System.out.println("fetching data from the DB");
        return new Employee(123, "rahul");
    }
}
