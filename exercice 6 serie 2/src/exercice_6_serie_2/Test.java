package exercice_6_serie_2;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args)
	{
		
	Employe o1= new Ouvrier("ali" , "ali" , 123 , LocalDate.of(1990, 1, 12) , LocalDate.of(2015, 2, 3));
	Employe c1= new Cadre("ahmed" , "ahmed" , 124 , LocalDate.of(1987, 1, 12), 2);
	Employe a1= new Associees("kawtar" , "kawtar" , 125 , LocalDate.of(1986, 2, 18) , 16 , 20 , 100000);
	
	
	
	
	

	System.out.println(o1.ToString() +  " | " + "salaire : " +  o1.getsalaire() + " DH");
	System.out.println("\n" + c1.ToString() +  " | " +  "salaire : " +  c1.getsalaire() + " DH" + "\n");
	System.out.println(a1.ToString() +  " | " +  "salaire : " +  a1.getsalaire() + " DH");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
