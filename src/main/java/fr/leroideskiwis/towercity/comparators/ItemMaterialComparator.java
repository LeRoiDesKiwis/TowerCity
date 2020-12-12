package fr.leroideskiwis.towercity.comparators;

import fr.leroideskiwis.towercity.game.item.Item;

public class ItemMaterialComparator implements java.util.Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.isSameMaterial(o2) ? 1 : -1;
    }
}
