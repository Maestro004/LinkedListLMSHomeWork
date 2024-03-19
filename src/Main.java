import genre.Genre;
import model.Actor;
import model.DateBase;
import model.Movie;
import model.Producer;
import service.MovieSortableService;
import service.serviceImpl.MovieFindableServiceImpl;
import service.serviceImpl.MovieSortableServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**Movie Task

Movie:

private String name;

private LocalDate year;

private Genre genre;

private Producer producer;

private List<Actor> actors;



Actor:

private String actorFullName;

private String role;



Producer:

private String firstName;

private String lastName;



MovieFindableService:



List<Movie> getAllMovies();

Movie findMovieByFullNameOrPartName(String name);

Movie findMovieByActorName(String actorName);

Movie findMovieByYear(LocalDate year);

Movie findMovieByProducer(String producerFullName);

Movie findMovieByGenre(Genre genre);

Movie findMovieByRole(String role);





MovieSortableService:

void sortMovieByName(String ascOrDesc);

-from A to Z

-from Z to A

void sortByYear(String ascOrDesc);

-Ascending

-Descending

void sortByProducer(String nameOrlastName);



****** Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.

Бардык маалыматтар туура жана так болуп консольго чыксын.
 **/
public class Main {
    public static void main(String[] args) {

        MovieFindableServiceImpl kinonuAluu = new MovieFindableServiceImpl();
        MovieSortableServiceImpl sortKino = new MovieSortableServiceImpl();


        List<Actor> actors1 = Arrays.asList(
                new Actor("Элайджа Вуд", "Фродо"),
                new Actor("Вигго Мортенсен", "Арагорн"),
                new Actor("шон Эстин", "Сэм"),
                new Actor("Иэн Маккеллен", "Гендельф"),
                new Actor("Орладдо Блум", "Легалас"));

        Producer producer1 = new Producer("Питер Джексон", "Барри М Осбарн");

        Movie movie1 = new Movie("Властелин колец", LocalDate.of(2003, 7, 9), Genre.COMEDY, producer1, actors1);
        DateBase.movies.add(movie1);

        List<Actor> actors2 = Arrays.asList(
                new Actor("Леонардо ДиКаприо", "Дом Кобб"),
                new Actor("Кэн Ватанабэ", "Сайто"),
                new Actor("Джозеф Гордон-Левитт", "Артур"),
                new Actor("Марион Котийяр", "Лиза"),
                new Actor("Киллиан Мёрфи", "Роберт Фишер"));

        Producer producer2 = new Producer("Кристофер Нолан", "Дени Томас");

        Movie movie2 = new Movie("Начало", LocalDate.of(2010, 1, 10), Genre.ROMANCE, producer2, actors2);
        DateBase.movies.add(movie2);

        List<Actor> actors3 = Arrays.asList(
                new Actor("Мэттью Макконахи", "Купер"),
                new Actor("Энн Хэтэуэй", "Бранд"),
                new Actor("Ждессика Честейн", "Мерфи"),
                new Actor("Майкл Кейн", "Профессор Бранд"),
                new Actor("Дээвид Джеси", " Ромили"));
        Producer producer3 = new Producer("Линда Обст", "Эмма Томас");
        Movie movie3 = new Movie("Интерстеллар", LocalDate.of(2014, 4, 7), Genre.HISTORY, producer3, actors3);
        DateBase.movies.add(movie3);

        List<Actor> actors4 = Arrays.asList(
                new Actor("Рассел Кроу", "Максимус"),
                new Actor("Хоакин Феникс", "Камодус"),
                new Actor("Конни Нильсон", "Лусиа"),
                new Actor("Риччард Харрис", "Маркус Аурелиос"),
                new Actor("Джимон Хонсу", "Жуда"));

        Producer producer4 = new Producer("Ридли Скотт", "Бранко Лустиг");

        Movie movie4 = new Movie("Гладиатор", LocalDate.of(2000, 5, 6), Genre.ROMANCE, producer4, actors4);
        DateBase.movies.add(movie4);

        List<Actor> actors5 = Arrays.asList(
                new Actor("Тимоте Шаламе", "Пол Атрейдис"),
                new Actor("Джейсон Момоа", "Дункан Идахо"),
                new Actor("Дэйв Батиста", "Глоссу Раббан Харконин"),
                new Actor("Оскар Айзек", "Дуке Лето Атрейдис"),
                new Actor("Джош Бролин", "Гурни Халлек"));

        Producer producer5 = new Producer("Дени Вильнев", "Эрик Рот");

        Movie movie5 = new Movie("Дюна", LocalDate.of(2021, 12, 9), Genre.ROMANCE, producer5, actors5);
        DateBase.movies.add(movie5);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1. Все фильмы
                    2. Фильмы по названию
                    3. Фильмы по имени актеров
                    4. Фильмы по году выхода
                    5. Фильмы по имени продюсеров
                    6. Фильмы по жанру
                    7. Фильмы по ролям
                    -----------------------------------------------
                    8. Сортировать по названием фильмов
                    9. Сортировать по году выпкска
                    10.Сортировать по имени или фамилии продюсеров
                    """);
            try {


                switch (new Scanner(System.in).nextInt()) {
                    case 1 -> {
                        System.out.println(kinonuAluu.getAllMovies());
                    }
                    case 2 -> {
                        System.out.println("Напиши название фильма");
                        System.out.println(kinonuAluu.findMovieByFullNameOrPartName(scanner.nextLine()));
                    }
                    case 3 -> {
                        System.out.println("Напиши имя актера");
                        System.out.println(kinonuAluu.findMovieByActorName(scanner.nextLine()));
                    }
                    case 4 -> {
                        System.out.println("Год выхода фильма");
                        System.out.println(kinonuAluu.findMovieByYear(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())));
                    }
                    case 5 -> {
                        System.out.println("Имя прюдесера? ");
                        System.out.println(kinonuAluu.findMovieByProducer(scanner.nextLine()));

                    }
                    case 6 -> {
                        System.out.println("Жанр фильма? ");
                        System.out.println(kinonuAluu.findMovieByGenre(Genre.valueOf(scanner.nextLine())));
                    }
                    case 7 -> {
                        System.out.println("Какая роль актера?");
                        System.out.println(kinonuAluu.findMovieByRole(scanner.nextLine()));

                    }
                    case 8 -> {
                        System.out.println("Пиши < asc > или < desc >");
                        sortKino.sortMovieByName(scanner.nextLine());
                    }
                    case 9 -> {
                        System.out.println("Напиши < desc > или < asc >");
                        sortKino.sortByYear(scanner.nextLine());
                    }
                    case 10 -> {
                        System.out.println("Напиши < имя > или < фамилия > ");
                        sortKino.sortByProducer(scanner.nextLine());

                    }
                }

            } catch (Exception e) {
                System.err.println(" Exception!\n Напиши еще раз ");
            }
        }

    }


}