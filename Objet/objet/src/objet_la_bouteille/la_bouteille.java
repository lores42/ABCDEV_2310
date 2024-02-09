package objet_la_bouteille;

public class la_bouteille {
	
	private String nom ;
	private final double contenanceEnL ;
	private boolean estOuverte ;
	
	
	public boolean ouvrir()
	{
				if(!estOuverte)
					{
						estOuverte =true;
						return true;
					}
				else
					{
						return false;
					}
	public boolean Fermer()
		{
				if(estOuverte)
					{
						estOuverte =false;
						return true;
					}
				else
					{
						return false;
					}
		}
					
					
	}
	
}
