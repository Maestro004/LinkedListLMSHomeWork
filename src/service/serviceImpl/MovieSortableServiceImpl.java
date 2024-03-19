package service.serviceImpl;

import model.DateBase;
import model.Movie;
import service.MovieSortableService;

import java.util.Comparator;

public class MovieSortableServiceImpl implements MovieSortableService {

    @Override
    public void sortMovieByName(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")) {
            Comparator<Movie> movieComparatorName = Comparator.comparing(Movie::getName);
            DateBase.movies.sort(movieComparatorName);
            System.out.println(DateBase.movies);
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            Comparator<Movie> movieComparatorName = Comparator.comparing(Movie::getName).reversed();
            DateBase.movies.sort(movieComparatorName);
            System.out.println(DateBase.movies);
        }
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")) {
            Comparator<Movie> movieComparatorYear = Comparator.comparing(Movie::getYear);
            DateBase.movies.sort(movieComparatorYear);
            System.out.println(DateBase.movies);
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            Comparator<Movie> movieComparatorYear = Comparator.comparing(Movie::getYear).reversed();
            DateBase.movies.sort(movieComparatorYear);
            System.out.println(DateBase.movies);
        }

    }

    @Override
    public void sortByProducer(String nameOrlastName) {
        if (nameOrlastName.equalsIgnoreCase("имя")) {
            Comparator<Movie> movieComparatorProName = Comparator.comparing(movie -> movie.getProducer().getFirstName());
            DateBase.movies.sort(movieComparatorProName);
            System.out.println(DateBase.movies);

        } else if (nameOrlastName.equalsIgnoreCase("фамилия")) {
            Comparator<Movie> movieComparatorProName = Comparator.comparing(movie -> movie.getProducer().getLastName());
            DateBase.movies.sort(movieComparatorProName);
            System.out.println(DateBase.movies);


        } else {
            System.out.println("Пиши правильно");

        }
    }
}
