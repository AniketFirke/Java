public class Bedroom extends room{
    private int height;
    public void setHeight(int h)
    {
        height=h;
    } 
    int volume(){
        return(length*breadth*height);
    }
    }