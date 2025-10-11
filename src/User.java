import java.util.Scanner;

public class User
{
	public static void main(String[] args)
	{
        System.out.println("NAME");
        UserInput();
    }

    public  static void UserInput()
    {
        Scanner scanner = new Scanner(System.in);
        // scanner.close();

        System.out.println("Enter your name:");
        String userName = scanner.next();
        int userNameLength=userName.length();
        System.out.println(userName + " is a nice name.");
        System.out.println("your name has :"+ userNameLength + " characters.");

        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        int nextAge = userAge*2;
        System.out.println(
                "you have  " + userAge + " years in another"+ userAge +"you will be" +
                        nextAge+" years old." );

        System.out.println("What is your height, "+ userName);
        double userHeight = scanner.nextDouble();
        System.out.println("your are " + userHeight + "m tall.");

        double averageMaleHeightDifference= userHeight - 1.75;
        double averageFemaleHeightDifference= userHeight - 1.62;
        System.out.println("The difference between your height and average is " );
        System.out.format("%.2fm is you are male.", averageMaleHeightDifference);
        System.out.format("%.2fm is you are female.", averageFemaleHeightDifference);
    }
}