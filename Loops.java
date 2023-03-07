import java.util.Scanner;

public class Loops {
    //Create class named Loops in the same package as before with main method to execute your program.
    //Task:
    //Create a method which calculates how many hours and minutes are in one year (365 days).
    // You must use for loop to get the answer. You can’t just multiply days and hours.
    // Only one input is required days per year.
    //Input: 365
    //Output: There are 8760 hours or 525600 minutes in one year.
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount of days in the year");
        int daysInYear = scanner.nextInt();

        int i ;
        int hourInYear = 0;
        for(i =1; i<=daysInYear; i++){
          hourInYear = hourInYear + 24;
        }
        int minInYear = hourInYear * 60;
        System.out.println("There are " +hourInYear+ " hours or " +minInYear+ " minutes in one year");

    }
//sane as task 7 but with the while loop
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount of days in the year");
        int daysInYear = scanner.nextInt();

        int i = 1;
        int hourInYear = 0;
        while(i<=daysInYear){
            hourInYear = hourInYear + 24;
            i++;
        }
        int minInYear = hourInYear * 60;
        System.out.println("There are " +hourInYear+ " hours or " +minInYear+ " minutes in one year");

    }

    public static void task9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the value ");
        int value = scanner.nextInt();

        int i ;
        int finalValue = 1;
        for( i = 1; i <=value; i++){
            finalValue = finalValue * i;
        }
        System.out.println("Factorial of number " + value + " is " +finalValue);

    }
}
