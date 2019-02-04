package com.example.angiriscouncil.Model;

import javax.persistence.*;



@Entity
@Table(name = "aaaa")
public class Angels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "weapon")
    private String weapon;

    @Column(name = "element")
    private String element;

    @Column(name = "allegiance")
    private String allegiance;

    @Column(name = "health")
    private int health;

    @Column(name = "damage")
    private int damage;

    @Column(name = "kills")
    private int kills;

    @Column(name = "reincarnations")
    private int reincarnations;

    @Column(name = "isArchangel")
    private boolean isArchangel;

    public Angels() {
    }

    public Angels(String firstName, String weapon, String element, String allegiance, int health, int damage, int kills, int reincarnations, boolean isArchangel) {
        this.firstName = firstName;
        this.weapon = weapon;
        this.element = element;
        this.allegiance = allegiance;
        this.health = health;
        this.damage = damage;
        this.kills = kills;
        this.reincarnations = reincarnations;
        this.isArchangel = isArchangel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public boolean isArchangel() {
        return isArchangel;
    }

    public void setArchangel(boolean archangel) {
        isArchangel = archangel;
    }
}
