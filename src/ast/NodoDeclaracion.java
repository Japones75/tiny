package ast;

public class NodoDeclaracion extends NodoBase {
	private NodoBase dato;
	private NodoBase expresion;

	public NodoDeclaracion()
	{
		super();
		this.dato = null;
		this.expresion = null;
	}	
	
	public NodoDeclaracion(NodoBase dato, NodoBase expresion) {
		super();
		this.dato = dato;
		this.expresion = expresion;
	}

	public NodoBase getDato() {
		return dato;
	}

	public void setDato(NodoBase dato) {
		this.dato = dato;
	}

	public NodoBase getExpresion() {
		return expresion;
	}

	public void setExpresion(NodoBase expresion) {
		this.expresion = expresion;
	}
	
}
