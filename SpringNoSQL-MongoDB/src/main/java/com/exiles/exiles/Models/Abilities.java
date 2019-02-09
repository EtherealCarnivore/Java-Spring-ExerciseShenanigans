package com.exiles.exiles.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Abilities {
    @Id
    private ObjectId _id;

    private String ability;

    private String gemType;

    private int manaCost;

    private int damage;

    private int level;

    public Abilities(ObjectId _id, String ability, String gemType, int manaCost, int damage, int level) {
        this._id = _id;
        this.ability = ability;
        this.gemType = gemType;
        this.manaCost = manaCost;
        this.damage = damage;
        this.level = level;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getGemType() {
        return gemType;
    }

    public void setGemType(String gemType) {
        this.gemType = gemType;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
