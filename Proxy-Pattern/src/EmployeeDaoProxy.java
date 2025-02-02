public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        employeeDao=new EmployeeDaoImp();
    }
    @Override
    public void create() {
        //Validation
        employeeDao.create();
    }
}
