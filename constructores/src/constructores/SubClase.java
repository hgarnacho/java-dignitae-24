package constructores;

public class SubClase extends SuperClase {
	
	private int b;
	
	public SubClase() {
		super();
		System.out.println();
		this.b = 0;		
	}	
	
	public SubClase(int a, int b) {
		super(a);
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
