package exercice4_serie_4;

public class Test {
	
	public static void main (String[] args) 
	{
		
		try {
			
			AdresseIP a1 = new AdresseIP(192, 168, 0, 1);
			System.out.println(a1.toString());
			
		} catch (AdresseIPException e) {
				
				System.out.println(e.getMessage());
				
		}
		
		
		try {
			
			AdresseIP a2 = new AdresseIP(192, 168, 0, 256);
			System.out.println(a2.toString());
			
		} catch (AdresseIPException e1) {
				
				System.out.println(e1.getMessage());
				
		}
		
	
		
		try {
			
			AdresseIP a3 = new AdresseIP(192, 168, 0, 255);
			System.out.println(a3.toString());
			
		} catch (AdresseIPException e2) {
				
				System.out.println(e2.getMessage());
				
		}
		
		
		try {
			
			AdresseIP a4 = new AdresseIP(192, 168, 0, -1);
			System.out.println(a4.toString());
			
		} catch (AdresseIPException e3) {
				
				System.out.println(e3.getMessage());
				
		}
		
		
	}
}
