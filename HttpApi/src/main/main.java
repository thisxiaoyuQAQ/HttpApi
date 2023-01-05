package main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("api").setExecutor(new OkHttpApi());
        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();
        Bukkit.getConsoleSender().sendMessage("§b================================");
        Bukkit.getConsoleSender().sendMessage("§b[HTTPAPI]API插件已加载");
        Bukkit.getConsoleSender().sendMessage("§b 作者:小雨        QQ:3066156386");
        Bukkit.getConsoleSender().sendMessage("§b   强烈建议添加反馈群:426996480");
        Bukkit.getConsoleSender().sendMessage("§b爱发电 https://afdian.net/@ixiaoyu");
        Bukkit.getConsoleSender().sendMessage("§b================================");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
