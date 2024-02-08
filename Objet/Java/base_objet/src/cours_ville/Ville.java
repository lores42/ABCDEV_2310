package cours_ville;

public class Ville {
	//les attributs
	// stocke le nom de la ville 
	private String nomVille;
	// stocke le nom du pays de la ville
	private String nomPays;
	// stocke le nombre d'habitant de la ville 
	private int nbHabitants;
	// stocke la catégorie de la ville (nb habitant )
	private char categories;
	
	
	// constructeur par defaut 
	public Ville()
	{
		System.out.println("Création d'une ville par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
		this.setcategories();
	}
	
	// constructeur avec paramètres
	// J'ai ajouté un << p>> en 1ère lettre des paramétres
	// ce n'est pas une convention mais ca peut être un bon moyens de les repérer
	public Ville (String pNom, int nbre, String pNomPays)
	{
		System.out.println("Création d'une ville avec des parametres");
		nomVille = pNom;
		nomPays = pNomPays;
		nbHabitants = nbre;
		this.setcategories();
	}
	 //*******ACCESSEURS********
	
	// RETOURNE LE NOM DE LA VILLE
	public String getNom()
	{
		return nomVille;
	}
	// retourne le nom du pays 
	public String getNomPays()
	{
		return nomPays;
	}
	// retourne le nombre d'habitant
	public int getNbHabitants()
	{
		return nbHabitants;
	}
	// retourne la catégorie
	public char getCategories()
	{
		return categories;
	}
	
	//*********MUTATEURS*********

	//Définit le nom de la ville
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}
	
	//Définit le nom du pays
	public void setNomPays (String pNomPays)
	{
		nomPays = pNomPays;
	}
	
	//Définit le nombre d'habitant
	public void setNbHabitants (int nbre)
	{
		nbHabitants = nbre;
	}
	public void Afficher()
	{
		System.out.println("ville = "+getNom()+" ville de "+getNbHabitants()+" habitant(s) se situant en "+getNomPays());
	}
	//Définit la catégories de la ville
	private void setcategories()
	{
		int bornesSuperieurs [] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories [] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i =0;
		
		while(i<bornesSuperieurs.length && this.nbHabitants >bornesSuperieurs[i])
		{
			i++;
		}
		this.categories = categories[i];
	}
	//Retourne la decription de la ville
	public String decrisToi() 
	{
		return "\t"+this.nomVille+" est une ville"
				+this.nomPays 
				+"elle comporte : "
				+this.nbHabitants
				+"habitant(s) => elle est donc de categorie : "
				+this.categories;
	}
	//Retourne une chaine de caractères selon le résultat de la comparaison
	public String comparer(Ville v1)
	{
		String str = new String();
		
		if(v1.getNbHabitants() >this.nbHabitants)
		{
			str = v1.getNom()+"est plus peuplée que "+this.nomVille;
		}
		else
		{
			str = this.nomVille+" est plus peuplée que "+v1.getNom();
		}
		return str;
	}
	
}
