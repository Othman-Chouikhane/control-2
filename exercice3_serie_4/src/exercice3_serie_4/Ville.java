package exercice3_serie_4;

public class Ville {
	
	String nom;
	int population;
	String pays;
	
	public Ville()
	{
		
	}
	
	public Ville(String nom , int population , String pays)
	{
		this.nom = nom;
		this.population = population;
		this.pays = pays;
	}
	
	
	public void population () throws PopulationException 
	{
		
		if (population <= 0 ) throw new PopulationException("La population doit �tre un nombre positif ");
		else 
			System.out.print("�a marche");
		
		
	} 
	

}
