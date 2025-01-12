package main;

import neko.anc.contracts.abstracts.GamemodeHandler;

public class NekoSandBox extends GamemodeHandler {

    public NekoSandBox() {
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
}
