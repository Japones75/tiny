package ast;

public class NodoDeclaracion extends NodoBase {
	private String dato;
	private NodoBase expresion;

	public NodoDeclaracion()
	{
		super();
		this.dato = null;
		this.expresion = null;
	}	
	
	public NodoDeclaracion(String dato, NodoBase expresion) {
		super();
		this.dato = dato;
		this.expresion = expresion;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public NodoBase getExpresion() {
		return expresion;
	}

	public void setExpresion(NodoBase expresion) {
		this.expresion = expresion;
	}
	
}
