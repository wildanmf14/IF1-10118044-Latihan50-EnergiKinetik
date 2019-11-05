
public class Energi {
	 	private int massa;
	    private int kecepatan;

	    public int getMassa() {
	        return massa;
	    }

	    public void setMassa(int massa) {
	        this.massa = massa;
	    }

	    public int getKecepatan() {
	        return kecepatan;
	    }

	    public void setKecepatan(int kecepatan) {
	        this.kecepatan = kecepatan;
	    }

	    public double energiKinetik(int massa, int kecepatan) {
	        double EK = (massa * kecepatan * kecepatan * 0.5) / 1000;
	        return EK;
	    }

	    public double usaha() {
	        double usaha = (energiKinetik(massa, kecepatan) - energiKinetik(massa, 0));
	        return usaha;
	    }
}
