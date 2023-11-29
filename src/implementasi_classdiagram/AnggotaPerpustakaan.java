/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasi_classdiagram;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author idref
 */
public class AnggotaPerpustakaan {
    
    private String name;
    private String memberNum;
    private String address;
    private List<Buku> borrowingHistory; 

    public AnggotaPerpustakaan(String name, String memberNum, String address, List<Buku> borrowingHistory) {
        this.name = name;
        this.memberNum = memberNum;
        this.address = address;
        this.borrowingHistory = new ArrayList();
    }
    
    public void PeminjamanBuku(Buku buku){
        if(buku.availability){
            borrowingHistory.add(buku);
            buku.setAvailability(false);
            System.out.println(name + " berhasil meminjam buku dengan judul: " + buku.getJudul());
        }else{
            System.out.println("Maaf, buku dengan judul " + buku.getJudul() + " tidak tersedia untuk dipinjam.");
        }
    }
    
    public void PengembalianBuku(Buku buku) {
        if (borrowingHistory.contains(buku)) {
            buku.setAvailability(true);
            borrowingHistory.remove(buku);
            System.out.println(name + " berhasil mengembalikan buku dengan judul: " + buku.getJudul());
        } else {
            System.out.println("Anda tidak memiliki rekaman peminjaman buku dengan judul " + buku.getJudul());
        }
    }
    
    public void PencarianBuku(String judul, String pengarang, String nomorISBN) {
        borrowingHistory.stream().forEach((buku) -> {
            if (judul != null && buku.getJudul().equals(judul)) {
                System.out.println("Buku ditemukan: " + buku.getJudul());
            } else if (pengarang != null && buku.getPengarang().equals(pengarang)) {
                System.out.println("Buku ditemukan: " + buku.getJudul() + " oleh " + buku.getPengarang());
            } else if (nomorISBN != null && buku.getNomorISBN().equals(nomorISBN)) {
                System.out.println("Buku ditemukan dengan nomor ISBN: " + buku.getNomorISBN());
            }
        });
    }
}
