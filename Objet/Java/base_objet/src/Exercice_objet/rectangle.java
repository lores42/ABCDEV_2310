package Exercice_objet;

public class Rectangle {
	
	
	private double longueur;
	private double largeur;
	boolean carre ;
	
	public Rectangle (double _longueur, double _largeur)
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
	
	public boolean testCarre()
	{
		
		if(largeur==longueur)
		{
			carre=true;
			
		}
		
		else
		{
			carre=false;
		}
		return carre;
		
		
	}
	
	public String afficher()
	{
		String str="";
		
		System.out.println("la longueur est de : " + this.longueur + "\nla largeure est de : " + this.largeur +""
				+ "\nle perimetre du rectangle est de : " + this.calculer_perimettre()+"  "+"\net la surface du rectangle est : " + this.calculer_aire());
		
		if(testCarre())
		{
			System.out.println("c'est un carré!!");
		}
		else
		{
			System.out.println("ce n'est pas un carré!!"+"\n"+"\n");
		}
		return str;
		
		
		
	}


}
