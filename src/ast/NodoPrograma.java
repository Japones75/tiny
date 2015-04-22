package ast;

public class NodoPrograma extends NodoBase {
	
	private NodoBase funciones;
	private NodoBase cuerpo;

	public NodoPrograma() {
		super();
		this.funciones = null;
		this.cuerpo = null;
	}

	public NodoPrograma(NodoBase cuerpo) {
		super();
		this.cuerpo = cuerpo;
	}

	public NodoPrograma(NodoBase funciones, NodoBase cuerpo) {
		super();
		this.funciones = funciones;
		this.cuerpo = cuerpo;
	}

	public NodoBase getFunciones() {
		return funciones;
	}

	public void setFunciones(NodoBase funciones) {
		this.funciones = funciones;
	}

	public NodoBase getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(NodoBase cuerpo) {
		this.cuerpo = cuerpo;
	}
}