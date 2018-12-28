package com.oobdoolploobloop.foundryprime.Items;

import com.oobdoolploobloop.foundryprime.Webtools.Scraper;
import com.oobdoolploobloop.foundryprime.Webtools.WarframeScraper;

import java.util.List;

public class Warframe {

    private GlobalResourcesFile.WARFRAME_NAMES name;
    private int masteryRank;
    private int healthBase;
    private int healthMax;
    private int armor;
    private int shieldBase;
    private int shieldMax;
    private int energyBase;
    private int EnergyMax;
    private float sprintSpeed;
    private GlobalResourcesFile.POLARITY_NAMES auraPolarity;
    private GlobalResourcesFile.POLARITY_NAMES exilusPolarity;
    private List<GlobalResourcesFile.POLARITY_NAMES> polarities;

    public Warframe(GlobalResourcesFile.WARFRAME_NAMES name){
        this.setName(name);
    }

    public int populateStatsFromScraper(){
        new WarframeScraper().execute(this);
        return 0;
    }

    public GlobalResourcesFile.WARFRAME_NAMES getName(){
        return this.name;
    }

    public String getNameString(){
        String str = this.name.name().toLowerCase().replace("_", " ");
        return (str.substring(0,1).toUpperCase() + str.substring(1));
    }

    public void setName(GlobalResourcesFile.WARFRAME_NAMES name) {
        this.name = name;
    }

    public void setNameString(String setName){
        setName.toUpperCase().replace(" ", "_");
        try{
            this.name = GlobalResourcesFile.WARFRAME_NAMES.valueOf(setName);
        }catch(IllegalArgumentException e){
            this.name = GlobalResourcesFile.WARFRAME_NAMES.DUMMY;
        }
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

    public GlobalResourcesFile.POLARITY_NAMES getAuraPolarity() {
        return auraPolarity;
    }

    public void setAuraPolarity(GlobalResourcesFile.POLARITY_NAMES auraPolarity) {
        this.auraPolarity = auraPolarity;
    }

    public GlobalResourcesFile.POLARITY_NAMES getExilusPolarity() {
        return exilusPolarity;
    }

    public void setExilusPolarity(GlobalResourcesFile.POLARITY_NAMES exilusPolarity) {
        this.exilusPolarity = exilusPolarity;
    }

    public List<GlobalResourcesFile.POLARITY_NAMES> getPolarities() {
        return polarities;
    }

    public void setPolarities(List<GlobalResourcesFile.POLARITY_NAMES> polarities) {
        this.polarities = polarities;
    }

}
