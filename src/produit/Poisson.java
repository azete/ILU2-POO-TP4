package produit;

public abstract class Poisson extends Produit{
	private String date;
	
	public Poisson(String date, String nom,Unite unite) {
		super(nom,unite);
		this.date=date;
	}
	
	public void decrireProduit() {
		System.out.println(nom + " peches ce " + date);
	}
}
