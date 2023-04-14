package org.pedro.cubebox;

import org.bukkit.plugin.java.JavaPlugin;

public final class Cubebox extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("mod prendido");
        getServer().getPluginManager().registerEvents(new BlockPlaceListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
