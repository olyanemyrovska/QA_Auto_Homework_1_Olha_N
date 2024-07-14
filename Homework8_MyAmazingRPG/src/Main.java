import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Currently, the game is designed for 2 Players only.

        Character firstPlayer = new Character("Gerald", 100, 7, 4);
        Character secondPlayer = new Character("Lara Croft", 100, 6, 5);

        if (arePlayersValid(firstPlayer, secondPlayer)) {
            playBattle(firstPlayer, secondPlayer);
        } else {
            System.out.println("Please configure valid characteristics for players.");
        }
    }

    public static void playBattle(Character firstPlayer, Character secondPlayer) {
        System.out.println("The battle has started!");
        Random random = new Random();
        while (firstPlayer.isAlive() && secondPlayer.isAlive()) {
            //To avoid the case when the first player is always a winner - random attack logic is used.
            if (random.nextBoolean()) {
                firstPlayer.attack(secondPlayer);
                if (secondPlayer.isAlive()) { //double check if player is alive before attack (might be redundant)
                    secondPlayer.attack(firstPlayer);
                }
            } else {
                secondPlayer.attack(firstPlayer);
                if (firstPlayer.isAlive()) {
                    firstPlayer.attack(secondPlayer);
                }
            }
            System.out.println("---------------------------------------------");
        }

        System.out.println(firstPlayer.health == secondPlayer.health ? "It's a draw!" :
                "The winner is " + (firstPlayer.health > secondPlayer.health ? firstPlayer.name : secondPlayer.name) + ". Congratulations!");

        System.out.println("Total players count is " + Character.charactersCount);
    }

    public static boolean arePlayersValid(Character firstPlayer, Character secondPlayer) {
        if (firstPlayer.health != secondPlayer.health) {
            System.out.println("Players must have the same initial health!");
            return false;
        } else if (firstPlayer.strength >= secondPlayer.health || secondPlayer.strength >= firstPlayer.health) {
            System.out.println("Player strength must be lower than opponent's initial health!");
            return false;
        } else if (firstPlayer.defense >= secondPlayer.strength || secondPlayer.defense >= firstPlayer.strength) {
            System.out.println("Player defense must be lower than opponent's strength!");
            return false;
        } else {
            return true;
        }
    }
}

