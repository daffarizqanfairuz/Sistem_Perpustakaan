/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasi_classdiagram;

/**
 *
 * @author idref
 */
public class Buku {
    
    private String judul;
    private String pengarang;
    private String nomorISBN;
    boolean availability;

    public Buku(String judul, String pengarang, String nomorISBN, boolean availability) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.availability = availability;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public boolean isAvailability() {
        return availability;
    }

}
