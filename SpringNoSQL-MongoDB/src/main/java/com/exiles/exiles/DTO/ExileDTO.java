package com.exiles.exiles.DTO;

import com.exiles.exiles.Models.Abilities;

import java.util.ArrayList;

public class ExileDTO {

    private String archetype;
    private String ascendancy;
    private int damage;
    private int health;
    private int kills;
    private int deaths;

    private ArrayList<Abilities> abilities;

    public ExileDTO(String archetype, String ascendancy, int damage, int health, int kills, int deaths, ArrayList<Abilities> abilities) {
        this.archetype = archetype;
        this.ascendancy = ascendancy;
        this.damage = damage;
        this.health = health;
        this.kills = kills;
        this.deaths = deaths;
        this.abilities = abilities;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public String getAscendancy() {
        return ascendancy;
    }

    public void setAscendancy(String ascendancy) {
        this.ascendancy = ascendancy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public ArrayList<Abilities> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Abilities> abilities) {
        this.abilities = abilities;
    }
}
