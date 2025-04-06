package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDAO{

    EmployeeDAO employeeDAOObj;

    EmployeeDaoProxy(){
        employeeDAOObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
            if(client.equals("ADMIN")){
                employeeDAOObj.create(client, employee);
            }else{
                throw new Exception("Access Denied");
            }
    }

    @Override
    public void delete(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAOObj.delete(client, employeeID);
        }else{
            throw new Exception("Access Denied for usertype" + client);
        }

    }

    @Override
    public Employee get(String client, int employeeID) {
        return employeeDAOObj.get(client, employeeID);
    }
}
