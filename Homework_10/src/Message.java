public class Message implements MessageInterface {
    private UserInterface sender;
    private UserInterface recipient;
    private String text;
    private MessageStatus status;

    public Message(UserInterface sender, UserInterface recipient, String text, MessageStatus status ) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.status = status;
    }

    @Override
    public UserInterface getSender() {
        return sender;
    }

    @Override
    public UserInterface getRecipient() {
        return recipient;
    }

    @Override
    public MessageStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public String getText() {
        return this.text;
    }

    ;

}
