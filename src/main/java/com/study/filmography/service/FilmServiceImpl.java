package com.study.filmography.service;

import com.study.filmography.dao.FilmDao;
import com.study.filmography.dao.FilmDaoImpl;
import com.study.filmography.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private FilmDao filmDao;

    @Autowired
    public void setFilmDao(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

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
