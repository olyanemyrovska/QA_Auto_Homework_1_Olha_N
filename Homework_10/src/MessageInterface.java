public interface MessageInterface {

    public UserInterface getSender();
    public UserInterface getRecipient();
    public MessageStatus getStatus();
    public String getText();
    public void setStatus(MessageStatus status);
}

