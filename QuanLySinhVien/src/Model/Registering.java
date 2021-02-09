/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Registering implements Serializable{
    private Student student;
    private Subject subject;
    private Date timeRegistering;

    public Registering() {
    }

    public Registering(Student student, Subject subject, Date timeRegistering) {
        this.student = student;
        this.subject = subject;
        this.timeRegistering = timeRegistering;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getTimeRegistering() {
        return timeRegistering;
    }

    public void setTimeRegistering(Date timeRegistering) {
        this.timeRegistering = timeRegistering;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.student);
        hash = 79 * hash + Objects.hashCode(this.subject);
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
        final Registering other = (Registering) obj;
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return true;
    }
    
    
}
