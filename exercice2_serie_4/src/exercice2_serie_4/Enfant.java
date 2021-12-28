package exercice2_serie_4;


public class Enfant {
	
	int age;
	
	
	public Enfant ()
	{
		
	}
	
	
	
	public void age(int age) throws AgeEnfantException 
	{
		this.age = age;
		if (age <= 1 || age >= 10 ) throw new AgeEnfantException ("[" + age + "]" + " ans n'est pas un âge valide !");
		else 
			System.out.print("bien");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
