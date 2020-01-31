import java.util.Scanner;

public class discountGroceriesClass {

	public static void main(String[] args) {
		double priceofGroceries = 1.00;
		double discountPercent = 0.0; 
		double discountDue = 1.00;

		Scanner in = new Scanner(System.in);
		int exitPlease = 0; 
		while(exitPlease != 0) {
			exitPlease = in.nextInt();
		}
		System.out.println("Thanks for shopping at Kiki's Groceries!"); //GREETING
		System.out.println("Please enter the cost of your groceries: "); //INPUT COMPLETE COST OF GROCERIES
		priceofGroceries= in.nextDouble(); 
		
		if (priceofGroceries < 10) //WHEN LESS THAN TEN DOLLARS ARE SPENT, NO DISCOUNT APPLIED
		{ 
			System.out.println("No discount is given.");
		}
		else if (priceofGroceries <=60) //BETWEEN $10 AND $60 INCLUSIVE, 8% DISCOUNT APPLIED 
		{
			discountPercent = 00.08;
			discountDue = discountPercent * priceofGroceries ; 
			
		}
		else if (priceofGroceries <=150) //BETWEEN $61 AND $150 INCLUSIVE, 10% DISCOUNT APPLIED
		{
			discountPercent = 00.10;
			discountDue = discountPercent * priceofGroceries ;
		}
		else if (priceofGroceries <=210) //BETWEEN $151 AND $210 INCLUSIVE, 12% DISCOUNT APPLIED 
		{	
			discountPercent = 00.12;
			discountDue = discountPercent * priceofGroceries ;
		}
		else if (priceofGroceries > 210) //MORE THAN $210, 14% DISCOUNT APPLIED
		{
			discountPercent = 00.14;
			discountDue = discountPercent * priceofGroceries ;
		}
		System.out.println("New Price with coupon $" + String.format("%.2f", (priceofGroceries - discountDue  ))) ;
		System.out.println("You just saved "+ discountPercent + "% of your purchase, which amounts to $" + discountDue);
		System.out.println("Thank you for shopping with us! Have a nice day.");
		in.close();
	}

}
