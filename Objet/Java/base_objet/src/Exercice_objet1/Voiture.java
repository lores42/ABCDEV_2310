package Exercice_objet1;

public class Voiture {
	
	private int id;
	private String marque;
	private double vitesse;
	private int puissance;
	
	public Voiture (int _id, String _marque, double _vitesse, int _puissance ) 
	{
	
		this.id = _id;
		this.marque = _marque;
		this.vitesse = _vitesse;
		this.puissance = _puissance;
	}
	
	public Voiture() 
	{
		this.id=8;
		this.marque="BMW";
		this.vitesse=220;
		this.puissance=8;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getMarque()
	{
		return marque;
	}
	
	public double getVitesse() 
	{
		return vitesse;
	}
	
	public int getPuissance()
	{
		return puissance;
	}
	
	public int setId()
	{
		id=8;
			return id;	
	}
	
	public String setMarque()
	{
		marque="BMW";
		return marque;
	}
	
	public double setVitesse()
	{
		vitesse=220;
		return vitesse;
	}
	
	public int setPuissance()
	{
		puissance=8;
		return puissance;
	}
	
	public void affichage()
	{
		System.out.println("id="+this.id+"\nmarque="+this.marque+""
				+ "\nvitesse="+this.vitesse+"\npuissance="+this.puissance+"\n");
	}
	
	

}
