package fr.leroideskiwis.towercity.game.item;

import java.util.Objects;

public class Item {

    private Material material;
    private int count;

    public Item(Material material, int count) {
        this.count = count;
        this.material = material;
    }

    private void add(Item item, int number){
        if(item.material == this.material) {
            int toMove = Math.max(item.count, number);
            this.count += toMove;
            item.count -= toMove;
        }
    }

    public void add(Item item){
        add(item, item.count);
    }

    public void add(int number){
        add(new Item(material, number));
    }

    public Item remove(int number){
        this.count -= number;
        return new Item(material, number);
    }

    public int getCount() {
        return count;
    }

    public int getMaxSize(){
        return material.maxCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return count == item.count &&
                material == item.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, count);
    }

    public boolean isSameMaterial(Item item1) {
        return item1.material == this.material;
    }
}
