
public class BatTest {

	public static void main(String[] args) {
		Bat bat = new Bat();
		System.out.print("In the beginning "); 
		bat.displayEnergy();
		bat.fly();
		bat.fly();
		bat.displayEnergy();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergy();
		bat.eatHumans();
		bat.eatHumans();
		bat.displayEnergy();
	}

}
