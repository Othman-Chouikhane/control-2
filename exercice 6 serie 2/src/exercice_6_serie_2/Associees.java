package exercice_6_serie_2;

import java.time.LocalDate;

public class Associees extends Employe{
	
	
	int chiffre_affaire;
	int x;
	double BN_societe;
	
	public int getchiffre_affaire()
	{
		return chiffre_affaire;
	}
	public void setchiffre_affaire(int new_chiffre_affaire)
	{
		chiffre_affaire = new_chiffre_affaire;
	}
	
	public int getx()
	{
		return x;
	}
	public void setx(int new_x)
	{
		x = new_x;
	}
	
	public double getBN_societe()
	{
		return BN_societe;
	}
	public void setBN_societe(int new_BN_societe)
	{
		BN_societe = new_BN_societe;
	}
	
	public Associees()
	{
		
	}
	
	public Associees(String n , String p, int m, LocalDate dn ,int chiffre_affaire ,int x , double BN_societe)
	{
		super.nom = n;
		super.prenom = p;
		super.matricule = m;
		super.datenaissance = dn;
		this.chiffre_affaire = chiffre_affaire;
		this.x = x;
		this.BN_societe = BN_societe;
	}
	
	public String ToString()
	{
		return super.ToString() +" | " + "chiffre affaire : " + chiffre_affaire +" | " + "porcentage : " + x + "%" + " | " + "bénéficenet de la société : " + BN_societe + " DH";
	}
	
	public double getsalaire()
	{
		double salaire;
		salaire = (BN_societe * x) / 100;
		return salaire;
				
	}
	
	
	
	

}
