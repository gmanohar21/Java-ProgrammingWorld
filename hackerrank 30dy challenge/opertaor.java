import java.util.Scanner;
class opertaor {
	public static void main(String[] args) {
			System.out.println("enter cost");
		Scanner scn=new Scanner(System.in);
	    Double meal_cost=scn.nextDouble();
        int tip_percent=scn.nextInt();
        int tax_percent=scn.nextInt();
       


        Double tip =  meal_cost * tip_percent /100;

        Double tax =  meal_cost * tax_percent /100;

		Double total = meal_cost + tip +tax;

		int total_cost= (int) Math.round(meal_cost + tip +tax);

	    

		System.out.println("int meal_cost = " + meal_cost);
		
		System.out.println("int tip_percent = " + tip_percent);
		
		System.out.println("int tax_perceent = " + tax_percent);
		
		System.out.println("int total_cost = " + total_cost);

		


	}
}
