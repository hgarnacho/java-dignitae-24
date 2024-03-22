package e18_constructorCopiaAsignacion;

public class MiClase {
	
	private int miAtributo;
	
	public MiClase(int i) {
		this.miAtributo = i;
	}
	
	public MiClase(MiClase mc) {
		this.miAtributo = mc.miAtributo;
	}

	public int getMiAtributo() {
		return miAtributo;
	}

	public void setMiAtributo(int miAtributo) {
		this.miAtributo = miAtributo;
	}
	
}
