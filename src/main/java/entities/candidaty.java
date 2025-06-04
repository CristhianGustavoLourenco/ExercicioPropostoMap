/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Objects;

/**
 *
 * @author crist
 */
public class candidaty {
    
    private String name;
    private Integer quantityVote;

    public candidaty() {
    }

    public candidaty(String name, Integer quantityVote) {
        this.name = name;
        this.quantityVote = quantityVote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityVote() {
        return quantityVote;
    }

    public void setQuantityVote(Integer quantityVote) {
        this.quantityVote = quantityVote;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.quantityVote);
        return hash;
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
        final candidaty other = (candidaty) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.quantityVote, other.quantityVote);
    }
    
    
}
