package neuesProjekt1;

import java.io.IOException;
import java.util.Scanner;

public class euroDollarRechner {

	public static void main(String[] args) throws IOException {
		// declaration of unknown
		Scanner scan = new Scanner(System.in);
		int W�hrung;
		String W�hrung1;
		float euro;
		String euro1;
		float dollar;
		String dollar1;
		boolean again;
		String x;
		
		
		do {
			
			// decide Euro or Dollar
			System.out.println("W�hlen Sie 1 f�r Euro in Dollar oder 2 f�r Dollar in Euro aus:");
			W�hrung1 = scan.nextLine();
			W�hrung = Integer.parseInt(W�hrung1);

			// If Euro
			if (W�hrung == 1) {
				System.out.println("Geben Sie einen Betrag in Euro ein:");
				euro1 = scan.nextLine();
				euro = Float.parseFloat(euro1);
				System.out.println(euro * 1.34);
				System.out.println("Weiter Umrechnung ben�tigt? Ja/Nein");
				x = scan.nextLine();
				if (x.equals("J"))
						{
					again=true;
						}
				else if (x.equals("N"))
				{
					again=false;
				}
				else {
					again=false;
				}
				}
			
			// If Dollar
			else if (W�hrung == 2) {
				System.out.println("Geben Sie einen Betrag in Dollar ein:");
				dollar1 = scan.nextLine();
				dollar = Float.parseFloat(dollar1);
				System.out.println(dollar / 1.34);
				System.out.println("Weitere Umrechnung ben�tigt?");
				x = scan.nextLine();
				if (x.equals("J"))
						{
					again=true;
						}
				else if (x.equals("N"))
				{
					again=false;
				}
				else {
					again=false;
				}
			}
			// Else Error
			else {
				System.out.println("Error");
				 }
		}while(again=true);
	
	
	}
	}
