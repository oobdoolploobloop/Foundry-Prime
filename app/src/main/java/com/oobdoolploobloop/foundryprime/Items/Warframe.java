package com.oobdoolploobloop.foundryprime.Items;

import com.oobdoolploobloop.foundryprime.Webtools.Scraper;

import java.util.List;

public class Warframe {


    private String name;
    private int masteryRank;
    private int healthBase;
    private int healthMax;
    private int armor;
    private int shieldBase;
    private int shieldMax;
    private int energyBase;
    private int EnergyMax;
    private float sprintSpeed;
    private Polarity.POLARITY auraPolarity;
    private Polarity.POLARITY exilusPolarity;
    private List<Polarity.POLARITY> polarities;

    public Warframe(String name){
        this.name = name;
    }

    public int populateStatsFromScraper(Scraper scraper){
        return scraper.populateWarframeStats(this);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMasteryRank() {
        return masteryRank;
    }

    public void setMasteryRank(int masteryRank) {
        this.masteryRank = masteryRank;
    }

    public int getHealthBase() {
        return healthBase;
    }

    public void setHealthBase(int healthBase) {
        this.healthBase = healthBase;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getShieldBase() {
        return shieldBase;
    }

    public void setShieldBase(int shieldBase) {
        this.shieldBase = shieldBase;
    }

    public int getShieldMax() {
        return shieldMax;
    }

    public void setShieldMax(int shieldMax) {
        this.shieldMax = shieldMax;
    }

    public int getEnergyBase() {
        return energyBase;
    }

    public void setEnergyBase(int energyBase) {
        this.energyBase = energyBase;
    }

    public int getEnergyMax() {
        return EnergyMax;
    }

    public void setEnergyMax(int energyMax) {
        EnergyMax = energyMax;
    }

    public float getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(float sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public Polarity.POLARITY getAuraPolarity() {
        return auraPolarity;
    }

    public void setAuraPolarity(Polarity.POLARITY auraPolarity) {
        this.auraPolarity = auraPolarity;
    }

    public Polarity.POLARITY getExilusPolarity() {
        return exilusPolarity;
    }

    public void setExilusPolarity(Polarity.POLARITY exilusPolarity) {
        this.exilusPolarity = exilusPolarity;
    }

    public List<Polarity.POLARITY> getPolarities() {
        return polarities;
    }

    public void setPolarities(List<Polarity.POLARITY> polarities) {
        this.polarities = polarities;
    }

}
