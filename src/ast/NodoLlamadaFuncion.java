package ast;

public class NodoLlamadaFuncion extends NodoBase {

	private String identificador;
	private NodoBase parametros;

	public NodoLlamadaFuncion() {
		super();
		this.identificador = "";
		this.parametros = null;
	}

	public NodoLlamadaFuncion(String identificador, NodoBase parametros) {
		super();
		this.identificador = identificador;
		this.parametros = parametros;
	}

	public NodoLlamadaFuncion(String identificador) {
		super();
		this.identificador = identificador;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public NodoBase getParametros() {
		return parametros;
	}

	public void setParametros( NodoBase parametros) {
		this.parametros = parametros;
	}

}
