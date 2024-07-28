import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private String username;
    private Set<UserInterface> contacts;
    private List<MessageInterface> messages;

    public User(String username) {
        this.username = username;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public Set<UserInterface> getContacts() {
        return contacts;
    }

    @Override
    public List<MessageInterface> getMessages() {
        return messages;
    }

    @Override
    public void addContact(UserInterface user) {
        contacts.add(user);
    }

    @Override
    public void sendMessage(String text, UserInterface recipient) {
        Message message = new Message(this, recipient, text, MessageStatus.SENT);
        this.messages.add(message);
        recipient.receiveMessage(message);
    }

    @Override
    public void receiveMessage(MessageInterface message) {
        if (message.getRecipient().equals(this)) {
            this.messages.add(message);
            message.setStatus(MessageStatus.RECEIVED);
        }
    }

    public void readMessage(MessageInterface message) {
        if (message.getRecipient().equals(this) && messages.contains(message)) {
            message.setStatus(MessageStatus.READ);
        }
    }
}
