
public class Mammel {
	protected int energyLevel;

	public Mammel() {
		this.energyLevel = 100;
	}
	
	public Mammel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println("The Energy Level is: "+this.energyLevel);
		return this.energyLevel;
	}

}
