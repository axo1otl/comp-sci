public class Balloon1B
{
    //instance variables:
    private String color ;
    private int radius;
    private String name;
    //dfault constructor for objects of class Balloon
    public Balloon1B()
    {
        //initialize instance variables
        color = "";
        radius = 0;
        name = "";       
    }
    //other constructor
    public Balloon1B(String c, int r, String n)
    {
        color = c;
        radius = r;
        name = n;
    }

    public void myColor()
    {
        System.out.println("The color of my balloon is: " + color);
    }

    public void deflate()
    {
        radius = 0;
    }

    public void myName()
    {
        System.out.println("The name of my balloon is: " + name);
    }

    public String toString()
    {
        return "Name: " + name + "\n color: " + color + "\n radius: " + radius;
    }
}