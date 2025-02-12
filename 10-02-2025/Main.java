class Main {

	public static void main(String[] pepe) {

		Operacion op = new Operacion(10.0, 10.0, Operando.SUMA);
		ICalculadora calculadora = new CalculadoraImpl();
		
		Double resultado = calculadora.calcular(op);
		System.out.println("Tu resultado es: " + resultado);
	}

}