package com.study.filmography.dao;

import com.study.filmography.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDaoImpl implements FilmDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int filmsCount(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("SELECT count(*) FROM Film", Number.class).getSingleResult().intValue();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Film> allFilms(int page) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("From Film").setFirstResult(10*(page-1)).setMaxResults(10).list();
    }

    @Override
    public void add(Film film) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(film);
    }

    @Override
    public void delete(Film film) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(film);
    }

    @Override
    public void edit(Film film) {
        Session session = sessionFactory.getCurrentSession();
        session.update(film);
    }

    @Override
    public Film getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Film.class, id);
}
}
