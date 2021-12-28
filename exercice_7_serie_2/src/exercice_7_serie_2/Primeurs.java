package exercice_7_serie_2;

import java.time.LocalDate;

public class Primeurs extends Article implements Produits,Solde  {
	
	
	LocalDate date_peremption;
	
	public Primeurs()
	{
		
	}
	
	public Primeurs(double pa , double pv , String n , String f , double v , String m ,LocalDate date_peremption)
	{
		super.prix_achat = pa;
		super.prix_vente = pv;
		super.nom = n;
		super.fournisseur = f;
		this.date_peremption = date_peremption;
	}
	
	
	
	public LocalDate Date_peremption()
	{
		return date_peremption;
	}
	
	public int Jours_restants()
	{
		return LocalDate.now().getDayOfMonth() - date_peremption.getDayOfMonth();
	}
	
	
	public double lancer_solde( int pourcentage)
	{
		double solde;
		if (Jours_restants() >=7)
			solde = super.prix_vente - ((super.prix_vente * pourcentage) / 100);
		else 
			solde = super.prix_vente;
		return solde;
	}
	
	public double terminer_solde(int pourcentage)
	{
		double solde;
		if (Jours_restants() <7)
			solde = super.prix_vente + ((super.prix_vente * pourcentage) / 100);
		else 
			solde = super.prix_vente;
		return solde;
	}
	
	
	
	
	public String ToString()
	{
		return super.ToString() + " | " + "la date de fin : " + Date_peremption() + " | " + "il reste :" + Jours_restants() + "jour(s)" ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
