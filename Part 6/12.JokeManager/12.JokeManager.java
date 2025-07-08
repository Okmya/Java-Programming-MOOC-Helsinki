
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author m.brzyska
 */
public class JokeManager {

    private ArrayList<String> jokeStorage;

    public JokeManager() {
        this.jokeStorage = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokeStorage.add(joke);
    }

    public String drawJoke() {
        if (this.jokeStorage.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokeStorage.size());
            return jokeStorage.get(index);

        }

    }

    public void printJokes() {

        for (String joke : jokeStorage) {
            System.out.println(joke);
        }
    }

}
