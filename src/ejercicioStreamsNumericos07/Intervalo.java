package ejercicioStreamsNumericos07;

public class Intervalo {
	private int min,max;

	public Intervalo(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public boolean isInTo(int valor) {
		return valor>=getMin()&&valor<=getMax();
	}
	
}
