package com.example.anggi.anggipriatna_1202150042_modul3;

/**
 * Created by Anggi on 2/25/2018.
 */

public class ListMenu {

    //deklarasi variable yang akan digunakan

    int gambar;

    String nama;

    String desc;



    //method setter

    public ListMenu(int gambar, String nama, String desc){

        this.gambar=gambar;

        this.nama=nama;

        this.desc=desc;

    }



    //method getter untuk get gambar

    public int getGambar() {

        return gambar;

    }



    //method getter untuk get nama

    public String getNama() {

        return nama;

    }



    //method getter untuk get detail

    public String getDesc() {

        return desc;

    }



}
