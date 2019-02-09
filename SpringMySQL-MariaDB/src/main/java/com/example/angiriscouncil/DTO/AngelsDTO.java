package com.example.angiriscouncil.DTO;

public class AngelsDTO {



    private int ID;


    private String weapon;

    private String element;

    private String allegiance;

    private int reincarnations;

    private int kills;

    public AngelsDTO() {
    }

    public AngelsDTO(int ID, String weapon, String element, String allegiance, int reincarnations, int kills) {
        this.ID = ID;
        this.weapon = weapon;
        this.element = element;
        this.allegiance = allegiance;
        this.reincarnations = reincarnations;
        this.kills = kills;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public int getReincarnations() {
        return reincarnations;
    }

    public void setReincarnations(int reincarnations) {
        this.reincarnations = reincarnations;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}