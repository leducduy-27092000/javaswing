/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Course {
    private String name;
    private List<Registering> registering;

    public Course() {
        this.name ="";
        this.registering = new ArrayList<>();
    }

    public Course(String name, List<Registering> registering) {
        this.name = name;
        this.registering = registering;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Registering> getRegistering() {
        return registering;
    }

    public void setRegistering(List<Registering> registering) {
        this.registering = registering;
    }
    
    public void addToCourse(Registering r){
        registering.add(r);
    }
    
}
