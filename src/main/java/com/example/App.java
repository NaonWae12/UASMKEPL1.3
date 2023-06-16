package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputkan angka pertama: ");
        System.out.println("=======Program Kalkulator sederhana=======");
        double angka1 = scanner.nextDouble();

        System.out.print("Inputkan angka kedua: ");
        System.out.println("=======Program Kalkulator sederhana=======");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}
