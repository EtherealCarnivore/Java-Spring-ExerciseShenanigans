package com.example.angiriscouncil.Model;

import javax.persistence.*;



@Entity
@Table(name = "angels")
public class Angels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "alias")
    private String alias;

    @Column(name = "weapon")
    private String weapon;

    @Column(name = "element")
    private String element;

    @Column(name = "special_ability")

    private String special_ability;

    @Column(name = "allegiance")
    private String allegiance;

    @Column(name ="weakness")
    private String weakness;

    @Column(name = "health")
    private int health;

    @Column(name = "mana")
    private int mana;

    @Column(name = "damage")
    private int damage;

    @Column(name = "kills")
    private int kills;

    @Column(name = "reincarnations")
    private int reincarnations;

    public Angels() {
    }

    public Angels(String alias, String weapon, String element, String special_ability, String allegiance, String weakness, int health, int mana, int damage, int kills, int reincarnations) {
        this.alias = alias;
        this.weapon = weapon;
        this.element = element;
        this.special_ability = special_ability;
        this.allegiance = allegiance;
        this.weakness = weakness;
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.kills = kills;
        this.reincarnations = reincarnations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getSpecial_ability() {
        return special_ability;
    }

    public void setSpecial_ability(String special_ability) {
        this.special_ability = special_ability;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getReincarnations() {
        return reincarnations;
    }

    public void setReincarnations(int reincarnations) {
        this.reincarnations = reincarnations;
    }
}
