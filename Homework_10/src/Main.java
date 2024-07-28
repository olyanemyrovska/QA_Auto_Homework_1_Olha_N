public class Main {
    public static void main(String[] args) {


        User anna = new User("Anna");
        User maria = new User("Maria");
        User dmytro = new User("Dmytro");
        User oleg = new User("Oleg");


        anna.addContact(maria);
        anna.addContact(dmytro);

        maria.addContact(anna);

        dmytro.addContact(maria);
        dmytro.addContact(anna);


        anna.sendMessage("Hello, how are you?", maria);
        maria.sendMessage("Hi, what's new?", anna);
        dmytro.sendMessage("Hi, how's your day going? ", anna);

        showUserMessages(anna);
        showUserMessages(maria);
        showUserMessages(dmytro);

        anna.getMessages().forEach(anna::readMessage);
        dmytro.getMessages().forEach(dmytro::readMessage);
        System.out.println();

        showUserMessages(anna);
        showUserMessages(maria);
        showUserMessages(dmytro);

    }

    private static void showUserMessages(User user) {
        System.out.println(user.getUsername() + " messages:");
        for (MessageInterface message : user.getMessages()) {
            System.out.println("From: " + message.getSender().getUsername() +
                    " To: " + message.getRecipient().getUsername() +
                    " Text: " + message.getText() +
                    " Status: " + message.getStatus() +
                    "\n**********************************************************");
        }
    }
}
