/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan32.daftarfilm;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Daftar film
 */

class Film{
    String filmName;
    String filmGenre;
    double filmRating;
    int filmDuration;
    
    void nowPlaying(){
        
        System.out.println("Judul Film : "+filmName);
        System.out.println("Genre Film : "+filmGenre);
        System.out.println("Rating Film : "+filmRating);
        System.out.println("Duration Film : "+filmDuration+ "Menit\n");
        
    }
}

public class PBOIF210119056Latihan32DaftarFilm {
    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===\n");
        
        Film film1=new Film();
        film1.filmName="Venom";
        film1.filmGenre="Action, Horror, Scifi";
        film1.filmRating=8.5;
        film1.filmDuration=120;
        film1.nowPlaying();
        
        Film film2=new Film();
        film2.filmName="Small Foot";
        film2.filmGenre="Animation";
        film2.filmRating=9;
        film2.filmDuration=120;
        film2.nowPlaying();
        
        Film film3=new Film();
        film3.filmName="Crazy Rich Asian";
        film3.filmGenre="Comedy";
        film3.filmRating=7;
        film3.filmDuration=119;
        film3.nowPlaying();
        
        Film film4=new Film();
        film4.filmName="Asih";
        film4.filmGenre="Horror";
        film4.filmRating=6;
        film4.filmDuration=100;
        film4.nowPlaying();
    }
    
}
