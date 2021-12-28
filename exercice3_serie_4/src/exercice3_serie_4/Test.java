package exercice3_serie_4;

public class Test {
	
	public static void main (String [] args) 
	{
		Ville vv = new Ville("casa" , 12893434 , "maroc");
		Ville vvv = new Ville("rabat" , -12000404 , "maroc");
		
		
		try  
        {  
			vv.population();
			vvv.population();
        }  
        catch (PopulationException e)  
        {    
            System.out.println(e.getMessage());  
        } 
		
	}

}
