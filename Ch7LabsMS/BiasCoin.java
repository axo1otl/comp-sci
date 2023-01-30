import java.text.NumberFormat;

public class BiasCoin
{
    private double face;
    public double bias;
    NumberFormat num = NumberFormat.getPercentInstance(); // new number format as 0.00

    // ---------------------------------------------
    //   Sets up the coin by flipping it initially.
    // ---------------------------------------------
    public BiasCoin ()
    {
        bias = 0.5;
	    flip();
    }

    // -----------------------------------------------
    //   Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip(){
	    face = Math.random() * 2;
        System.out.println(face);
    }

    public void setBias(double in){
        if (in >= 0 && in <= 1){
            bias = in;
            System.out.print("Bias = " + bias + " ");
            System.out.println("( heads ~ " + num.format(bias) + " | tails ~ " + num.format(1 - bias) + " )");
        }
        else{
            System.out.println("[ERROR] Bias invalid!");
            System.out.println("[     ] Setting bias to 0.5");
            bias = 0.5;
        }
    }

    // -----------------------------------------------------
    //   Returns the current face of the coin as an integer.
    // -----------------------------------------------------
    public int getFace()
    {
	return ((int) face);
    }

    // ----------------------------------------------------
    //   Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString()
    {
	String faceName;

	if (face <= (bias * 2))
	    faceName = "Heads";
	else
	    faceName = "Tails";

	return faceName;
    }
}
