public class example_inheritancebasic{
    
    public static void main (String[]args){
        Bedroom b=new Bedroom();
        b.setData(20,15);
        b.setHeight(15);

        int area=b.area();
        int vol=b.volume();
        System.out.println("Area="+area);
        System.out.println("Volume="+vol);
    }
}