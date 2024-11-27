package com.cinemasystem.impl;

import com.cinemasystem.models.Film;
import com.cinemasystem.models.Musteri;
import com.cinemasystem.models.Salon;

import java.util.ArrayList;
import java.util.List;

public class BiletSistemiImpl implements BiletSistemi {
    private List<Film> filmListesi;
    private List<Musteri> musteriListesi;
    private List<Salon> salonListesi;

    public BiletSistemiImpl() {
        this.filmListesi = new ArrayList<>();
        this.musteriListesi = new ArrayList<>();
        this.salonListesi = new ArrayList<>();
    }

    @Override
    public void filmeKayitOl(Salon salon, Musteri musteri) {
        salon.getFilmMusteriListesi().add(musteri);
    }

    @Override
    public void salonaFilmiAta(Salon salon, Film film) {
        salon.setGuncelFilm(film);
    }

    @Override
    public void filmListesineEkle(Film film) {
        filmListesi.add(film);
    }

    @Override
    public List<Film> filmListesiGetir() {
        return filmListesi;
    }

    @Override
    public void musteriListesineEkle(Musteri musteri) {
        musteriListesi.add(musteri);
    }

    @Override
    public List<Musteri> musteriListesiGetir() {
        return musteriListesi;
    }

    @Override
    public void salonListesineEkle(Salon salon) {
        salonListesi.add(salon);
    }

    @Override
    public List<Salon> salonListesiGetir() {
        return salonListesi;
    }
}
