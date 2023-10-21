public class employe
{
	protected String empname;
	protected int empid;
	protected double grosssalary;
	protected double commission;
	
	employe(String name,int id,double salary,double commissions)
	{
		empname=name;
		empid=id;
		grosssalary=salary;
		commission=commissions;
	}
public double earning()
{
	return(grosssalary*commission);
}

}