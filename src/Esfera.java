
public class Esfera extends Figura {

	double raio;

	public Esfera(double r) {
		this.raio = r;
	}


	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double diagonal() {
		return 0;
	}
	@Override
	public double volume() {
		return (4/3)*Math.PI*this.raio;
	}

}
