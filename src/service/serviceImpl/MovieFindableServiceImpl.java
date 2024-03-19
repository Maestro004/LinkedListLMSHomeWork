package service.serviceImpl;

import genre.Genre;
import model.Actor;
import model.DateBase;
import model.Movie;
import model.Producer;
import service.MovieFindableService;

import java.time.LocalDate;
import java.util.List;

public class MovieFindableServiceImpl implements MovieFindableService {

    @Override
    public List<Movie> getAllMovies() {
        return DateBase.movies;
    }

    @Override
    public Movie findMovieByFullNameOrPartName(String name) {
        for (Movie movie : DateBase.movies){
            if (movie.getName().equalsIgnoreCase(name)){
                return movie;
            }
        }
        System.err.println("Не найдено");
        return null;
    }

    @Override
    public Movie findMovieByActorName(String actorName) {
        for (Movie movie : DateBase.movies){
            for (Actor actor : movie.getActors()){
                if (actor.getActorFullName().equalsIgnoreCase(actorName)){
                    return movie;
                }
            }
        }
        System.out.println("Актер не найден");
        return null;
    }

    @Override
    public Movie findMovieByYear(LocalDate year) {
        for (Movie movie : DateBase.movies){
            if (movie.getYear().equals(year)){
                return movie;
            }
        }
        System.out.println("Не верный код");

        return null;
    }

    @Override
    public Movie findMovieByProducer(String producerFullName) {
        for (Movie movie : DateBase.movies){
           if (movie.getProducer().getFirstName().equalsIgnoreCase(producerFullName) || movie.getProducer().getLastName().equalsIgnoreCase(producerFullName)){
               return movie;
           }
        }
        System.out.println("Продюсер не найден");
        return null;
    }

    @Override
    public Movie findMovieByGenre(Genre genre) {
        for (Movie movie : DateBase.movies){
            if (movie.getGenre().equals(genre)){
                return movie;

            }
        }
        System.out.println("Такого жанра нет");
        return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        for (Movie movie : DateBase.movies){
            for (Actor actor : movie.getActors()){
                if (actor.getRole().equalsIgnoreCase(role)){
                    return movie;

                }

            }
        }
        System.out.println("Такой роли нет");
        return null;
    }
}
