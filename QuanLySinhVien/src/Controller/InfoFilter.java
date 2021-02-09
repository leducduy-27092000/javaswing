/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exception.InvalidDateOfBirthException;
import Exception.InvalidEmailException;
import Exception.InvalidNameException;
import Exception.InvalidPersonIdException;
import Exception.InvalidPhoneNumberException;
import Exception.InvalidStudentIdException;
import Model.Registering;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface InfoFilter {
    boolean isDateOfBirthValid(String dob)throws InvalidDateOfBirthException;
    boolean isEmailValid(String email) throws InvalidEmailException;
    boolean isNameValid(String name) throws InvalidNameException;
    boolean isPersonIdValid(String personId) throws InvalidPersonIdException;
    boolean isPhoneNumberValid(String phone) throws InvalidPhoneNumberException;
    boolean isStudentIdValid(String studentId) throws InvalidStudentIdException;
    boolean isRecordExist(List<Registering> registerings, Registering r);
}
