/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Soal1 {
    class Geometris {
        private String warna;
        private boolean terisi;

        public Geometris() {
            this.warna = "Putih";
            this.terisi = false;
        }

        public Geometris(String warna, boolean terisi) {
            this.warna = warna;
            this.terisi = terisi;
        }

        public String getWarna() {
            return warna;
        }

        public void setWarna(String warna) {
            this.warna = warna;
        }

        public boolean getTerisi() {
            return terisi;
        }

        public void setTerisi(boolean terisi) {
            this.terisi = terisi;
        }
    }

    class Segitiga extends Geometris {
        private double sisi1;
        private double sisi2;
        private double sisi3;

        public Segitiga() {
            super();
            this.sisi1 = 1.0;
            this.sisi2 = 1.0;
            this.sisi3 = 1.0;
        }

        public Segitiga(double sisi1, double sisi2, double sisi3) {
            super();
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
        }

        public double getSisi1() {
            return sisi1;
        }

        public void setSisi1(double sisi1) {
            this.sisi1 = sisi1;
        }

        public double getSisi2() {
            return sisi2;
        }

        public void setSisi2(double sisi2) {
            this.sisi2 = sisi2;
        }

        public double getSisi3() {
            return sisi3;
        }

        public void setSisi3(double sisi3) {
            this.sisi3 = sisi3;
        }

        public double getLuas() {
            double s = (sisi1 + sisi2 + sisi3) / 2;
            return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
        }

        public double getKeliling() {
            return sisi1 + sisi2 + sisi3;
        }

        @Override
        public String toString() {
            return "Segitiga: sisi1 = " + sisi1 + ", sisi2 = " + sisi2 + ", sisi3 = " + sisi3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama segitiga: ");
        double sisi1 = scanner.nextDouble();

        System.out.print("Masukkan sisi kedua segitiga: ");
        double sisi2 = scanner.nextDouble();

        System.out.print("Masukkan sisi ketiga segitiga: ");
        double sisi3 = scanner.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String warna = scanner.next();

        System.out.print("Masukkan True jika segitiga terisi, False jika tidak: ");
        boolean terisi = scanner.nextBoolean();

        Soal1 soal1 = new Soal1();
        Segitiga segitiga = soal1.new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println("\nInformasi segitiga:");
        System.out.println(segitiga);
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.getTerisi());

        scanner.close();
    }
}
