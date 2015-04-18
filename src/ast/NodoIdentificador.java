package ast;

public class NodoIdentificador extends NodoBase {
	private String nombre;
	private NodoBase expresion = null;

	public NodoIdentificador(String nombre) {
		super();
		this.nombre = nombre;
	}
	public NodoIdentificador(String nombre, NodoBase 		expresion) {
		super();
		this.nombre = nombre;
		this.expresion = expresion;
	}
	public NodoIdentificador() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
 		this.nombre = nombre;
	}
	public NodoBase getExpresion(){
		return expresion;
	}
	public void setExpresion(NodoBase expresion){
		this.expresion = expresion;
	}
}
