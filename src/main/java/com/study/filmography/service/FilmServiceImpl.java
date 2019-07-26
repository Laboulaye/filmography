package com.study.filmography.service;

import com.study.filmography.dao.FilmDao;
import com.study.filmography.dao.FilmDaoImpl;
import com.study.filmography.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public List<Film> allFilms() {
        return filmDao.allFilms();
    }

    @Override
    @Transactional
    public void add(Film film) {
        filmDao.add(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        filmDao.delete(film);
    }

    @Override
    @Transactional
    public void edit(Film film) {
        filmDao.edit(film);
    }

    @Override
    @Transactional
    public Film getById(int id) {
        return filmDao.getById(id);
    }
}
