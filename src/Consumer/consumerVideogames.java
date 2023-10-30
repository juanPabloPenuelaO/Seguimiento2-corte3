package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumerVideogames {
    public static void main(String[] args){
        List<Videogames> videogames = new ArrayList<>();
        videogames.add(new Videogames("Grand theft Auto","Action",500));
        videogames.add(new Videogames("God Of War","Adventure",300));
        videogames.add(new Videogames("League Of Legends","Rol",150));
        videogames.add(new Videogames("Call Of Duty","Shooter",700));
        Consumer <List<Videogames>> consumer = (listVideogames) ->{
            for(Videogames videogame : listVideogames){
                System.out.println(videogame.getName() + " - " + videogame.getGender() + " - " + videogame.getAmount());
            }
        };
        consumer.accept(videogames);
    }
}
