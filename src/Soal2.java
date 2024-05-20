/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.time.LocalDate;

public class Soal2 {

    static class Person {
        private String nama;
        private String alamat;
        private String nomorTelepon;
        private String alamatEmail;

        public Person(String nama, String alamat, String nomorTelepon, String alamatEmail) {
            this.nama = nama;
            this.alamat = alamat;
            this.nomorTelepon = nomorTelepon;
            this.alamatEmail = alamatEmail;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getNomorTelepon() {
            return nomorTelepon;
        }

        public void setNomorTelepon(String nomorTelepon) {
            this.nomorTelepon = nomorTelepon;
        }

        public String getAlamatEmail() {
            return alamatEmail;
        }

        public void setAlamatEmail(String alamatEmail) {
            this.alamatEmail = alamatEmail;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + ": " + nama;
        }
    }

    static class Student extends Person {
        public static final String[] STATUS = {"Mahasiswa Baru", "Mahasiswa Tahun Kedua", "Junior", "Senior"};
        private String statusKelas;

        public Student(String nama, String alamat, String nomorTelepon, String alamatEmail, String statusKelas) {
            super(nama, alamat, nomorTelepon, alamatEmail);
            this.statusKelas = statusKelas;
        }

        public String getStatusKelas() {
            return statusKelas;
        }

        public void setStatusKelas(String statusKelas) {
            this.statusKelas = statusKelas;
        }

        @Override
        public String toString() {
            return super.toString() + ", Status Kelas: " + statusKelas;
        }
    }

    static class Employee extends Person {
        private String kantor;
        private double gaji;
        private LocalDate tanggalDipekerjakan;

        public Employee(String nama, String alamat, String nomorTelepon, String alamatEmail, 
                String kantor, double gaji, LocalDate tanggalDipekerjakan) {
            super(nama, alamat, nomorTelepon, alamatEmail);
            this.kantor = kantor;
            this.gaji = gaji;
            this.tanggalDipekerjakan = tanggalDipekerjakan;
        }

        public String getKantor() {
            return kantor;
        }

        public void setKantor(String kantor) {
            this.kantor = kantor;
        }

        public double getGaji() {
            return gaji;
        }

        public void setGaji(double gaji) {
            this.gaji = gaji;
        }

        public LocalDate getTanggalDipekerjakan() {
            return tanggalDipekerjakan;
        }

        public void setTanggalDipekerjakan(LocalDate tanggalDipekerjakan) {
            this.tanggalDipekerjakan = tanggalDipekerjakan;
        }

        @Override
        public String toString() {
            return super.toString() + ", Kantor: " + kantor + ", Gaji: " + gaji + ", Tanggal Dipekerjakan: " + tanggalDipekerjakan;
        }
    }

    static class Faculty extends Employee {
        private int jamKerja;
        private String pangkat;

        public Faculty(String nama, String alamat, String nomorTelepon, String alamatEmail, String kantor, double gaji, LocalDate tanggalDipekerjakan, int jamKerja, String pangkat) {
            super(nama, alamat, nomorTelepon, alamatEmail, kantor, gaji, tanggalDipekerjakan);
            this.jamKerja = jamKerja;
            this.pangkat = pangkat;
        }

        public int getJamKerja() {
            return jamKerja;
        }

        public void setJamKerja(int jamKerja) {
            this.jamKerja = jamKerja;
        }

        public String getPangkat() {
            return pangkat;
        }

        public void setPangkat(String pangkat) {
            this.pangkat = pangkat;
        }

        @Override
        public String toString() {
            return super.toString() + ", Jam Kerja: " + jamKerja + ", Pangkat: " + pangkat;
        }
    }

    static class Staff extends Employee {
        private String title;

        public Staff(String nama, String alamat, String nomorTelepon, String alamatEmail, String kantor, double gaji, LocalDate tanggalDipekerjakan, String title) {
            super(nama, alamat, nomorTelepon, alamatEmail, kantor, gaji, tanggalDipekerjakan);
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return super.toString() + ", Gelar: " + title;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Elm St", "555-555-5555", "john@example.com");
        Student student = new Student("Jane Smith", "456 Oak St", "555-555-5556", "jane@example.com", Student.STATUS[3]);
        Employee employee = new Employee("Jim Brown", "789 Pine St", "555-555-5557", "jim@example.com", "A101", 50000, LocalDate.of(2020, 1, 15));
        Faculty faculty = new Faculty("Dr. Anna White", "321 Maple St", "555-555-5558", "anna@example.com", "B202", 70000, LocalDate.of(2019, 9, 1), 10, "Professor");
        Staff staff = new Staff("Mr. Bob Green", "654 Birch St", "555-555-5559", "bob@example.com", "C303", 40000, LocalDate.of(2018, 6, 10), "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
