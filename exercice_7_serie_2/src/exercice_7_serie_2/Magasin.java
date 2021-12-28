package exercice_7_serie_2;

public class Magasin {
	
	Article qte [];
	ArticlesElectroménagers nbr_piece [];
	Primeurs kilo[];
	
	int Produits_vendus;
	int Produits_stock;
	
	public Magasin()
	{
		
	}
	
	public Magasin( Article q [] , ArticlesElectroménagers np [] , Primeurs k[] , int pv , int ps)
	{
		qte = q;
		nbr_piece = np;
		kilo = k;
		Produits_vendus = pv;
		Produits_stock = ps;
	}
	
	
	public String Vendre_articles()
	{
		return "le nom : " + " | " + super.nom + " | " + "qte : " + qte;
	}
	
	
	
	
	
	
	
	 
	
	
	
}
