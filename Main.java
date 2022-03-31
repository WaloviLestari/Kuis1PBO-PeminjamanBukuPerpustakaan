//Nama : Walovi Lestari Nurrafa
//NPM  : 2015061074
//PSTI C

package com.company;

class DataMahasiswa{
    String nama;
    String npm;
    String email;
    DataBuku buku;

    DataMahasiswa(String nama, String npm, String email){
        this.nama = nama;
        this.npm = npm;
        this.email = email;
    }

    void bukuPinjaman(DataBuku buku){
        this.buku = buku;
    }

    void displayDataPinjaman(){
        System.out.println("Nama               : " + nama);
        System.out.println("NPM                : " + npm);
        System.out.println("Email              : " + email);
        buku.displayDataBuku();
    }
}

class DataBuku{
    String judulBuku;
    String jenisBuku;
    String namaPenulis;
    String tanggalPinjam;

    DataBuku(String judulBuku, String jenisBuku, String namaPenulis, String tanggalPinjam){
        this.judulBuku= judulBuku;
        this.jenisBuku = jenisBuku;
        this.namaPenulis = namaPenulis;
        this.tanggalPinjam = tanggalPinjam;
    }

    void displayDataBuku(){
        System.out.println("Judul Buku         : " + judulBuku);
        System.out.println("Jenis Buku         : " + jenisBuku);
        System.out.println("Penulis            : " + namaPenulis);
        System.out.println("Tanggal Peminjaman : " + tanggalPinjam);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Peminjaman Buku Perpustakaan Universitas Lampung");
        System.out.println("------------------------------------------------");

        DataMahasiswa walovi = new DataMahasiswa("Walovi Lestari Nurrafa", "2015061074", "walovi.lestarinurrafa2074@students.unila.ac.id");
        DataBuku HarryPotter = new DataBuku("Harry Potter-Chamber of Secret", "Fiksi","J. K. Rowling", "31 Maret 2022");

        walovi.bukuPinjaman(HarryPotter);
        walovi.displayDataPinjaman();
        System.out.println("------------------------------------------------");
    }
}
