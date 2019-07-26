package com.study.filmography.dao;

import com.study.filmography.model.Film;

import java.util.List;

public interface FilmDao {
    List<Film> allFilms(int page);
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
    int filmsCount();
}
