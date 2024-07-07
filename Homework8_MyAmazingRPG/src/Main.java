public class Main {
    public static void main(String[] args) {
        Character MySuperHero1 = new Character("Yevhen", 30, 6, 2);
        Character MySuperHero2 = new Character("Olha", 30, 5, 3);
        // validatePlayers(); //add method
        battle(MySuperHero1, MySuperHero2);
        System.out.println("Total players count is " + Character.charactersCount);

    }


    public static void battle(Character firstPlayer, Character secondPlayer) {
        System.out.println("The battle is started!");

        while (firstPlayer.isAlive() && secondPlayer.isAlive()) {
            firstPlayer.attack(secondPlayer);
            firstPlayer.displayStatus();
            secondPlayer.displayStatus();
            System.out.println("---------------------------------------------");

            secondPlayer.attack(firstPlayer);
            firstPlayer.displayStatus();
            secondPlayer.displayStatus();
            System.out.println("---------------------------------------------");

        }

        System.out.println(firstPlayer.health == secondPlayer.health ? "It's draw!" :
                "The winner is " + (firstPlayer.health > secondPlayer.health ? firstPlayer.name : secondPlayer.name));
    }
}
