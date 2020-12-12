package fr.leroideskiwis.game.item;

import fr.leroideskiwis.towercity.game.item.Inventory;
import fr.leroideskiwis.towercity.game.item.Item;
import fr.leroideskiwis.towercity.game.item.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {

    private Inventory inventory;

    @Before
    public void beforeTest(){
        this.inventory = new Inventory();
    }

    @Test
    public void testStack(){

        inventory.add(new Item(Material.COOKED_MEAT, 68));
        inventory.add(new Item(Material.COOKED_MEAT, 200));

        Assert.assertTrue("Error1", inventory.hasSimilarItem(new Item(Material.COOKED_MEAT, 12)));
        Assert.assertTrue("Error2", inventory.hasSimilarItem(new Item(Material.COOKED_MEAT, 64)));

    }

}
