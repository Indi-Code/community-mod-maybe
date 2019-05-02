package communitymod;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.FoodItemSetting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import java.util.ArrayList;

/**
 * @author Indigo Amann
 */
public class TinyPotato {
    public static final Item ITEM = new TinyPotatoItem();
    public static final Block BLOCK = new TinyPotatoBlock();
    public static void makeMeSumPotatoz() {
        System.out.println("WE LUV TINY POTATOEZ!!!! <3");
        Registry.register(Registry.ITEM, new Identifier(CommunityMod.MODID, "i_tinypotato"), ITEM);
        Registry.register(Registry.BLOCK, new Identifier(CommunityMod.MODID, "b_tinypotato"), BLOCK);
    }
    public static class TinyPotatoItem extends Item {

        public TinyPotatoItem() {
            super(new Item.Settings().food(new FoodItemSetting.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().eatenFast().build()).stackSize(1).itemGroup(ItemGroup.FOOD));
        }
    }
    public static class TinyPotatoBlock extends Block {

        public TinyPotatoBlock() {
            super(FabricBlockSettings.of(Material.EARTH, MaterialColor.PINK).build());
        }
    }
}
