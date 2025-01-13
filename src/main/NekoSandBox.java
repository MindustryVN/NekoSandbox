package main;

import mindustry.game.Gamemode;
import neko.anc.contracts.abstracts.GamemodeHandler;

public class NekoSandbox extends GamemodeHandler {

    public NekoSandbox() {
        super("sandbox");
    }

    @Override
    public String getCommandDescription() {
        return "Sandbox comamnd handler";
    }

    @Override
    public String getCommandKeyword() {
        return "sandbox, sbx";
    }

    @Override
    public Gamemode getDefaultGamemode() {
        return Gamemode.sandbox;
    }
}
