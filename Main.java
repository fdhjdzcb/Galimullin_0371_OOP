import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Builder / строитель
        films film = new films();
        film.setName("Аватар 2");
        film.setGenre("Фэнтези");
        film.setCountry("США");
        film.setAgeLimit(16);
        System.out.println(film.getName());
        System.out.println(film.getGenre());
        System.out.println(film.getCountry());


        // Iterator / итератор
        List<String> data = Arrays.asList("Чужой", "Ярость", "Ирония судьбы");
        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
