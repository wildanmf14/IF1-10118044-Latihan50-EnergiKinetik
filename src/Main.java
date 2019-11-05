
public class Main {

	public static void main(String[] args) {
		Energi ek = new Energi();
        ek.setMassa(145);
        ek.setKecepatan(25);

        System.out.printf("Energi Kinetik \t\t\t: %.4f J%n", ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));
        System.out.printf("Usaha dimulai dari keadaan diam : %.4f J%n", ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));


	}

}
