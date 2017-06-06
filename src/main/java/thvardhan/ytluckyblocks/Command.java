package thvardhan.ytluckyblocks;

import java.util.ArrayList;

public class Command {

    private ArrayList<String> cmd;

    public Command(){
        cmd=new ArrayList<String>();
    }

    private void addCommand(String rawCommand){
        cmd.add(rawCommand);
    }


    public ArrayList<String> getCmd() {
        return cmd;
    }

    public void addCommand(ArrayList<String> rawCommands){
        for (String str:
             rawCommands) {
            this.cmd.add(str);
        }
    }

}
