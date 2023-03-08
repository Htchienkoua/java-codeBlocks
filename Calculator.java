//Create class named Calculator in the same package as before with main method to execute your program.
//Task:
//Using what you have learned create a calculator which will calculate figures perimeter and area.
// You must use switch statement for choosing a figure. Program should run as long as you want to continue using calculator.
// This means that after calculations are done it must ask if you want to run it again.
// You must check whether input values are correct if not write an error message that values were incorrect.
// Calculator must be able to calculate Triangle, Rectangle and Square perimeter and area.
//Input (happy flow): Rectangle 5 7
//Output: Rectangle perimeter is 24 and area is 35.
//Input (negative flow): Rectangle 0 7
//Output: Rectangle edge length can’t be 0.

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Calculator {

    public static void task10(){

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the value(three options: rectangle, triangle and square ");
            String shape = scanner.nextLine();

            switch (shape){
                case "rectangle":
                    //code for rectangle perimeter and area
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Please input the length value ");
                    int length = scanner2.nextInt();
                    System.out.println("Please input the width value ");
                    int width = scanner2.nextInt();

                    if(length ==0 || width ==0){
                        System.out.println("Please don't insert an zeros ");
                    }else {
                        int perimeter = (length + width) * 2;
                        int area = length * width;
                        System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area );

                    }

                    break;
                case "square":
                    //code for square perimeter and area
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Please input the side value ");
                    int side = scanner3.nextInt();

                    if(side ==0){
                        System.out.println("Please don't insert an zeros ");
                    }else {
                        int perimeter = side * 4;
                        int area = side * side;
                        System.out.println("Square perimeter is " + perimeter + " and area is " + area );

                    }

                    break;
                case "triangle":
                    //code for triangle perimeter and area
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Please input the base value ");
                    float base = scanner4.nextFloat();
                    System.out.println("Please input the height value ");
                    float height = scanner4.nextFloat();

                    if(base ==0 || height ==0){
                        System.out.println("Please don't insert an zeros ");
                    }else {
                        float hypotenusSquared = (base * base) + (height * height);
                        float hypotenus = (float) sqrt(hypotenusSquared);
                        float perimeter = (base + height) + hypotenus;
                        float area = (base * 0.5f) * height;
                        System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area );

                    }
                    break;
                default:
                    System.out.println("Can't recognise the shape, please insert a valid shape option");
            }
        }

    }
}
