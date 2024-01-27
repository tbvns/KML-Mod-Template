package xyz.tbvns;

import org.bukkit.Material;
import xyz.prismenetwork.kelpmodloader.Item.ItemType;
import xyz.prismenetwork.kelpmodloader.ModsAPI.Mods;
import xyz.prismenetwork.kelpmodloader.Texture.TextureType;

import java.net.URISyntaxException;


public class Main {
    public Mods load(Mods mods) throws URISyntaxException {
        System.out.println("Hello world from KelpModLoaders API !");
        mods.addBlock("Test", "yay2");
        mods.addItem("Hello", "", "pickaxe", Material.WOODEN_PICKAXE, ItemType.Handheld);
        mods.addTexture("yay2", TextureType.Block(), "textures/yay2.png");
        mods.addTexture("pickaxe", TextureType.Item(), "textures/pickaxe.png");
        mods.getServer().getPluginManager().registerEvents(new ClickEvent(), mods.getKMLplugin());

        return mods;
    }
}