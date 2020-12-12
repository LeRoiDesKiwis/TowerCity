package fr.leroideskiwis.towercity.game.properties;

public class Food {

    private int food;

    public Food(int food) {
        this.food = food;
    }

    private void feed(Food food){
        this.food += food.food;
    }

    private void hungry(Food food){
        this.food -= food.food;
    }

    @Override
    public String toString() {
        return Integer.toString(food);
    }
}
