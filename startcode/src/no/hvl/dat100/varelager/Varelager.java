package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		antall = 0;
		varer = new Vare[n];

	}
	public Vare[] getVarer() {
		Vare[] v = new Vare[varer.length];
		for (int i = 0; i < varer.length; i++) {
			v[i] = varer[i];
		}
		return v;
	}
	public boolean leggTilVare(Vare v) {
		if (antall < varer.length) {
			varer[antall] = v;
			antall++;
			return true;
		} else { return false; }
	}
	public boolean leggTil(int varenr, String navn, double pris) {
		Vare v = new Vare(varenr, navn, pris);
		boolean sattinn = leggTilVare(v);
		return sattinn;
	}
	public Vare finnVare(int varenr) {
		Vare v = null;
		int vnr = 0;;
		for (int i = 0; i < varer.length; i++) {
			vnr = (int) varer[i].getVarenr();
			if (vnr == varenr) {
				v = varer[i];
			}
		}
		return v;
	}
	private String SEP = "==============================";
	public void printVarelager() {
		System.out.println(SEP);
		for (Vare v : varer) {
			System.out.println(v.toString());
		}
		System.out.println(SEP);
	}
}