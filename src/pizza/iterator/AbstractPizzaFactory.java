package pizza.iterator;

public abstract class AbstractPizzaFactory {

	private String nom;

	public AbstractPizzaFactory(String nom) {
		this.setNom(nom);
	}

	public abstract AbstractPizza comprarTropical();

	public abstract AbstractPizza comprarFormatge();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
