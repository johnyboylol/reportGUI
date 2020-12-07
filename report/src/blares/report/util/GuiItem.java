package blares.report.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiItem {

    private ItemStack guiItem;

    public GuiItem( String itemName, Material material ) {
        ItemStack guiItem = new ItemStack(material);
        ItemMeta guiItemMeta = guiItem.getItemMeta();
        guiItemMeta.setDisplayName(itemName);
        guiItem.setItemMeta(guiItemMeta);

        this.guiItem = guiItem;
    }

    public ItemStack getGuiItem() {
        return guiItem;
    }

}
