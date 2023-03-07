import java.util.Scanner;

public class Basics {


    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your name");
        String name = scanner.nextLine();
        System.out.println("Please input your surname");
        String surname = scanner.nextLine();
        System.out.println("Please input your age ");
        String age = scanner.nextLine();

        System.out.println("My name is " + name + "my surname is " + surname + "and my age is " + age + ".I am attending IT & Data Academy 2023!");
    }

    public static void task2(){
        String letter1 = "H";
        int number1 = 3110;
        String letter2 = " w";
        int number3 = 0;
        String letter3 = "r";
        int number4 = 1;
        String letter4 = "d ";
        float number5 = 2.0F;
        boolean firstTrue = true;

        System.out.println(  letter1 + "" +number1+ "" +letter2+ "" +number3+ "" +letter3+ "" +number4+ "" +letter4+ "" +number5+ "" + firstTrue);

    }




}
