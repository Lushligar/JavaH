package tp1;

public class Compte {

	// Attributs
	
		// Exercice 2.1
	 private int num;
	 private double solde,decouvert;
	
	// Constructeur 
	
	public Compte(int num) {
		this.num = num;
		this.decouvert = 0 ;
		this.solde = 0 ;
		
	}
	
	
	
	// Accesseurs
		
		
		// Exercice 2.2 
	
	public void afficherSolde() {
		System.out.println("Votre solde est " + getSolde() );
	}
		// Exercice 2.2
	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public int getNum() {
		return num;
	}

	public double getSolde() {
		return solde;
	}
	 // Exercice 2.4
	
	public void depot(double montant) {
		solde = montant + solde;
	}
	
	 // Exercice 2.5
	
	public String retrait(double montant) {
		if (montant < solde + decouvert) {
			solde = solde - montant; 
			return "Retrait effectué.";
		}
		else {
			return "Retrait refusé.";
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
