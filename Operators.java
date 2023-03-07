import java.util.Scanner;

public class Operators {
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first length");
        float length1 = scanner.nextFloat();
        System.out.println("please input second length");
        float length2 = scanner.nextFloat();
        System.out.println("please input third length");
        float length3 = scanner.nextFloat();

        if ( length1 == length2 && length1== length3 && length2 == length3){
            System.out.println("Triangle is equilateral" +length1+ " " +length2+ "" +length3);
        }else if(length1 == length2 && length1== length3 || length2 == length3 && length2== length1 || length3 == length1 && length3== length1){
                System.out.println("Triangle is Isosceles" +length1+ " " +length2+ "" +length3);

            }else if(length1 != length2 || length1!= length3 ) {
            System.out.println("Triangle is Scalene" + length1 + " " + length2 + "" + length3);


        }else {
            System.out.println("Triangle is Invalid" +length1+ " " +length2+ "" +length3);

        }

    }
    //Create a method which determines whether a car will be able to drive to the destination or not.
    // In case if car is not able to drive. Print out how much fuel does it need to fill the tank more to be able
    // to drive to the destination as well as how much will it cost. If it is able to drive to the destination
    // write how much fuel will it have left on the tank. Program has four parameters: distance to the destination,
    // how much fuel does the car have in the tank, car fuel usage per 100km and fuel price per liter.
    //Input (negative flow): 100 6 7 1.25
    //Output: Destination is in 100km. Car is not able to reach the destination. It needs 1 liter of fuel more.
    // It will cost 1.25.
    //Input (happy flow): 110 25 7 1.25
    //Output: Destination is in 110km. Car is able to reach the destination. It will have 17.3 liters of fuel left.

    public static void task6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the distance to the destination");
        float distanceToDestination = scanner.nextFloat();
        System.out.println("Please input the Fuel in the Tank");
        float FuelInTank = scanner.nextFloat();
        System.out.println("Please input the Fuel Usage Per 100 Km");
        float FuelUsagePer100Km = scanner.nextFloat();
        System.out.println("Please input the Fuel Price Per Litre");
        float FuelPricePerLitre = scanner.nextFloat();

        if (FuelInTank < FuelUsagePer100Km){

            if (distanceToDestination == 100f){
                float fuelRemaining = FuelUsagePer100Km - FuelInTank;
                float price = fuelRemaining * FuelPricePerLitre;
                System.out.println("Destination is in " +distanceToDestination+  " Car is not able to reach the destination.It needs " +fuelRemaining+ " liters of fuel. It will cost " +price);

            }else{
                float fuelRemaining = FuelUsagePer100Km - ((distanceToDestination/100f)* FuelUsagePer100Km);
                float price = fuelRemaining * FuelPricePerLitre;
                System.out.println("Destination is in " +distanceToDestination+  " Car is not able to reach the destination.It needs " +fuelRemaining+ " liters of fuel. It will cost " +price);

            }

            }
        else{
            float FuelUsed = (FuelUsagePer100Km/100f) * distanceToDestination;
            float remainingFuel = FuelInTank - FuelUsed;
            System.out.println("Destination is in " +distanceToDestination+  " Car is able to reach the destination.It will have " +remainingFuel+ " liters of fuel");

        }
    }
}
