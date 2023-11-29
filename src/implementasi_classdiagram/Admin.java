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
public class Admin {
    
    private int nomorAdmin;
    private String namaAdmin;
    private List<Buku> koleksiBuku;

    public Admin(int nomorAdmin, String namaAdmin, List<Buku> koleksiBuku) {
        this.nomorAdmin = nomorAdmin;
        this.namaAdmin = namaAdmin;
        this.koleksiBuku = koleksiBuku;
    }
    
    public String menambahKoleksiBuku(String judul, String pengarang, String nomorISBN){
        Buku newBook = new Buku(judul, pengarang, nomorISBN, true);
        koleksiBuku.add(newBook);
        return "Buku dengan judul" + judul + "Berhasil ditambahkan ke koleksi";
    }
    
    public String restorasiBuku(){
        koleksiBuku.stream().forEach((buku) -> {
            buku.setAvailability(true);
        });
        return "Ketersediaan semua buku dalam koleksi berhasil direstorasi";
    }
}
