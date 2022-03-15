
public class AnimalHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Chicken();
		printfeature(an);
		an = new Hawk();
		printfeature(an);
		an = new BlueWhale();
		printfeature(an);
	}

	private static void printfeature(Animal an) {
		// TODO Auto-generated method stub
		System.out.println(an.getname());
		if (an instanceof Walks) {
			System.out.println(((Walks) an).walks());
		}
		if (an instanceof Herbivore) {
			System.out.println(((Herbivore) an).herbivore());
		}
		if (an instanceof Carnivore) {
			System.out.println(((Carnivore) an).carnivore());
		}
		if (an instanceof EggLaying) {
			System.out.println(((EggLaying) an).egglaying());
		}
		if (an instanceof Fly) {
			System.out.println(((Fly) an).fly());
		}
		if (an instanceof Jump) {
			System.out.println(((Jump) an).jump());
		}
		if (an instanceof Swim) {
			System.out.println(((Swim) an).swim());
		}
		System.out.println("*******************************************************");

	}
}

interface Walks {
	String walks();

}

interface Herbivore {
	String herbivore();
}

interface Carnivore {
	String carnivore();
}

interface EggLaying {
	String egglaying();
}

interface Fly {
	String fly();
}

interface Jump {
	String jump();
}

interface Swim {
	String swim();
}

abstract class Animal {
	protected String name;

	abstract String getname();

}
																
class FlyAnimal extends Animal {
	protected String name = "Fly Animal";

	@Override
	String getname() {
		// TODO Auto-generated method stub
		return name;
	}
}

class LandAnimal extends Animal {
	protected String name = "Land Animal";

	@Override
	String getname() {
		// TODO Auto-generated method stub
		return name;
	}
}

class WaterAnimal extends Animal {
	protected String name = "Water Animal";

	@Override
	String getname() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Chicken extends FlyAnimal implements Walks, Herbivore, Carnivore, EggLaying {
	private String name = "Chicken";

	@Override
	public String egglaying() {
		// TODO Auto-generated method stub
		return "The Animal is Egg Laying";
	}

	@Override
	public String carnivore() {
		// TODO Auto-generated method stub
		return "The animal is carnivore";
	}

	@Override
	public String herbivore() {
		// TODO Auto-generated method stub
		return "The animal is herbivore";
	}

	@Override
	public String walks() {
		// TODO Auto-generated method stub
		return "The animal walks";
	}
}

class Hawk extends FlyAnimal implements Walks, Fly, Herbivore, Carnivore, EggLaying {
	private String name = "Hawk";

	@Override
	public String egglaying() {
		// TODO Auto-generated method stub
		return "The Animal is Egg Laying";
	}

	@Override
	public String carnivore() {
		// TODO Auto-generated method stub
		return "The animal is carnivore";
	}

	@Override
	public String herbivore() {
		// TODO Auto-generated method stub
		return "The animal is herbivore";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "The animal can fly";
	}

	@Override
	public String walks() {
		// TODO Auto-generated method stub
		return "The animal walks";
	}
}

class ocelet extends LandAnimal implements Jump, Carnivore, Walks {
	private String name = "Ocelet";

	@Override
	public String walks() {
		// TODO Auto-generated method stub
		return "The animal walks";
	}

	@Override
	public String carnivore() {
		// TODO Auto-generated method stub
		return "The animal is carnivore";
	}

	@Override
	public String jump() {
		// TODO Auto-generated method stub
		return "The animal jumps";
	}
}

class BlueWhale extends WaterAnimal implements Swim, Carnivore, Jump {
	private String name = "Blue Whale";

	@Override
	public String jump() {
		// TODO Auto-generated method stub
		return "The animal jumps";
	}

	@Override
	public String carnivore() {
		// TODO Auto-generated method stub
		return "The animal is carnivore";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "The animal swims";
	}

}
