package polymorphism;

public class FoodMethods {

	public static int calculateCalories(Food[] food) {
		
		// because all foods have calories
		int total = 0;
		for (Food f : food) {
			total += f.calories;
		}
		return total;
	}
	
	// don't need to be only food
	public static void testCalcuateFood() {
		
		Food f = new Food(100, "Candy");
		Vegetable v = new Vegetable(45, "Onion", false);
		Potato p = new Potato(240, "Idaho Potato", "Idaho");
		
		Food[] food = new Food[3]; 
		food[0] = f;
		food[1] = v;
		food[2] = p;
		
		System.out.println("Total calories: " + calculateCalories(food));
	}
}
