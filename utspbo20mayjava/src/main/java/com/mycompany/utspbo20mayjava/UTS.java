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
        // Tampilan pembatas
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        // Judul UTS
        System.out.println("UTS 20 Mei 2024 oleh Azzura Cut Wilhelmina NIM 23201282");

        // Tampilan pembatas
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        // Meminta nama pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta jenis kelamin
        System.out.print("Pilih jenis kelamin (1) Laki-laki atau (2) Perempuan: ");
        int jenisKelamin = scanner.nextInt();

        // Menyimpan panggilan berdasarkan jenis kelamin
        String panggilan = (jenisKelamin == 1) ? "Mas" : "Mbak";

        // Menyambut pengguna
        System.out.println("\nSelamat Datang " + panggilan + " " + nama + "!");

        // Menampilkan judul kalkulator
        System.out.println("\nKalkulator");

        // Perulangan untuk kalkulator
        boolean lanjut = true;
        while (lanjut) {
            // Meminta bilangan 1
            System.out.print("\nMasukkan bilangan 1: ");
            double bilangan1 = scanner.nextDouble();

            // Meminta bilangan 2
            System.out.print("Masukkan bilangan 2: ");
            double bilangan2 = scanner.nextDouble();

            // Meminta operator matematika
            System.out.print("Pilih operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Menghitung hasil
            double hasil = 0;
            switch (operator) {
                case '+':
                    hasil = bilangan1 + bilangan2;
                    break;
                case '-':
                    hasil = bilangan1 - bilangan2;
                    break;
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Operator tidak valid. Pilih operator yang valid.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                    continue;
            }

            // Menampilkan hasil perhitungan
            System.out.println("\nHasil: " + hasil);

            // Bertanya apakah ingin melanjutkan
            System.out.print("\nLanjutkan (y)? ");
            String pilihan = scanner.next();
            if (!pilihan.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        // Pesan ucapan terima kasih
        System.out.println("\nThank you for using the calculator. Goodbye!");

        scanner.close(); // Menutup objek Scanner
    }
}