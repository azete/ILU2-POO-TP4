package produit;

public enum Unite {
	LITRE("l"), GRAMME("g"), KILOGRAMME("kg"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE(" ");
	
	private String abr;
	
	private Unite (String abr) {
		this.abr=abr;
	}
	public String getNom() {
		return abr;
	}
}
