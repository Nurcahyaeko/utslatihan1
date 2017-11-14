/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class modelMahasiswa {
    public String nama, nim;
    public modelMahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;

    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

 