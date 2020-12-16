@FunctionalInterface
public interface Moveable {

	public void move();
	
	public default void display() {
		System.out.println("hello from display");
	}
	// can we override the default methods : Yes
	// why to declare the default methods : 
}
