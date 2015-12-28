
public abstract class CommonOliveGarden implements OliveGarden {
	public void menu(){System.out.println("Food choices on the menu");};
	public void specials(){System.out.println("Dinner specials for the night");};
	public void foodPrice(){System.out.println("Price of each item on menu");}
	public void emergency(){System.out.println("Emergency protocol");}
	public abstract void parkingCapacity();
	public abstract void parkingPrice();
	public abstract void seatingCapacity();
	public abstract void hours();
	public abstract void restrooms();
	public abstract void attendance();
}
