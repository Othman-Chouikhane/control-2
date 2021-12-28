package exercice_7_serie_2;

import java.time.LocalDate;

public class ArticlesElectroménagers extends Article implements Produits,Solde {
	
	double voltage;
	String marque;
	LocalDate date_fin;
	
	public ArticlesElectroménagers()
	{
		
	}
	
	public ArticlesElectroménagers(double pa , double pv , String n , String f , double v , String m , LocalDate df)
	{
		super.prix_achat = pa;
		super.prix_vente = pv;
		super.nom = n;
		super.fournisseur = f;
		voltage = v;
		marque = m;
		date_fin = df;
	}
	
	
	public LocalDate Date_peremption()
	{
		return date_fin;
	}
	
	public int Jours_restants()
	{
		return LocalDate.now().getDayOfMonth() - date_fin.getDayOfMonth();
	}
	
	
	public double lancer_solde( int pourcentage)
	{
		return super.prix_vente - ((super.prix_vente * pourcentage) / 100);
	}
	
	public double terminer_solde(int pourcentage)
	{
		return super.prix_vente + ((super.prix_vente * pourcentage) / 100);
	}
	
	
	
	public String ToString()
	{
		return super.ToString() + " | " + "voltage" + voltage + " | " + "marque" + marque + " | " + "la date de fin : " + Date_peremption() + " | " + "il reste :" + Jours_restants() + "jour(s)" ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
