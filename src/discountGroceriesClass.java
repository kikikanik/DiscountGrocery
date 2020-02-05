import java.util.Scanner;

public class discountGroceriesClass {
	
	public static void main(String[] args) {
		double priceofGroceries = 1.00;
		double discountPercent = 0.0; 
		double discountDue = 1.00;
		
		Scanner in = new Scanner(System.in);
		int exitPlease = 1; 
		while(exitPlease != 0) {
		System.out.println("Thanks for shopping at Kiki's Groceries!"); //GREETING
		System.out.println("Please enter the cost of your groceries: "); //INPUT COMPLETE COST OF GROCERIES
		priceofGroceries= in.nextDouble(); 
		
		if (priceofGroceries < 10) //WHEN LESS THAN TEN DOLLARS ARE SPENT, NO DISCOUNT APPLIED
		{ 
			discountPercent = 0.0;
			discountDue = 0.0;
			System.out.println("No discount is given.");
		}
		else if (priceofGroceries <=60) //BETWEEN $10 AND $60 INCLUSIVE, 8% DISCOUNT APPLIED 
		{
			discountPercent = 00.08;
		}
		else if (priceofGroceries <=150) //BETWEEN $61 AND $150 INCLUSIVE, 10% DISCOUNT APPLIED
		{
			discountPercent = 00.10;
		}
		else if (priceofGroceries <=210) //BETWEEN $151 AND $210 INCLUSIVE, 12% DISCOUNT APPLIED 
		{	
			discountPercent = 00.12;
		}
		else if (priceofGroceries > 210) //MORE THAN $210, 14% DISCOUNT APPLIED
		{
			discountPercent = 00.14;
		}
		discountDue = discountPercent * priceofGroceries ; 
		System.out.println("You just saved "+ discountPercent + " of your purchase, which amounts to $" +String.format("%.2f",+ discountDue));
		System.out.println("Price with coupon $" + String.format("%.2f", (priceofGroceries - discountDue  ))) ;
		System.out.println( "If you would like to exit, enter 'Exit': ") ;
		// exitPlease= in.nextInt();
		if (in.next().equals("Exit")) {
			System.out.println("Program is now closed. Thank you for shopping with us!");
			exitPlease = 0;
		}
	}
		in.close();
}
}

