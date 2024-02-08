package cours_ville;

public class App {
	
	public static void main(String[] args) {

	Ville ville = new Ville();
	
	
	Ville ville1 = new Ville("Marseille", 123456789, "france");
	
	System.out.println(ville.getNom());
	ville.setNom("Monaco") ;
	System.out.println(ville.getNom());
	//Ville.setNom(ville1) ;
	//ville1.getNomPays = "portugal";
	//System.out.println(ville1. getNomPays );
	
	
	Ville ville2 = new Ville("Mulhouse", 108038, "France");
	
	System.out.println("\n ville = "+ville.getNom()+"ville de "+ville.getNbHabitants()+"Habitant(s) se situant en "+ville.getNomPays());
	
	System.out.println(" ville = "+ville1.getNom()+"ville de "+ville1.getNbHabitants()+"Habitant(s) se situant en "+ville1.getNomPays());
	
	System.out.println(" ville = "+ville2.getNom()+"ville de "+ville2.getNbHabitants()+"Habitant(s) se situant en "+ville2.getNomPays());
	
	/*
	 Nous allons interchnager les villes 1 et 2
	 tout ca par l'intermédiaire d'un autre objetville 
	 */
	Ville temp = new Ville();
	temp = ville1;
	ville1 = ville2;
	ville2 = temp;
	
	System.out.println(" ville1 = "+ville1.getNom()+"ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
	System.out.println(" ville2 = "+ville2.getNom()+"ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays());
	/*
	  Nous allons maintenant interchanger leur noms
	   par le bias de leur mutateurs
	 */
	
	ville1.setNom("Hong Kong");
	ville2.setNom("New York");
	System.out.println("ville1 = "+ville1.getNom()+"ville de "+ville1.getNbHabitants()+" habitant(s) se situant en "+ville1.getNomPays());
	System.out.println("ville1 = "+ville2.getNom()+"ville de "+ville2.getNbHabitants()+" habitant(s) se situant en "+ville2.getNomPays()+"\n\n");
	}

}
