package ProxyDesignPattern;

public interface EmployeeDAO {
    void create(String client, Employee employee) throws Exception;
    void delete(String client, int employeeID) throws Exception;
    Employee get(String client, int employeeID);
}
