package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigste = varer[0];
		for (int i = 0; i < varer.length - 1; i++) {
			if (varer[i].getPris() < billigste.getPris()) {
				billigste = varer[i];
			}
		}
		return billigste;
	}
	
	public static double totalPris(Vare[] varer) {		
		double totPris = 0.0;
		for (int i = 0; i < varer.length; i++) {
			totPris = totPris + varer[i].getPris();
		}
		return totPris;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] vareTabell = new int[varer.length];
		for (int i = 0; i < varer.length; i++) {
			vareTabell[i] = varer[i].getVarenr();
		}
		return vareTabell;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] pris = new double[varer.length - 1];
		for (int i = 0; i < varer.length -1; i++) {
			pris[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		return pris;
	}
}
