package tpsit;

public class TriangoloRettangolo {
	double base;
	double altezza;
	TriangoloRettangolo(double base, double altezza){
		this.base=base;
		this.altezza=altezza;
	}
	double calcolaArea() {
		return(base*altezza)/2;
	}
	double calcolaPerimetro() {
		return(base+altezza+this.calcolaIpo());
	}
	double calcolaIpo() {
		return  Math.sqrt(base*base+altezza*altezza);
	}
	
	
}
