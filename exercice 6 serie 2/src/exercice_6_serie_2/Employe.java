package exercice_6_serie_2;

import java.time.LocalDate;

public abstract class Employe {
	
	String nom;
	String prenom;
	int matricule;
	LocalDate datenaissance;
	
	public String getnom()
	{
		return nom;
	}
	
	public void setnom(String nouveaunom)
	{
		nom = nouveaunom;
	}
	
	public String getprenom()
	{
		return prenom;
	}
	
	public void setprenom(String nouveauprenom)
	{
		prenom = nouveauprenom;
	}
	
	public int getmatricule()
	{
		return matricule;
	}
	
	public void setmatricule(int nouveaumatricule)
	{
		matricule = nouveaumatricule;
	}
	
	public LocalDate getdatenaissance() 
	{
		return datenaissance;
	}
	
	public void setdatenaissance(LocalDate nouveaudatenaissance) 
	{
		datenaissance = nouveaudatenaissance;
	}
	
	
	public Employe()
	{
		
	} 
	
	public Employe(String nom, String prenom, int matricule ,LocalDate datenaissance)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.datenaissance = datenaissance;
	} 
	
	
	public String ToString()
	{
		return "nom : " + nom + " | " + "prenom : " + prenom + " | " + "matricule : " + matricule + " | " + "date de naissance" + datenaissance;
	}
	
	public abstract double getsalaire();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
