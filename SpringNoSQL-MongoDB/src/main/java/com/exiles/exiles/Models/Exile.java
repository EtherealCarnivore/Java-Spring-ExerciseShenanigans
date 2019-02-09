package com.exiles.exiles.Models;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Exile {

    @Id
    private ObjectId _id;

    private String name;
    private String race;
    private String gender;
    private String archetype;
    private String ascendancy;
    private int damage;
    private int health;
    private int kills;
    private int deaths;

    private ArrayList<Abilities> abilities;


    public Exile() {
    }

    public Exile(ObjectId _id, String name, String race, String gender, String archetype, String ascendancy, int damage, int health, int kills, int deaths, ArrayList<Abilities> abilities) {
        this._id = _id;
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.archetype = archetype;
        this.ascendancy = ascendancy;
        this.damage = damage;
        this.health = health;
        this.kills = kills;
        this.deaths = deaths;
        this.abilities = abilities;
    }


    public String get_id() {
        return _id.toString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
