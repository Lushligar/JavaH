package tp1;

public class TestClient {
	// Exercice 1.4
	public static void main(String[] args) {
		
		Client client1 = new Client("Golay", "Jerry", null);
		System.out.println("Le nom, prénom et numéro du client sont : " + client1.getNom() + " " + client1.getPrenom() );
		
		// Exercice 3.2
		Client client2 = new Client("Celère", "Jaqcues", new Compte(2));
		System.out.println("Le nom, prénom et numéro du client sont : " + client2.getNom() + " " + client2.getPrenom() + " " + client2.getCompteCourant() );
		
		
		Client client3 = new Client("Tarbus","Thomas", new Compte(3));
		client3.afficherSolde();
	
	}

}
