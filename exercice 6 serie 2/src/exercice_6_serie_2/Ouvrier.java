package exercice_6_serie_2;

import java.time.LocalDate;

public class Ouvrier extends Employe {
	
	LocalDate date_entre;
	
	int SMIG = 3000;
	
	
	public LocalDate getdate_entre()
	{
		return date_entre;
	}
	
	public void setdate_entre(LocalDate new_date_entre)
	{
		date_entre = new_date_entre;
	}
	
	public Ouvrier()
	{
		
	}
	
	public Ouvrier(String n , String p, int m, LocalDate dn, LocalDate date_entre)
	{
		super.nom = n;
		super.prenom = p;
		super.matricule = m;
		super.datenaissance = dn;
		this.date_entre = date_entre;
	}
	
	
	
	public String ToString()
	{
		return super.ToString() + " | " + "date entree : " + date_entre; 
	}

	
	
	
	public double getsalaire()
	{
		double salaire = SMIG + ((LocalDate.now().getYear() - date_entre.getYear()) * 100);
		if (salaire <= SMIG * 2)
			return salaire;
		else 
			return SMIG * 2;
		
	}
}
