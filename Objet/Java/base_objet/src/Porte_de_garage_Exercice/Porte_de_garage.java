package Porte_de_garage_Exercice;

public class Porte_de_garage {
		// declaration des attributs
		private String marque;
		private Boolean estOuverte;
		private Boolean estVerrouiller;
		private int degresOuverture;
		private int degresMax;
		private int degresMin;
		
		//constructeur avec paramettre
		public Porte_de_garage(String _marque, Boolean _estOuverte, Boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
		{
			this.marque = _marque;
			this.estOuverte = _estOuverte;
			this.estVerrouiller = estVerrouiller;
			this.degresOuverture = degresOuverture;
			this.degresMax = 100;
			this.degresMin = 0;
		}
		
		public Boolean ouvrir()
		{
			if(!estOuverte && !estVerrouiller)
			{
				this.estOuverte = true;
				this.degresOuverture = this.degresMax;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public Boolean fermer()
		{
			if(estOuverte && estVerrouiller)
			{
				this.estOuverte = false;
				this.degresOuverture = this.degresMin;
				return true;
			}
			else
			{
				return false;
			}
		
		}
		public Boolean verrouiller()
		{
			if(!estOuverte && this.estVerrouiller)
			{
				this.estVerrouiller = false;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean deverrouillé()
		{
			if(!estOuverte && this.estVerrouiller)
			{
				this.estVerrouiller=false;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean ouvrirPartiellemnt(int degresAOuvrir)
		{
				if(!estVerrouiller)
				{
				
					if(this.degresOuverture+ degresAOuvrir<= this.degresMax)
					
					{
						this.degresOuverture = this.degresOuverture + degresAOuvrir;
						if(!estOuverte)
						
						{
								this.estOuverte = true;
						}
					
							return true;
						
					}
					else
					{
						return false;
					}
				
				}
				else
				{
					return false;
				}
			
		}
		
		public Boolean fermerPartiellemnt(int degresAFermer)
		{
			if(!estVerrouiller)
			{
				
				if(this.degresOuverture - degresAFermer>= degresMin)
				{
					this.degresOuverture = this.degresOuverture - degresAFermer;
					return true;
				}
				else
				{
					return false;
				}
			}
			else 
			{
				return false;
			}
		}
		


}
