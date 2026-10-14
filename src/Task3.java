import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double area = 0;
        double width =0;
        double height = 0;
        boolean done = false;
        double perimeter = 2 * width * 2 * height;
        double hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        String trash = "";

        do
        {
            IO.print("Enter the width of the rectangle: ");

            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();

                done = true;
            } else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid number: " + trash);
            }
        }while (!done);

        done = false;

        do
        {
            IO.print("Enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();

                done = true;
            }else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid number: " + trash);
            }while (!done);

            area = width * height;
            perimeter = 2 * width * 2 * height;
            hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

            IO.println("The area is " + area);
            IO.println("The perimeter is " + perimeter);
            IO.println("The hypotenuse is " + hypotenuse);

        }while(!done);
    }







}
