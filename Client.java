package tp1;

public class Client {
		
	// Attributs 
	
		// Exercice 1.1
	 String nom, prenom;
	 		
	 	// Exercice 3.1
	  private Compte compteCourant ;
	 
	 
	// Constructeur 
	 
	 	//Exercice 1.2
	 public Client(String nom,String prenom,Compte compte) {
		 this.nom = nom;
		 this.prenom = prenom;
		 this.compteCourant = compte ;
		 
		 // Exercice 3.0
		 
		
		 
	}
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Accesseurs
	 	// Exercice 1.3
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	
	public double getSolde() {
		return compteCourant.getSolde();
	}

	public void afficherSolde( ) {
		System.out.println();
	}

	public String getCompteCourant() {
		return ;
	}

	

	
	



}
