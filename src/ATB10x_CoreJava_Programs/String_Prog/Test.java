package ATB10x_CoreJava_Programs.String_Prog;

class Employee{
    public int EmpId;
    public String EmpName;
    public Employee ReportingEmployee;

    // Constructor
    public Employee(int EmpId, String EmpName, Employee ReportingEmployee) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.ReportingEmployee = ReportingEmployee;
    }

    // Overloaded constructor for employees without a reporting manager
    public Employee(int EmpId, String EmpName) {
        this(EmpId, EmpName, null);
    }

    // Default constructor
    public Employee() {
        this(0, "Unknown", null);
    }

}
public class Test extends Employee {

    public static void main(String[] args) {

        Employee emp=new Employee(10, "Sandeep",
                        new Employee(8, "Amol",
                                new Employee(6,"Dinya",
                                        new Employee(2,"Rajesh",null))));


        Employee topEmployee = getTopEmployee(emp);
        System.out.println(topEmployee.EmpId+", "+topEmployee.EmpName+", "+topEmployee.ReportingEmployee);
    }

    public static Employee getTopEmployee(Employee emp){

/*        if(emp.ReportingEmployee !=null){
            //emp = emp.ReportingEmployee;
           getTopEmployee(emp.ReportingEmployee);
        }
        return  emp;*/

       while(emp.ReportingEmployee != null){
            emp = emp.ReportingEmployee;
      }

        return emp;
    }
}

