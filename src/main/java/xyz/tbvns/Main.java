package xyz.tbvns;

import xyz.prismenetwork.kelpmodloader.ModsAPI.Mods;
import xyz.prismenetwork.kelpmodloader.Pack.CreatePack;
import xyz.prismenetwork.kelpmodloader.Texture.TextureType;

import java.io.InputStream;
import java.net.URISyntaxException;


public class Main {
    public Mods load(Mods mods) throws URISyntaxException {
        System.out.println("Hello world from KelpModLoaders API !");
        mods.addBlock("Test", "yay2");
        System.out.println(this.getClass().getClassLoader().getResource("textures/yay2.png").toURI());
        mods.addTexture("yay2", TextureType.Block(), "textures/ya y2.png");

        return mods;
    }
}