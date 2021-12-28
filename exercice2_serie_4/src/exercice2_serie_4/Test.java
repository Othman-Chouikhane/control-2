package exercice2_serie_4;



public class Test {
	
	public static void main (String [] args)
	{
		
		Enfant a = new Enfant();
		Enfant b = new Enfant();
		
		try  
        {  
            a.age(12);
            b.age(2);
        }  
        catch (AgeEnfantException e1)  
        {    
            System.out.println(e1.getMessage());  
        }  
		
		
	}

}
