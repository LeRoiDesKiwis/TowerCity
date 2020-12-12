package fr.leroideskiwis.towercity.game.item;

public enum Material {
    
    MEAT(64), COOKED_MEAT(64), MILK(1);

    public final int maxCount;

    Material(int maxCount) {
        this.maxCount = maxCount;
    }
}
