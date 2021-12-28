package exercice3_serie_4;

public class Test {
	
	public static void main (String [] args) 
	{
		Ville v1 = new Ville("casa" , 1289000 , "maroc");
		Ville v2 = new Ville("rabat" , -12345 , "maroc");
		
		
		try  
        {  
			v1.population();
			v2.population();
        }  
        catch (PopulationException e)  
        {    
            System.out.println(e.getMessage());  
        } 
		
	}

}
