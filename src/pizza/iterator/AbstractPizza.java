package pizza.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractPizza implements Iterable<Ingredient> {

	private String nom;
	private int preu = 0;
	private List<Ingredient> listIngredient;

	public AbstractPizza(String nom, int preu, Ingredient Ing) {

		this.nom = nom;
		this.preu = 5 + preu;
		this.listIngredient = new LinkedList<Ingredient>();
		listIngredient.add(Ingredient.TOMAQUET);
		listIngredient.add(Ingredient.MOZZARELLA);
		listIngredient.add(Ing);
	}

	public void addIngredient(Ingredient ing) {
		this.listIngredient.add(ing);
	}

	public void addPreu(int i) {
		this.preu += i;

	}

	public String toString() {
		return "nom: " + nom + " preu: " + preu + " ingredients: \t" + listIngredient;
	}

	public Iterator<Ingredient> iterator() {
		return this.listIngredient.iterator();
	}

}
