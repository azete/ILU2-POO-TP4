package produit;

import personnages.Gaulois;

public abstract class Sanglier extends Produit{
	private Gaulois chasseur;
	private int poid;
	
	public Sanglier(String nom, Gaulois chasseur, Unite unite, int poid) {
		super(nom,unite);
		this.chasseur=chasseur;
		this.poid=poid;
	}
	
	public void decrireProduit() {
		System.out.println("Le chasseur" + chasseur.getNom() + " a chassé un " + nom + " de " +  poid + " "+ unite);
	}
}
