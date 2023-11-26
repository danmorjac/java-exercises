package Task_13.Ej_3;

public class Fraction {

	private int numer;
	private int denom;

	public Fraction(int numer, int denom)  {

		this.numer=numer;
		this.denom=denom;
	}
	public Fraction(double n) {

		int c=1;
		while (n!=(int)n) {
			n*=10;
			c*=10;
		}
		numer=(int) n;
		denom=c;
	}
	public Fraction add(Fraction other){
		int n = numer * other.denom + other.numer * denom;
		int d = denom * other.denom;
		return new Fraction (n, d);
	}

	public Fraction sub(Fraction other){
		int n = numer * other.denom + other.numer * denom;
		int d = denom * other.denom;
		return new Fraction (n, d);
	}

	public Fraction mult(Fraction other){
		int n = numer * other.numer;
		int d = denom * other.denom;
		return new Fraction (n, d);
	}

	public Fraction div(Fraction other){
		int n = numer * other.denom;
		int d = denom * other.numer;
		return new Fraction (n, d);
	}
	public void simp() {

		int minimum=Math.min(numer, denom);

		for(int i=minimum;i>1;i--) {
			if (numer%i==0 && denom%i==0) {
				numer/=i;
				denom/=i;
			}
		}
	}
	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}
	public String toString() {
		return numer + " , "+denom;
	}

}


