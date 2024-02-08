package geometry;

public class cercle {

	private double perimetre;
	private double surface;
	private double rayon;
	private double diametre;
	//private void testAppartenance() 
	//{
		//return null;
	//}
	//private void afficher() 
	//{
		//return null;
	//}
	
	public cercle(double _perimetre, double _surface)
	{
		this.perimetre = _perimetre;
		this.surface = _surface;
	}
	//formule pour calculer perimetre
	public double calculerDiametre()
	{
		double diametre;
		diametre = this.rayon*2;
		return diametre;
	}
	//formule pour calculer perimetre
	public double calculerPerimetre()
	{
		double perimetre;
		perimetre = this.diametre*Math.PI;
		return perimetre;
	}
	//formule pour calculer la surface
	public double calculerSurface();
	{
		double surface ;
		surface = (rayon*Math.sqrt(surface))*Math.PI;
		return surface;
	}
}
