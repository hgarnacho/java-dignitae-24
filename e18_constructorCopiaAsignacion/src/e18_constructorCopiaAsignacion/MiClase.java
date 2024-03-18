package e18_constructorCopiaAsignacion;

public class MiClase {

	private int miAtributo;
	
	public MiClase() {
		this.miAtributo = 0;
	}
	
	public MiClase(int ma) {
		this.miAtributo = ma;
	}

	public MiClase(MiClase objBase) {
		this.miAtributo = objBase.miAtributo;
	}
	
	public int getMiAtributo() {
		return miAtributo;
	}

	public void setMiAtributo(int miAtributo) {
		this.miAtributo = miAtributo;
	}
	
	public static MiClase clonar(MiClase objBase) {
		return new MiClase(objBase.getMiAtributo());
	}
		
	public MiClase clonar() {
		return new MiClase(this.getMiAtributo());
	}
	
}
