package tp1;

public class MaBanque {
	
	
	public static void main(String[] args) {
		
		// Exercice 2.3
		Compte compte1 = new Compte(1);
		System.out.println("Le compte " + compte1.getNum() + " viens d'être initialisé ayant un découvert de " + compte1.getDecouvert() +  " et un solde de " + compte1.getSolde());
		compte1.setDecouvert(100);
		System.out.println("Le compte " + compte1.getNum() + " viens d'être initialisé ayant un découvert de " + compte1.getDecouvert() + " et un solde de " + compte1.getSolde() );
		
		//Exercice 2.4
		compte1.depot(20);
		compte1.afficherSolde();
		
		//Exercice 2.6
		Compte c2 = new Compte(2);
		c2.depot(1000);
		c2.afficherSolde();
		String retrait1 = c2.retrait(600);
		System.out.println( retrait1 + "Nouveau Solde : " + c2.getSolde() );
		String retrait2 = c2.retrait(700);
		System.out.println( retrait2 + "Nouveau Solde : " + c2.getSolde() );
		c2.setDecouvert(500);
		String retrait3 = c2.retrait(700);
		System.out.println( retrait3 + "Nouveau Solde : " + c2.getSolde() );
		
		// Exercice 3.4
		
		
		Client client1 = new Client("Marc","Lavoine",c2);
		client1.afficherSolde();
		
		
	}
}
