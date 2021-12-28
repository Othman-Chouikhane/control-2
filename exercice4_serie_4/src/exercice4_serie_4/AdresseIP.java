package exercice4_serie_4;

public class AdresseIP {
	
	private int[] octets;
	private String classe;

	public AdresseIP (int o1,int o2, int o3, int o4) throws AdresseIPException
	{
		octets = new int[] {o1,o2,o3,o4}; 
		for (int i=0 ; i<=3 ; i++ ) 
		{
			if (octets[i] < 0 || octets[i] > 255 ) throw new AdresseIPException("adresse ip non valide");
		}
		
	}

	public String toString(){
		return octets[0] + "." + octets[1] + "." + octets[2] + "."+ octets[3] ; 
	}
	
	

}
