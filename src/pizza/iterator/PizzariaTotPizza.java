package pizza.iterator;

public class PizzariaTotPizza extends AbstractPizzaFactory {

	public PizzariaTotPizza() {
		super("TotPizza");
	}

	public AbstractPizza comprarTropical() {
		AbstractPizza pizza = new PizzaTropical();
		pizza.addIngredient(Ingredient.OLIVES_NEGRES);
		pizza.addPreu(2);
		return pizza;
	}

	public AbstractPizza comprarFormatge() {
		AbstractPizza pizza = new PizzaFormatge();
		pizza.addIngredient(Ingredient.FORMATGE_GOUDA);
		pizza.addPreu(2);
		return pizza;
	}

}