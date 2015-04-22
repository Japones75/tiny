package ast;

public class NodoFuncion extends NodoBase {

	private NodoBase t_fun;
	private NodoBase args;
	private NodoBase bloque;

	public NodoFuncion() {
		super();
		this.t_fun = null;
		this.args = null;
		this.bloque = null;
	}

	public NodoFuncion(NodoBase t_fun, NodoBase args, NodoBase bloque) {
		super();
		this.t_fun = t_fun;
		this.args = args;
		this.bloque = bloque;
	}

	public NodoFuncion(NodoBase t_fun, NodoBase bloque) {
		super();
		this.t_fun = t_fun;
		this.bloque = bloque;
	}

	public NodoBase getTFun(){
		return t_fun;
	}

	public void setTFun(NodoBase t_fun) {
		this.t_fun = t_fun;
	}

	public NodoBase getArgs(){
		return args;
	}

	public void setArgs(NodoBase args) {
		this.args = args;
	}

	public NodoBase getBloque(){
		return bloque;
	}

	public void setBloque(NodoBase bloque) {
		this.bloque = bloque;
	}
}