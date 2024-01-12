package bouteille;


public class bouteille {

		private String nom ;
		private final double capaciteEnL ;
		private double contenanceEnL ;
		private boolean estOuverte ;
		
		public boolean ouvert()
		{
				if (!estOuverte)
				{
					estOuverte= true;
					return true;
				}
				else
				{
					return false;
				}
		}
		
		public boolean fermer()
		{
				if(estOuverte)
				{
					estOuverte = false;
					return true;
				}
				else
				{
					return false;
				}
			
		}
		
		//bouteille par defaut
		
		public bouteille ()
		{
			nom = "Badoit";
			capaciteEnL = 1.5;
			contenanceEnL = 0.5;
			estOuverte = false ;
		}
		
		//bouteille avec paramettre 
		public bouteille ( String _nom, Double _capaciteEnL, Double _contenanceEnL, Boolean _estOuverte)
		{
			nom = _nom;
			capaciteEnL = _capaciteEnL;
			contenanceEnL = _contenanceEnL;
		}
}
