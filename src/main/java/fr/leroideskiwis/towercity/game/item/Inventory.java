package fr.leroideskiwis.towercity.game.item;

import fr.leroideskiwis.towercity.comparators.ItemMaterialComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Inventory {

    private List<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
        unstack();
        stack();
        unstack();
        destroyEmptyItems();
    }

    public boolean hasSimilarItem(Item item){
        return items.stream().anyMatch(item1 -> item1.equals(item));
    }

    private Stream<Item> stream(){
        return new ArrayList<>(items).stream();
    }

    private void stack() {
        stream().filter(item -> item.getCount() < item.getMaxSize())
                .sorted(new ItemMaterialComparator())
                .reduce((item, item1) -> {
                    if(item1.isSameMaterial(item)) item1.add(item);
                    return item1;
                });
    }

    private void unstack() {
        stream().forEach(item -> {
            if(item.getCount() <= item.getMaxSize()) return;
            do{
                items.add(item.remove(item.getMaxSize()));
            }while(item.getCount() > item.getMaxSize());
        });
    }

    private void destroyEmptyItems() {
        stream().filter(item -> item.getCount() == 0).forEach(item -> items.remove(item));
    }

    public void add(List<Item> items) {
        items.forEach(this::add);
    }
}
