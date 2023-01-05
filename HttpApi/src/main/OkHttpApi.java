package main;

import com.alibaba.fastjson.JSONObject;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.io.IOException;

public class OkHttpApi implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Plugin plugin = main.getPlugin(main.class);
        String input = plugin.getConfig().getString("api1");
        HttpApi api = new HttpApi();
        String run;
        try {
            run = api.run(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        com.alibaba.fastjson.JSONObject jsonObject = JSONObject.parseObject(run);
        String content = jsonObject.getJSONObject("result").getString("content");

        if (strings.length == 0){
            commandSender.sendMessage(content);
        }else{
            commandSender.sendMessage("NONONO");
        }
        return false;
    }
}
