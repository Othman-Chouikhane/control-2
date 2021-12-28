package exercice_6_serie_2;

import java.time.LocalDate;

public class Cadre extends Employe {
	
	int indice;
	
	public int getindice()
	{
		return indice;
	}
	public void setindice(int new_indice)
	{
		indice = new_indice;
	}

	public Cadre()
	{
		
	}
	
	public Cadre(String n , String p, int m, LocalDate dn ,int indice)
	{
		super.nom = n;
		super.prenom = p;
		super.matricule = m;
		super.datenaissance = dn;
		this.indice = indice;
	}
	
	public String ToString()
	{
		return super.ToString() +" | " + "indice : " + indice; 
	}
	
	
	public double getsalaire()
	{
		double salaire = 0;
		if (1 <=indice  && indice <= 4)
			switch (indice) {
		case 1 :
			salaire = 12000;
			break;
		case 2 :
			salaire = 14000;
			break;
		case 3 :
			salaire = 16000;
			break;
		case 4 :
			salaire = 18000;
			break;
		}
		
		else System.out.println("\n" + "l'indice doit etre 1 et 4 ");
			
		return salaire;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
