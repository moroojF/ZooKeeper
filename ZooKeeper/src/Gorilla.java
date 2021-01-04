
public class Gorilla extends Mammel{
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething(){
		System.out.println("Oops Sorry, I blew some fart ;) !");
		this.energyLevel-=5;
	}
	
	public void eatBananas(){
		System.out.println("So yummy bananas <3");
		this.energyLevel+=10;
	}
	
	public void climb(){
		System.out.println("This tree is very tall, I enjoy climbing it :)");
		this.energyLevel-=10;
	}
}
