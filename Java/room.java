public class room{
    protected int length;
    protected int breadth;

    public void setData(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public int area()
    {
        return(length*breadth);
    }
}
