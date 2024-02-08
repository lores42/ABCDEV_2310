package exercice_rectangle;

public class Rectangle {
	
	private double longueur;
	private double largeur;
	

	

	public  Rectangle (double _longueur, double _largeur)
	{
		this.longueur = _longueur;
		this.largeur = _largeur;
	}
	
	 public double calculPerimetre()
	 {
		 double Perimetre;
		 Perimetre = (this.longueur+this.largeur)*2;
		 return Perimetre;
	 }
	 
	 public double calculSurface()
	 {
		 double surface;
		 surface = this.largeur*this.longueur;
		 return surface;
	 }
	 public void afficher()
	 {
		 System.out.println("le perimetre du rectangle est : "+ this.calculPerimetre()+"\nla surface du rectangle est : "+this.calculSurface());
	 }
}
