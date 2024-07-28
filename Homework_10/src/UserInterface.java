import java.util.List;
import java.util.Set;

public interface UserInterface {
    public String getUsername();
    public Set<UserInterface> getContacts();
    public List<MessageInterface> getMessages();

    public void addContact(UserInterface user);
    public void sendMessage(String text, UserInterface recipient);
    public void receiveMessage(MessageInterface message);

}
