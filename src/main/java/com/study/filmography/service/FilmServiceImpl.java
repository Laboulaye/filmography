package com.study.filmography.service;

import com.study.filmography.dao.FilmDao;
import com.study.filmography.dao.FilmDaoImpl;
import com.study.filmography.model.Film;

import java.util.List;

public class FilmServiceImpl implements FilmService {
    private FilmDao filmDao = new FilmDaoImpl();

    @Override
    public List<Film> allFilms() {
        return filmDao.allFilms();
    }

    @Override
    public void add(Film film) {
        filmDao.add(film);
    }

    @Override
    public void delete(Film film) {
        filmDao.delete(film);
    }

    @Override
    public void edit(Film film) {
        filmDao.edit(film);
    }

    @Override
    public Film getById(int id) {
        return filmDao.getById(id);
    }
}
