/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.InfoFilter;
import Controller.InfoFilterImp;
import Exception.InvalidDateOfBirthException;
import Exception.InvalidEmailException;
import Exception.InvalidNameException;
import Exception.InvalidPersonIdException;
import Exception.InvalidPhoneNumberException;
import Exception.InvalidStudentIdException;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Student extends Person implements Serializable{
    private String studentId;
    private String studentClass;
    private String major;
    private String schoolYear;

    public Student() {
    }

    public Student(String studentId, String studentClass,
            String major, String schoolYear) throws InvalidStudentIdException {
        setStudentId(studentId);
        this.studentClass = studentClass;
        this.major = major;
        this.schoolYear = schoolYear;
    }

    public Student(String studentId, String studentClass, String major,
            String schoolYear, String personId, String fullName, String dob,
            String address, String phoneNumber,String email)
            throws InvalidPersonIdException, InvalidEmailException,
            InvalidPhoneNumberException, InvalidNameException,
            InvalidDateOfBirthException, InvalidStudentIdException {
        super(personId, fullName, dob, email, address, phoneNumber);
        setStudentId(studentId);
        this.studentClass = studentClass;
        this.major = major;
        this.schoolYear = schoolYear;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) throws InvalidStudentIdException {
        InfoFilter filter = new InfoFilterImp();
        try {
            if(filter.isStudentIdValid(studentId))
                this.studentId = studentId;
        } catch (InvalidStudentIdException ex) {
            throw ex;
        }
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.studentId);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return true;
    }
    
    
}
