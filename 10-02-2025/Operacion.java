class Operacion {
	private Double x1;
	private Double x2;
	private Operando op;

	Operacion(Double x1, Double x2, Operando op) {
	this.x1= x1;
	this.x2 = x2;
	this.op = op; 
	}

	public Double getx1(){
		return this.x1;
	}

	public Double getx2(){
                return this.x2;
        }

	public Operando getOperacion(){
                return this.op;
        }

}

