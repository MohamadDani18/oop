import service.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static MotorService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new MotorService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("inputan salah, coba untuk memilih sesuai menu");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan");
                System.out.println("Aplikasi kami.");
        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n=--= Form Hapus Data =--=");
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.deleteData(id);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String id, nama, merk;

        System.out.println("\n=--= Form Ubah Data =--=");
        System.out.print("ID : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MERK MOTOR : ");
        merk = scanner.nextLine();
        service.updateData(new Motor(id, nama, merk));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String id, nama, merk;

        System.out.println("\n=--= Form Tambah Data =--=");
        System.out.print("ID : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MERK MOTOR : ");
        merk = scanner.nextLine();
        service.addData(new Motor(id, nama, merk));
    }

    private static void showMenu() {
        System.out.println("=---= Aplikasi Service Motor =---=");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("----------------------------------=");
        System.out.print  ("pilihan => ");
    }

}