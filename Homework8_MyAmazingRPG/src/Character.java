public class Character {
    String name;
    int health;
    int strength;
    int defense;
    static int charactersCount;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public void attack(Character other) {
        if (this.health > 0) {
            if (this.strength < other.defense) {
                System.out.println(this.name + ": your current strength is not enough to attack " + other.name);

            } else {
                other.takeDamage(this.strength - other.defense);

            }
        }
    }

    public void takeDamage(int damage) {
        if (this.health > 0 && this.health >= damage) {
            this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println(this.name + " health: " + this.health + ", strength is: " + this.strength + ", defence: " + this.defense);
    }
}
