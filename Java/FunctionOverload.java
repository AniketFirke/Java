import java.util.Scanner;

public class Perimeter {
    
    private int length;
    private int width;
    
    Perimeter ()
    {
        length = 0;
        width = 0;
    }
    
    public void setData ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Width");
        length = sc.nextInt();
        width = sc.nextInt();
    }
    
    public void setData (int l, int w)
    {
        length = l;
        width = w;
    }
    
    public int cal_Perimeter()
    {
        int peri = 2 * (length + width);
        return (peri);
    }
}

public class Example_FunctionOverLoad {

    public static void main(String[] args) {
        
        Perimeter p1 = new Perimeter();
        Perimeter p2 = new Perimeter();
        
        p1.setData();
        
        p2.setData(10, 20);
    
        System.out.println("Perimeter 1 = " + p1.cal_Perimeter());
        
        int peri2 = p2.cal_Perimeter();
        System.out.println("Perimeter 2 = " + peri2);        
       
    }
    
}
