import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner in =  new Scanner(System.in);

        double mpg = 0;
        double capacity = 0;
        double costPerGallon = 0;
        double cost100 = 0;
        double totalMiles = 0;
        boolean done = false;
        String trash = "";

        do
        {
            IO.print("Enter the miles per gallon : ");

            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();

                done = true;

            }else
            {
                trash = in.nextLine();
                IO.println("You must enetr a valid miles per gallon not: " + trash);
            }
        }while (!done);

        done = false;

        do
        {
            IO.print("Enter the capacity: ");

            if(in.hasNextDouble())
            {
                capacity = in.nextDouble();
                in.nextLine();

                done = true;
            }else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid tank capacity not: " + trash);
            }
        }while (!done);

        done = false;

        do
        {
            IO.print("Enter the cost per gallon: ");

            if(in.hasNextDouble())
            {
                costPerGallon = in.nextDouble();
                in.nextLine();

                done = true;
            }else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid cost per gallon not: " + trash);
            }
        }while (!done);

        IO.println("The price per gallon is: " + costPerGallon);

        cost100 = 100 / mpg + costPerGallon;
        totalMiles = capacity + mpg;

        IO.println("the cost to go 100 miles is " + cost100);
        IO.println("The total miles on a full tank is " + totalMiles);

    }
}
