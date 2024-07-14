public class Character {
    String name;
    int health;
    int strength;
    int defense;
    static int charactersCount = 0;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        charactersCount++;
    }

    public void attack(Character other) {
        if (this.isAlive()) {
            if (this.strength > other.defense) {
                int damage = this.strength - other.defense;
                other.takeDamage(damage);
                System.out.println(this.name + " attacks " + other.name + " for " + damage + " damage!");
            } else {
                System.out.println(this.name + " attack is too weak to damage " + other.name);
            }
            this.displayStatus();
            other.displayStatus();
        }else{
            System.out.println(this.name + " is not alive and cannot attack.");
        }
    }

    public void takeDamage(int damage) {
        if (this.health >= damage) {
            this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println(this.name + " health: " + this.health + ", strength: " + this.strength + ", defense: " + this.defense);
    }
}
