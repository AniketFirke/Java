public class basesalary extends employe
{
        double bsal;
	basesalary(String name,int id,double salary,double commissions,double earnings)
	{	
		super(name,id,salary,commissions);
		bsal=earnings;
	}
	public double earning()
	{
		return(bsal+super.earning());
	}
}