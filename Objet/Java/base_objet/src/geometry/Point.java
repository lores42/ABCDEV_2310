package geometry;

public   class Point {

	
	private double xA = 4;
	private double yA = 6;
	
	private final double xC =4;
	private final double yC =4;
	
	private String Abcisse = y ;
	
	private final double pi = Math.PI;
	public double perimetre;
	public double diametre;
	
	public  Point(double _rayon)
	{
		rayon = _rayon;
	}
	public void position_A(double coord_xA, double coord_yA)
	{
		xA = coord_xA;
		yA = coord_yA;
	}
	public void position_C(double coord_xC, double coord_yC)
	{
		coord_xC = xC ;
		coord_yC = yC ;
	}
	
	public Cercle(point centre)
	{
		perimetre = this.diametre*pi;
		diametre =rayon*2;
		double surface = Math.pow(rayon, diametre)*pi;
	}
}
