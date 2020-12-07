package blares.report.util;

import java.util.HashMap;

public class OtherMap {

    private HashMap<String, Boolean> otherMap;

    public OtherMap() {
        otherMap = new HashMap<>();
    }

    public void setOtherMap(String playerName, boolean value) {
        otherMap.put(playerName, value);
    }

    public void removePlayer(String playerName) {
        otherMap.remove(playerName);
    }

    public boolean getBooleanPlayer(String playerName) {
        if(otherMap.containsKey(playerName)) {
            return otherMap.get(playerName);
        }
        return false;
    }

}
