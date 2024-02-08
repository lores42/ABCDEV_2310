package Exercice_objet;

public class carre {
	
	private double longueur;
	private double largeur;

	
	public carre (double _longueur, double _largeur)
	{
		this.longueur = _longueur;
		this.largeur = _largeur;
	}
	
	public double calculer_perimettre()
	{
		double perimettre;
		perimettre=(this.longueur+this.largeur)*2;
		return perimettre;
	}
	
	public double calculer_aire()
	{
		double aire;
		aire=this.longueur*this.largeur;
		return aire;
	}
	
	public void afficher()
	{
		System.out.println("la longueur est de : " + this.longueur + "\nla largeure est de : " + this.largeur +"\nle perimetre du rectangle est de : " + this.calculer_perimettre()+"  "+"\net la surface du rectangle est : " + this.calculer_aire() );
		
	}


}
