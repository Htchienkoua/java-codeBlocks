import java.util.Scanner;

public class Arithmetic {

    public static void task3(){
        int side = 5;

        int volume =  side * side * side;

        System.out.println("The volume of the cube is " +volume + "cm3");


        int perimeter = side * 12;

        System.out.println("The perimeter of the cube is " +perimeter+ "cm");
    }

    public static float feetToCm(float feet , float inches){
        float fullLength = feet * 12 + inches;
        return fullLength * 2.54f;
    }

    public static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input in feet");
        float feet = scanner.nextFloat();
        System.out.println("please input in inches");
        float inches = scanner.nextFloat();

        float result = Arithmetic.feetToCm(feet, inches);
        System.out.println( + feet + " feet and " + inches+ " inches = " +result+ "cm");
    }
}


