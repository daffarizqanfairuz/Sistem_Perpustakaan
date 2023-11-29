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
public class Notifikasi {
   private String pesan;
    
   public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public void tampilkanPesan() {
        System.out.println("Notifikasi: " + pesan + " ");
    }
}
