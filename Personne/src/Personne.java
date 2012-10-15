public class Personne {

	/**
	 * @param args
	 */

	private String nom;
	private String prenom;
	private boolean ishomme;
	private int anneenaissance;

	public Personne(String nom, String prenom, boolean ishomme,
			int anneenaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.ishomme = ishomme;
		this.anneenaissance = anneenaissance;
	}

	@Override
	public String toString() {
		return this.nom + "," + this.prenom + ","
				+ (this.ishomme ? "Homme" : "Femme") + ","
				+ this.anneenaissance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne = new Personne("a", "b", false, 1990);
		System.out.println(personne.toString());
	}

}
