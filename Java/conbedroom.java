class conbedroom extends conroom{
    private int height;
    conbedroom(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    int volume(){
        return(length*breadth*height);
    }
    }
