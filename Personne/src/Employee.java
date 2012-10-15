/**
 * 
 */

/**
 * @author leonaldo
 * 
 */
public class Employee extends Personne {

	private String department;
	private int numero;

	public Employee(String nom, String prenom, boolean ishomme,
			int anneenaissance, String department, int numero) {

		super(nom, prenom, ishomme, anneenaissance);
		this.department = department;
		this.numero = numero;

	}

}
