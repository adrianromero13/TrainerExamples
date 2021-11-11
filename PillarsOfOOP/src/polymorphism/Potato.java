package polymorphism;

public class Potato extends Vegetable{

	public Potato(int calories, String name, String potatoType) {
		super(calories, name, true);
		this.potatoType = potatoType;
	}
	String potatoType;
}
