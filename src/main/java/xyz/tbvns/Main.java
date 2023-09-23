package xyz.tbvns;

import xyz.prismenetwork.kelpmodloader.ModsAPI.Mods;


public class Main {
    public static Mods load(Mods mods) {
        System.out.println("Hello world from KelpModLoaders API !");
        mods.addBlock("Test", "stone");

        return mods;
    }
}