package ast;

public class NodoReturn extends NodoBase {

	private NodoBase expresion;

	public NodoReturn() {
		super();
		this.expresion = null;
	}

	public NodoReturn(NodoBase expresion) {
		super();
		this.expresion = expresion;
	}

	public NodoBase getExpresion() {
		return expresion;
	}
	
	public void setExpresion(NodoBase expresion) {
		this.expresion = expresion;
	}

}