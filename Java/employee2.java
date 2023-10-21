public class employee
{
    protected String empname;
    protected int empid;
    protected double grosssalary;
    protected double commission;
     employee(String name, int id, double salary,double commission)
     {
        empname=name;
        empid=id;
        grosssalary=salary;
        commission=commission;

     }
     public double earning()
     {
        return(grosssalary*commission);
    }
    public static void main(String[] args){}
}
public class employe
{
    protected String empname;
    protected int empid;
    protected double grosssalary;
    protected double commission;
    employe(String name, int id, double salary, double commissions)
    {
        empname-name;
        empideid;
        grosssalary salary;
        commission commissions;
    }
    public double earning()
    {
        return(grosssalary commission);
    }
}
public class basesalary extends exploye
{
    double bsal;
    basesalary(String name,int id,double salary,double commissions,double earninds)
    {
        super(name,id,salary,comissionns);
        bsal=earning;
    }
    public double earning()
    {
        return(bsal+super.earning())
    }
}