package fr.leroideskiwis.towercity.game.job;

import fr.leroideskiwis.towercity.game.Player;
import fr.leroideskiwis.towercity.game.item.Item;

import java.util.List;

public interface Job {

    String name();

    List<Item> doJob(Player player);
}
