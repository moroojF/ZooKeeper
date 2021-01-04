
public class Bat extends Mammel{

	public Bat() {
		super(300);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("The sound of the bat is wt");
		this.energyLevel-=50;
	}
	public void eatHumans(){
		System.out.println("I'm eating humans");
		this.energyLevel+=25;
	}
	public void attackTown() {
		System.out.println("I'm attacking the towns");
		this.energyLevel-=100;
	}
}
