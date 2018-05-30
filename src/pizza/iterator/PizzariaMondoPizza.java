package pizza.iterator;

public class PizzariaMondoPizza extends AbstractPizzaFactory {

	private static PizzariaMondoPizza mondoPizza = new PizzariaMondoPizza();

	private PizzariaMondoPizza() {
		super("MondoPizza");
	}

	public static PizzariaMondoPizza getInstancia() {
		return mondoPizza;
	}

	public AbstractPizza comprarTropical() {
		AbstractPizza pizza = new PizzaTropical();
		pizza.addIngredient(Ingredient.XAMPINYO);
		pizza.addPreu(3);
		return pizza;
	}

	public AbstractPizza comprarFormatge() {
		AbstractPizza pizza = new PizzaFormatge();
		pizza.addIngredient(Ingredient.FORMATGE_CABRA);
		pizza.addPreu(3);
		return pizza;
	}

}
