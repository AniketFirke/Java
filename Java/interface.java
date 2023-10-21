 interface Payable
{
    double getpayment();
}

class Invoice implements Payable
{
    private String partno;
    private String partDesc;
    private int qty;
    private double rateperunit;
    Invoice (String part, String Desc, int q ,double rate)
    {
        partno = part;
        partDesc=Desc;
        qty = q;
        rateperunit = rate;
    }
    public String toString()
    {
        return String.format("%s:%s\n%s:%s\n%s:%d\n%s:%2f","PartNo",partno,"PartDesc",partDesc,"Quantity",qty,"RateperUnit",rateperunit);
    }
    public double getpayment()
    {
        double pay = (double) qty * rateperunit;
        return(pay);
    }
}
public class TestInv
{
    public static void main(String[]args)
    {
        Invoice inv1 = new Invoice("P118","Aniket",100,150);
        System.out.println("Invoice details:\n"+inv1);
        System.out.println("Inv Amount = "+inv1.getpayment());
    }
}