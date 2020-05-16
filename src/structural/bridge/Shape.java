package structural.bridge;

public abstract class Shape {
	
	String name;
	private Renderer renderer;
	
	public Shape(Renderer renderer) {
		this.renderer = renderer; 
	}
	
	@Override
	public String toString() {
		return String.format("Drawing %s as %s", name, renderer.whatToRenderAs());
	}
}