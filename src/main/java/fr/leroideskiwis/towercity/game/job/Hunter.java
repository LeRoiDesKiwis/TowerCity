package fr.leroideskiwis.towercity.game.job;

import fr.leroideskiwis.towercity.game.item.Item;
import fr.leroideskiwis.towercity.game.Player;

import java.util.List;

public class Hunter implements Job{
    @Override
    public String name() {
        return "Chasseur";
    }

    @Override
    public List<Item> doJob(Player player) {
        return null;
    }
}
