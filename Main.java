import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println(" SISTEM OPERASIONAL EXPEDITION - FASTSPEED EXPRESS ");
        System.out.println("=========================================================\n");

        List<Armada> daftarArmada = new ArrayList<>();
        daftarArmada.add(new MotorExpress("L 1234 ABC", "Honda Supra", 50, true));
        daftarArmada.add(new MobilBox("B 9988 XYZ", "Isuzu Elf", 2000, 6));
        daftarArmada.add(new DronePengirim("D 8888 MAV", "DJI FlyCart 30", 30, 120));

        System.out.println(">>> REKAP BIAYA OPERASIONAL ARMADA <<<");
        double totalBiayaOperasional = 0;

        for (Armada a : daftarArmada) {
            a.tampilkanInfoArmada();
            totalBiayaOperasional += a.hitungOperasional();
            System.out.println("-----------------------------------------");
        }

        System.out.println("TOTAL OPERASIONAL ARMADA/HARI: Rp " 
                + String.format("%,.2f", totalBiayaOperasional));

        System.out.println("\n=========================================================\n");
        
        List<kurir> daftarKurir = new ArrayList<>();
        daftarKurir.add(new kurirTetap("K-001", "Rudi Hermawan", 120, 3500000, 5000));
        daftarKurir.add(new kurirMitra("M-501", "Bambang Perkasa", 85, 12000));

        System.out.println(">>> DAFTAR GAJI & KAPABILITAS KURIR <<<");
        for (kurir k : daftarKurir) {
            k.tampilkanProfil();

            System.out.println("\n[UJI HAK AKSES & DYNAMIC CASTING]");

            if (k instanceof Akses) {
                Akses akun = (Akses) k;
                akun.login(k.getIdkurir(), "password123");
            } else {
                System.out.println("Info: Kurir " + k.getNama() + " TIDAK MEMILIKI akses login dashboard.");
            }

            if (k instanceof Presensi) {
                Presensi presensi = (Presensi) k;
                presensi.rekamKehadiran();
            }

            System.out.println("-----------------------------------------");
        }
    }
}