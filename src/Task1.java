import java.util.Scanner;
    public class Task1
    {
        public static void main(String[] args)
        {
            //input c and compute f
            Scanner in = new Scanner(System.in);
            double cVal = 0;
            double fVal = 0;
            boolean done = false;
            String trash = "";

            //F = (C * 9/5) + 32;


            do
            {
                IO.print("Enter the C value to convert to F: ");

                if(in.hasNextDouble())
                {
                    cVal = in.nextDouble();
                    in.nextLine(); //Clear the newline from the buffer

                    fVal = cVal * 9.0/5 + 32;

                    IO.println("The celsius value " + cVal + "is equal to " + fVal + " in Fahrenheit.");
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    IO.println("You must enter a valid Celsius value, not: " + trash);
                    IO.println("Try again!");
                }
            }while (!done);


        }
    }

