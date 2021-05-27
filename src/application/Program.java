package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data:");
		System.out.print("Car Model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/mm/yyy hh:ss: ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/mm/yyy hh:ss: ");
		Date finish = sdf.parse(sc.nextLine());
		
		
		
		
		
		
		
		
				
		sc.close();
	}

}
