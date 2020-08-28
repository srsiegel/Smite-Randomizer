package com.example.myfirstapp;

/**
 * Created by srsie on 8/28/2020.
 */
public class God {
    private String Name;
    private String CharClass;
    private String Pantheon;
    private String DmgType; //Physical/Magical
    private String AttType; //Melee/Ranged
    private String Diff; //Difficulty

    public God(String GodName, String GodClass, String GodPantheon, String GodDmgType, String GodAttType, String GodDiff){
        this.Name = GodName;
        this.CharClass = GodClass;
        this.Pantheon = GodPantheon;
        this.DmgType = GodDmgType;
        this.AttType = GodAttType;
        this.Diff = GodDiff;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCharClass() {
        return CharClass;
    }

    public void setCharClass(String charClass) {
        CharClass = charClass;
    }

    public String getPantheon() {
        return Pantheon;
    }

    public void setPantheon(String pantheon) {
        Pantheon = pantheon;
    }

    public String getDmgType() {
        return DmgType;
    }

    public void setDmgType(String dmgType) {
        DmgType = dmgType;
    }

    public String getAttType() {
        return AttType;
    }

    public void setAttType(String attType) {
        AttType = attType;
    }

    public String getDiff() {
        return Diff;
    }

    public void setDiff(String diff) {
        Diff = diff;
    }

}
