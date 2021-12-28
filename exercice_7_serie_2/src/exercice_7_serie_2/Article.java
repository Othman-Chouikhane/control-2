package exercice_7_serie_2;

public class Article {
	
	double prix_achat;
	double prix_vente;
	String nom;
	String fournisseur;
	
	public Article()
	{
		
	}

	public Article(double pa , double pv , String n , String f)
	{
		prix_achat = pa;
		prix_vente = pv;
		nom = n;
		fournisseur = f;
	}
	
	public double calcule_taux()
	{
		return prix_vente - prix_achat;
	}
	
	public String ToString()
	{
		return "le prix de vente : " + prix_vente + " DH" + " | " + "le prix d'achat : " + prix_achat + " DH" + " | " + "le nom du produit : " + nom + " | " +  "le fournisseur : " + fournisseur ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
