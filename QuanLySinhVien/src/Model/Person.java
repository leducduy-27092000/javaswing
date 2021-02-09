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
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Person implements Serializable{
    private String personId;
    private String fullName;
    private Date dob;
    private String address;
    private String phoneNumber;
    private String email;

    InfoFilter infoFilter = new InfoFilterImp();
    public Person() {
    }

    public Person(String personId, String fullName, String dob,String email,
            String address, String phoneNumber) throws InvalidPersonIdException,
            InvalidEmailException,InvalidPhoneNumberException,
            InvalidNameException, InvalidDateOfBirthException {
        setPersonId(personId);
        setEmail(email);
        setFullName(fullName);
        setDob(dob);
        this.address = address;
        setPhoneNumber(phoneNumber);
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) throws InvalidPersonIdException  {
        try {
            if(infoFilter.isPersonIdValid(personId)){
                this.personId = personId;   
            }   
        } catch (InvalidPersonIdException ex) {
            throw ex;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws InvalidNameException {
        try {
            if(infoFilter.isNameValid(fullName))
                this.fullName = fullName;
        } catch (InvalidNameException ex) {
            throw ex;
        }
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String dob) throws InvalidDateOfBirthException {
        try {
            if(infoFilter.isDateOfBirthValid(dob)){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                this.dob = dateFormat.parse(dob);
            }
                
        } catch (InvalidDateOfBirthException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
            throws InvalidPhoneNumberException {
        try {
            if(infoFilter.isPhoneNumberValid(phoneNumber))
                this.phoneNumber = phoneNumber;
        } catch (InvalidPhoneNumberException ex) {
            throw ex;
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        try {
            if(infoFilter.isEmailValid(email)){
                this.email = email;
            }   
        } catch (InvalidEmailException ex) {
            throw ex;
        }
    }
}
