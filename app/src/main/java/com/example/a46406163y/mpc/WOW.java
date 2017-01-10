package com.example.a46406163y.mpc;


import java.io.Serializable;

public class WOW implements Serializable {

    private String name;
    private String description;
    private int health;
    private int level;
    private int heroichealth;
    private int heroiclevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeroiclevel() {
        return heroiclevel;
    }

    public void setHeroiclevel(int heroiclevel) {
        this.heroiclevel = heroiclevel;
    }

    public int getHeroichealth() {
        return heroichealth;
    }

    public void setHeroichealth(int heroichealth) {
        this.heroichealth = heroichealth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WOW{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", heroichealth=" + heroichealth +
                ", heroiclevel=" + heroiclevel +
                '}';
    }
}

