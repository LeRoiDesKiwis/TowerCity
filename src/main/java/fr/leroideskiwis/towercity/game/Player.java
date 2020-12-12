package fr.leroideskiwis.towercity.game;

import fr.leroideskiwis.towercity.game.item.Inventory;
import fr.leroideskiwis.towercity.game.job.Job;
import fr.leroideskiwis.towercity.game.properties.Food;
import fr.leroideskiwis.towercity.game.properties.Health;
import fr.leroideskiwis.towercity.game.properties.Money;

public class Player {

    private Money money;
    private Health health;
    private Food food;
    private Job job;
    private Inventory inventory;

    public Player(Job job){
        this(new Money(100), new Health(100), new Food(100), job);
    }

    public Player(Money money, Health health, Food food, Job job) {
        this.money = money;
        this.health = health;
        this.food = food;
        this.job = job;
    }

    public void makeJob(){
        inventory.add(job.doJob(this));
    }

}
