package ast;

public class NodoFor extends NodoBase {

	private NodoBase asignacion;
	private NodoBase expresion;
	private NodoBase paso;
	private NodoBase cuerpo;

	public NodoFor() {
		super();
		this.asignacion = null;
		this.expresion = null;
		this.paso = null;
		this.cuerpo = null;
	}

	public NodoFor(NodoBase asignacion, NodoBase expresion, NodoBase paso, NodoBase cuerpo) {
		super();
		this.asignacion = asignacion;
		this.expresion = expresion;
		this.paso = paso;
		this.cuerpo = cuerpo;
	}

	public NodoBase getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(NodoBase asignacion){
		this.asignacion = asignacion;
	}

	public NodoBase getExpresion() {
		return expresion;
	}

	public void setExpresion(NodoBase expresion){
		this.expresion = expresion;
	}

	public NodoBase getPaso() {
		return paso;
	}

	public void setPaso(NodoBase paso){
		this.paso = paso;
	}

	public NodoBase getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(NodoBase cuerpo){
		this.cuerpo = cuerpo;
	}

}