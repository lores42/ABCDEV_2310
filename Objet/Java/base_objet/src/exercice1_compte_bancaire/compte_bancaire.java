package exercice1_compte_bancaire;

public class compte_bancaire {
	
	private double solde;
	
	public compte_bancaire(double _solde)
	{
		this.solde = _solde;
	}
	
	public void deposer(double sommeAjouter)
	{
		this.solde = this.solde + sommeAjouter;
	}
	
	public void retirer(double sommeRetirer)
	{
		this.solde = this.solde - sommeRetirer;
	}
	
	public void afficher()
	{
		System.out.println("le solde est : "+ this.solde);
	}
	
}

