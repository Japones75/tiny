package ast;

public class Util {
	
	static int sangria = 0;
	
	//Imprimo en modo texto con sangrias el AST
	public static void imprimirAST(NodoBase raiz){
		  sangria+=2;
		  while (raiz != null) {
		    printSpaces();
		    if (raiz instanceof  NodoIf)
		    	System.out.println("If");
		    else if (raiz instanceof  NodoRepeat)
		    	System.out.println("Repeat");
		    
		    else if (raiz instanceof  NodoAsignacion)
		    	System.out.println("Asignacion a: "+((NodoAsignacion)raiz).getIdentificador());

		    else if (raiz instanceof  NodoLeer)  
		    	System.out.println("Lectura: "+((NodoLeer)raiz).getIdentificador());

		    else if (raiz instanceof  NodoEscribir)
		    	System.out.println("Escribir");
		    
		    else if (raiz instanceof NodoOperacion
		    		|| raiz instanceof NodoValor
		    		|| raiz instanceof NodoIdentificador )
		    	imprimirNodo(raiz);
		    
		    else if (raiz instanceof  NodoDeclaracion)
		    	System.out.println("Declaracion");
		    
		    else if (raiz instanceof  NodoFor)
		    	System.out.println("For");
		    
		    else if (raiz instanceof  NodoFuncion)
		    	System.out.println("Funcion");
		    
		    else if (raiz instanceof  NodoLlamadaFuncion)
		    	System.out.println("Llamar Funcion " + ((NodoLlamadaFuncion)raiz).getIdentificador());
		    
		    else if (raiz instanceof  NodoPrograma)
		    	System.out.println("Programa");
		    
		    else if (raiz instanceof  NodoReturn)
		    	System.out.println("Return");
		    
		    
		    else System.out.println("Tipo de nodo desconocido");
		    
		    /* Hago el recorrido recursivo */
		    if (raiz instanceof  NodoIf){
		    	printSpaces();
		    	System.out.println("**Prueba IF**");
		    	imprimirAST(((NodoIf)raiz).getPrueba());
		    	printSpaces();
		    	System.out.println("**Then IF**");
		    	imprimirAST(((NodoIf)raiz).getParteThen());
		    	if(((NodoIf)raiz).getParteElse()!=null){
		    		printSpaces();
		    		System.out.println("**Else IF**");
		    		imprimirAST(((NodoIf)raiz).getParteElse());
		    	}
		    }
		    else if (raiz instanceof  NodoRepeat){
		    	printSpaces();
		    	System.out.println("**Cuerpo REPEAT**");
		    	imprimirAST(((NodoRepeat)raiz).getCuerpo());
		    	printSpaces();
		    	System.out.println("**Prueba REPEAT**");
		    	imprimirAST(((NodoRepeat)raiz).getPrueba());
		    }
		    else if (raiz instanceof  NodoAsignacion)
		    	imprimirAST(((NodoAsignacion)raiz).getExpresion());
		    else if (raiz instanceof  NodoEscribir)
		    	imprimirAST(((NodoEscribir)raiz).getExpresion());
		    else if (raiz instanceof NodoOperacion){
		    	printSpaces();
		    	System.out.println("**Expr Izquierda Operacion**");
		    	imprimirAST(((NodoOperacion)raiz).getOpIzquierdo());
		    	printSpaces();
		    	System.out.println("**Expr Derecha Operacion**");		    	
		    	imprimirAST(((NodoOperacion)raiz).getOpDerecho());
		    } else if (raiz instanceof NodoDeclaracion) {
		    	printSpaces();
		    	System.out.println("**Dato Declaracion**");
		    	imprimirAST(((NodoDeclaracion)raiz).getDato());
		    	printSpaces();
		    	System.out.println("**Expresion Declaracion**");
		    	imprimirAST(((NodoDeclaracion)raiz).getExpresion());
			} else if(raiz instanceof NodoFor) {
				printSpaces();
		    	System.out.println("**Asignacion For**");
		    	imprimirAST(((NodoFor)raiz).getAsignacion());
		    	printSpaces();
		    	System.out.println("**Expresion For**");
		    	imprimirAST(((NodoFor)raiz).getExpresion());
		    	printSpaces();
		    	System.out.println("**Paso For**");
		    	imprimirAST(((NodoFor)raiz).getPaso());
		    	printSpaces();
		    	System.out.println("**Cuerpo For**");
		    	imprimirAST(((NodoFor)raiz).getCuerpo());
			} else if(raiz instanceof NodoFuncion) {
				printSpaces();
		    	System.out.println("**TFunc Funcion**");
		    	imprimirAST(((NodoFuncion)raiz).getTFun());
		    	printSpaces();
		    	System.out.println("**Bloque Funcion**");
		    	imprimirAST(((NodoFuncion)raiz).getBloque());
		    	if(((NodoFuncion)raiz).getArgs()!=null){
		    		System.out.println("**Args Funcion**");
			    	imprimirAST(((NodoFuncion)raiz).getArgs());
			    	printSpaces();
		    	}
			} else if(raiz instanceof NodoIdentificador) {
				printSpaces();
		    	System.out.println("**Expresion Identificador**");
		    	imprimirAST(((NodoIdentificador)raiz).getExpresion());
			} else if(raiz instanceof NodoLlamadaFuncion) {
				printSpaces();
		    	System.out.println("**Parametros Llamada Funcion**");
		    	imprimirAST(((NodoLlamadaFuncion)raiz).getParametros());
			} else if(raiz instanceof NodoPrograma) {
		    	printSpaces();
		    	System.out.println("**Cuerpo Programa**");
		    	imprimirAST(((NodoPrograma)raiz).getCuerpo());
		    	if(((NodoPrograma)raiz).getFunciones()!=null){
		    		printSpaces();
			    	System.out.println("**Funciones Programa**");
			    	imprimirAST(((NodoPrograma)raiz).getFunciones());
		    	}
			} else if(raiz instanceof NodoReturn) {
				printSpaces();
		    	System.out.println("**Expresion Return**");
		    	imprimirAST(((NodoReturn)raiz).getExpresion());
			} 
		    
		    raiz = raiz.getHermanoDerecha();
		  }
		  sangria-=2;
		}

/* Imprime espacios con sangria */
static void printSpaces()
{ int i;
  for (i=0;i<sangria;i++)
	  System.out.print(" ");
}

/* Imprime informacion de los nodos */
static void imprimirNodo( NodoBase raiz )
{
	if(	raiz instanceof NodoRepeat
		||	raiz instanceof NodoLeer
		||	raiz instanceof NodoEscribir  ){
		System.out.println("palabra reservada: "+ raiz.getClass().getName());
	}
	
	if(	raiz instanceof NodoAsignacion )
		System.out.println(":=");
	
	if(	raiz instanceof NodoOperacion ){
		tipoOp sel=((NodoOperacion) raiz).getOperacion();
		if(sel==tipoOp.menorigual)
			System.out.println("<=");
		if(sel==tipoOp.mayorigual)
			System.out.println(">=");
		if(sel==tipoOp.diferente)
			System.out.println("!=");
		if(sel==tipoOp.igual)
			System.out.println("="); 
		if(sel==tipoOp.menor)
			System.out.println("<");
		if(sel==tipoOp.mayor)
			System.out.println(">");
		if(sel==tipoOp.mas)
			System.out.println("+");
		if(sel==tipoOp.menos)
			System.out.println("-");
		if(sel==tipoOp.por)
			System.out.println("*");
		if(sel==tipoOp.entre)
			System.out.println("/");
	}

	if(	raiz instanceof NodoValor ){
		System.out.println("NUM, val= "+ ((NodoValor)raiz).getValor());
	}

	if(	raiz instanceof NodoIdentificador ){
		System.out.println("ID, nombre= "+ ((NodoIdentificador)raiz).getNombre());
	}

}


}
