import java.util.*;

class PrintUsingWhile
{

	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
         int luckyNumber = 7;
		 int numberEntered=0;
		 while(luckyNumber !=numberEntered)
		 {
		  
		 System.out.println(" Please guess the number!");
		 
		 numberEntered = sc.nextInt();
		 if(numberEntered == luckyNumber)
		 {
			System.out.println("  Congratulation!!, you won!"); 
		 }
		 else
		 {
			 System.out.println("You just missed it, Try again"); 
		 }
		 		 
		 }  

	}

}