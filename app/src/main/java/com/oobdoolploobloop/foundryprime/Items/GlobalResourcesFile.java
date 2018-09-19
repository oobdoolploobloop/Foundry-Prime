package com.oobdoolploobloop.foundryprime.Items;

public class GlobalResourcesFile {

    public enum WARFRAME_NAMES{
        DUMMY,
        ASH,
        ASH_PRIME,
        ATLAS,
        BANSHEE,
        BANSHEE_PRIME,
        CHROMA,
        EMBER,
        EMBER_PRIME,
        EQUINOX,
        EXCALIBUR,
        EXCALIBUR_PRIME,
        EXCALIBUR_UMBRA,
        FROST,
        FROST_PRIME,
        GARA,
        HARROW,
        HYDROID,
        HYDROID_PRIME,
        INAROS,
        IVARA,
        KHORA,
        LIMBO,
        LIMBO_PRIME,
        LOKI,
        LOKI_PRIME,
        MAG,
        MAG_PRIME,
        MESA,
        MIRAGE,
        MIRAGE_PRIME,
        NEKROS,
        NEKROS_PRIME,
        NEZHA,
        NIDUS,
        NOVA,
        NOVA_PRIME,
        NYX,
        NYX_PRIME,
        OBERON,
        OBERON_PRIME,
        OCTAVIA,
        REVENANT,
        RHINO,
        RHINO_PRIME,
        SARYN,
        SARYN_PRIME,
        TITANIA,
        TRINITY,
        TRINITY_PRIME,
        VALKYR,
        VALKYR_PRIME,
        VAUBAN,
        VAUBAN_PRIME,
        VOLT,
        VOLT_PRIME,
        WUKONG,
        ZEPHYR,
        ZEPHYR_PRIME
    }

    public enum POLARITY_NAMES{
        BLANK,
        MADURAI,
        VAZARIN,
        NARAMON,
        ZENURIK,
        UNAIRU,
        PENJAGA,
        UMBRA
    }

    private GlobalResourcesFile instance = null;

    public GlobalResourcesFile getGRF(){
        if(instance == null){
            instance = new GlobalResourcesFile();
        }
        return instance;

    }

    private GlobalResourcesFile(){

    }



}
