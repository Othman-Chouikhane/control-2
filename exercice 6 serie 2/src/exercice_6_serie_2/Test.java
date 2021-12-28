package exercice_6_serie_2;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args)
	{
		
	Employe o1= new Ouvrier("amine" , "amine" , 11 , LocalDate.of(1992, 11, 13) , LocalDate.of(2013, 12, 13));
	Employe c1= new Cadre("kamal" , "kamal" , 12, LocalDate.of(1979, 1, 12), 2);
	Employe a1= new Associees("nihal" , "nihal" , 13 , LocalDate.of(1990, 3, 8) , 26 , 23 , 150000);
	
	
	
	
	

	System.out.println(o1.ToString() +  " | " + "salaire : " +  o1.getsalaire() + " DH");
	System.out.println("\n" + c1.ToString() +  " | " +  "salaire : " +  c1.getsalaire() + " DH" + "\n");
	System.out.println(a1.ToString() +  " | " +  "salaire : " +  a1.getsalaire() + " DH");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
