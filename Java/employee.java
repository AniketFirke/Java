interface Payable
{
    double getpayment();
}
class Employee
{
    private String empname;
    private String empID;
    weeklysalary = sal;
    
    Employee (String name,String ID,doublesal)
    {
        empname = name;
        empID = ID;
        weeklysalary =sal;
    }

public String toString()
    {
        return String.format("%s:%s\n%s:%s\n%s:%d\n%s:%2f","EmployeeName", empname,"EmployeeID",empID,"weeklysalary",weeklysalary);
    }
    public double getpayment()
    {
        return weeklysalary;
    }
}
public class TestInv
{
    public static void main(String[]args)
    {
      payable[]objects = new payable[];
      object[0] = new Invoice("p112","Affan",100,205.0f);
      object[1] = new Invoice("p117","Akshay",200,1500f);
      object[2] = new Employee ("Aniket","Emp1",500000f);
      object[3] = new Employee ("Rohan","Emp2",20000f);
      for(payable currentobj:objects)
      {
          System.out
      }
    }
}