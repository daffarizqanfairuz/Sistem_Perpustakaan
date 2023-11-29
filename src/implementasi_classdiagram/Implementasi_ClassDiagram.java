/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasi_classdiagram;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author idref
 */
public class Implementasi_ClassDiagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Buku buku1 = new Buku("100 Cara Public Speaking", "Erlangga Putra", "3055", true);
        Buku buku2 = new Buku("Java For Beginner", "Cristhoper Nolan", "3056", false);

        // Membuat objek AnggotaPerpustakaan
        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan("Daffa Rizqan Fairuz", "2217051066", "Gedong Meneng", new ArrayList<>());

        // Meminjam buku
        System.out.println("Meminjam Buku :");
        anggota.PeminjamanBuku(buku1);
        
        System.out.println(""); 
        // Mencoba meminjam buku yang tidak tersedia
        System.out.println("Meminjam Buku yang tidak tersedia :");
        anggota.PeminjamanBuku(buku2);
        
        System.out.println("");
        // Melakukan pencarian buku
        System.out.println("Melakukan Pencarian Buku");
        anggota.PencarianBuku("100 Cara Public Speaking", "Erlangga Putra", "3055");
        
        System.out.println("");
        // Mengembalikan buku
        System.out.println("Mengembalikan Buku :");
        anggota.PengembalianBuku(buku1);
        
        System.out.println("");
        // Mencoba mengembalikan buku yang tidak dipinjam
        System.out.println("Mencoba mengembalikan buku yang tidak dipinjam :");
        anggota.PengembalianBuku(buku2);
       
        // Membuat objek Admin
        Admin admin = new Admin(1, "M.Febri Ardiyan Saputra", new ArrayList<>());
        
        // Menambahkan buku ke koleksi
        admin.menambahKoleksiBuku("Bumi", "Tere Liye", "3555");
        
        System.out.println("");
        //Memberikan Notifikasi
        String pesanNotifikasi = admin.menambahKoleksiBuku(" Bumi ", "Tere Liye", "3555");
        Notifikasi notifikasi = new Notifikasi();
        notifikasi.setPesan(pesanNotifikasi);
        notifikasi.tampilkanPesan();
        
        System.out.println("");
        // Melakukan restorasi buku
        admin.restorasiBuku();
    }
}
