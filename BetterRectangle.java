import java.awt.*;
public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        setLocation(x,y);
        setSize(width,height);
    }
    public double getPerimeter()
    {
        double Perimeter=(super.getHeight()+super.getWidth())*2;
        return  Perimeter;
    }
    public double getArea()
    {
        double Area=super.getWidth()*super.getHeight();
        return Area;
    }
}


