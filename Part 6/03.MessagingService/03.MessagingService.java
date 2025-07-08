
import java.util.ArrayList;

/**
 *
 * @author m.brzyska
 */
public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {

        String wiadomosc = message.getContent();

        if (wiadomosc.length() <= 280) {
            messages.add(message);
        }

    }

    public ArrayList<Message> getMessages() {
        
        return messages;

    }

}
