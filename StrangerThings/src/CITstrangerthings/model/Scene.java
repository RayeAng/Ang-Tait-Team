/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tibbit13
 */
public class Scene implements Serializable{
    private String sceneName;
    private String description;
    private String itemPresent;
    private String monsterPresent;
    private String mapSign;
    private boolean restricted;

    public boolean getRestricted() {
        return false;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public String getMapSign() {
        return mapSign;
    }

    public void setMapSign(String mapSign) {
        this.mapSign = mapSign;
    }
    
    private ResourceTypeScene itemPickup;

    public ResourceTypeScene getItemPickup() {
        return itemPickup;
    }

    public void setItemPickup(ResourceTypeScene itemPickup) {
        this.itemPickup = itemPickup;
    }
    private Monster demigorgan;

    public Monster getDemigorgan() {
        return demigorgan;
    }

    public void setDemigorgan(Monster demigorgan) {
        this.demigorgan = demigorgan;
    }

    public Scene() {
    }
    
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemPresent() {
        return itemPresent;
    }

    public void setItemPresent(String itemPresent) {
        this.itemPresent = itemPresent;
    }

    public String getMonsterPresent() {
        return monsterPresent;
    }

    public void setMonsterPresent(String monsterPresent) {
        this.monsterPresent = monsterPresent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.sceneName);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.itemPresent);
        hash = 79 * hash + Objects.hashCode(this.monsterPresent);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneName=" + sceneName + ", description=" + description + ", itemPresent=" + itemPresent + ", monsterPresent=" + monsterPresent + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.sceneName, other.sceneName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.itemPresent, other.itemPresent)) {
            return false;
        }
        if (!Objects.equals(this.monsterPresent, other.monsterPresent)) {
            return false;
        }
        return true;
    }
}
