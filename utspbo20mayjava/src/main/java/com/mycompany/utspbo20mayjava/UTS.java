/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utspbo20mayjava;

import java.util.Scanner;

/**
 *
 * @author A-27
 */
public class UTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tampilan awal
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh AZZURA CUT WILHELMINA NIM 23201282");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        // Meminta nama pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta jenis kelamin pengguna
        System.out.println("Pilih jenis kelamin:");
        System.out.println("(1) Laki-laki");
        System.out.println("(2) Perempuan");
        int genderChoice = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        String panggilan;
        if (genderChoice == 1) {
            panggilan = "Mas";
        } else if (genderChoice == 2) {
            panggilan = "Mbak";
        } else {
            System.out.println("Pilihan tidak valid, default ke 'Mbak'");
            panggilan = "Mbak";
        }

        // Menampilkan salam
        System.out.println("Selamat Datang " + panggilan + " " + nama);

        // Memulai kalkulator
        boolean lanjutkan = true;
        while (lanjutkan) {
            System.out.println("Kalkulator");

            // Meminta input bilangan 1
            System.out.print("Masukkan bilangan pertama: ");
            double bil1 = scanner.nextDouble();

            // Meminta input bilangan 2
            System.out.print("Masukkan bilangan kedua: ");
            double bil2 = scanner.nextDouble();

            // Meminta input operator matematika
            char operator;
            while (true) {
                System.out.print("Masukkan operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                } else {
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                }
            }

            double hasil = 0;
            boolean operatorValid = true;

            // Menghitung berdasarkan operator
            switch (operator) {
                case '+':
                    hasil = bil1 + bil2;
                    break;
                case '-':
                    hasil = bil1 - bil2;
                    break;
                case '*':
                    hasil = bil1 * bil2;
                    break;
                case '/':
                    if (bil2 != 0) {
                        hasil = bil1 / bil2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        operatorValid = false;
                    }
                    break;
                default:
                    operatorValid = false;
                    break;
            }

            // Menampilkan hasil jika operator valid
            if (operatorValid) {
                System.out.println("Hasil: " + bil1 + " " + operator + " " + bil2 + " = " + hasil);
            }

            // Menanyakan apakah ingin melanjutkan
            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
            char pilihan = scanner.next().charAt(0);
            scanner.nextLine(); // Membersihkan buffer

            if (pilihan == 'n' || pilihan == 'N') {
                lanjutkan = false;
                System.out.println("Thank you for using the calculator. Goodbye!");
            }
        }

        scanner.close();
    }
}
