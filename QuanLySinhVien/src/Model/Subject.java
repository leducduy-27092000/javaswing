/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Subject implements Serializable{
    private int subjectID;
    private String subjectName;
    private int totalLesson;
    private String subjectType;
    private static int id=100000;
    
    public Subject(){
        subjectID=id++;
    }
    
    public Subject(int subjectID){
        this.subjectID=subjectID;
    }

    public Subject(String subjectName, int totalLesson, String subjectType) {
        this();
        this.subjectName = subjectName;
        this.totalLesson = totalLesson;
        this.subjectType = subjectType;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(int totalLesson) {
        this.totalLesson = totalLesson;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Subject.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.subjectID;
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
        final Subject other = (Subject) obj;
        if (this.subjectID != other.subjectID) {
            return false;
        }
        return true;
    }
    
}
