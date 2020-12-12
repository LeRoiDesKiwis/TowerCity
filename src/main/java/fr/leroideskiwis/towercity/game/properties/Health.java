package fr.leroideskiwis.towercity.game.properties;

public class Health {

    private int health;

    public Health(int health){
        this.health = health;
    }

    public void damage(Health health){
        this.health -= health.health;
        if (this.health <= 0) this.health = 0;
    }

    public void heal(Health health){
        this.health += health.health;
    }

    @Override
    public String toString() {
        return Integer.toString(health);
    }
}
