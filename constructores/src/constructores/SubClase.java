package constructores;

public class SubClase extends SuperClase {
	
	private int b;
	
	public SubClase() {
		super();
		this.b = 0;
	}
	
	
	public SubClase(int a, int b) {
		super(a);
		this.b = b;
	}
	
}
