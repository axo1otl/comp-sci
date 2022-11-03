import java.util.Scanner;
public class Temps{
    public static void main (String[] args){
        final int HOURS_PER_DAY = 4;
        int temp, maxTemp = -10000, minTemp = 10000;
        String maxHour = "";
        String minHour = "";
        // a temperature reading
        Scanner scan = new Scanner(System.in);
        // print program heading
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period");
        System.out.println ();
        for (int hour = 0; hour < HOURS_PER_DAY; hour++){
            System.out.print ("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();
            if (temp > maxTemp){
                maxTemp = temp;
                maxHour = maxTemp + " degrees at hour " + hour;
            }
            if (temp < minTemp){
                minTemp = temp;
                minHour = minTemp + " degrees at hour " + hour;
            }
        }
        // Print the results
        System.out.println("Todays temperature had a high of " + maxHour + " and a low of " + minHour);
    }
}