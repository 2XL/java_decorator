package pizza.iterator;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n\n\n---------------------------------------------");
		System.out.println("------Pizzaria Mondo Pizza-------------------");
		System.out.println("---------------------------------------------");
		
		/* Pizzaria 1 */
		AbstractPizzaFactory mondoPizza = PizzariaMondoPizza.getInstancia();

		AbstractPizza pizzaFormatge = mondoPizza.comprarFormatge();
		AbstractPizza pizzaTropical = mondoPizza.comprarTropical();

		/* TO STRING */
		System.out.println(pizzaFormatge.toString());
		System.out.println(pizzaTropical.toString());

		System.out.println("\n-------------------------");
		/* ITERATOR */
		for (Ingredient ing : pizzaFormatge) {
			System.out.println(ing);
		}

		System.out.println("\n-------------------------");

		for (Ingredient ing : pizzaTropical) {
			System.out.println(ing);
		}

		System.out.println("\n\n\n-------------------------------------------");
		System.out.println("------Pizzaria Tot Pizza-------------------");
		System.out.println("-------------------------------------------");

		/* Pizzaria 2 */
		AbstractPizzaFactory totPizza = new PizzariaTotPizza();

		AbstractPizza pizzaFormatge2 = totPizza.comprarFormatge();
		AbstractPizza pizzaTropical2 = totPizza.comprarTropical();

		System.out.println(pizzaFormatge2.toString());
		System.out.println(pizzaTropical2.toString());

		System.out.println("\n-------------------------");

		for (Ingredient ing : pizzaFormatge2) {
			System.out.println(ing);
		}

		System.out.println("\n-------------------------");

		for (Ingredient ing : pizzaTropical2) {
			System.out.println(ing);
		}

	}

}
