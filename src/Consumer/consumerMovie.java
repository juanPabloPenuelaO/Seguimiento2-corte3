package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumerMovie {
    public static void main(String[] args){
        List<Movies> movies= new ArrayList<>();
        movies.add(new Movies("The Godfather","action",1969));
        movies.add(new Movies("Fast and furious","action",2000));
        movies.add(new Movies("Interestelar","Science Fiction",2014));
        Consumer<List<Movies>> consumer = (listMovies)->{
            for(Movies movie : listMovies){
                System.out.println(movie.getName()+ " - " + movie.getGender() + " - " + movie.getYear());
            }
        };
        consumer.accept(movies);
    }
}
