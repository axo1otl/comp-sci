import java.util.Scanner;

public class Dates{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month, day, year; //date read in from user
        int daysInMonth;
        boolean monthValid, dayValid, yearValid, leapYear;
        
        //Get integer month, day, and year from user
        System.out.print("Enter Month: ");
        month = scan.nextInt();
        System.out.print("Enter Day: ");
        day = scan.nextInt();
        System.out.print("Enter Year: ");
        year = scan.nextInt();
        
        //Check to see if month is valid
        if (month > 0 && month <= 12){
            monthValid = true;
        }
        else{
            monthValid = false;
        }
        //Check to see if year is valid
        if (year >= 1000 && year <= 1999){
            yearValid = true;
        }
        else{
            yearValid = false;
        }
        //Determine whether it's a leap year
        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    leapYear = true;
                }
                else{
                    leapYear = false;
                }
            }
            else{
                leapYear = true;
            }
        }
        else{
            leapYear = false;
        }
        //Determine number of days in month
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            daysInMonth = 31;
        }
        else if (month==4 || month==6 || month==9 || month==11){
            daysInMonth = 30;
        }
        else if (month == 2 && leapYear == true){
            daysInMonth = 29;
        }
        else if (month == 2 && leapYear == false){
            daysInMonth = 28;
        }
        else{
            daysInMonth = 0;
        }
        if (day <= daysInMonth){
            dayValid = true;
        }
        else{
            dayValid = false;
        }
        if (dayValid == true && monthValid == true && yearValid == true){
            System.out.println("Date is valid");
            if (leapYear == true){
                System.out.println("It is a leap year!");
            }
        }
        else{
            System.out.println("Date is not valid");
        }
        //User number of days in month to check to see if day is valid
        //Determine whether date is valid and print appropriate message
    }
}