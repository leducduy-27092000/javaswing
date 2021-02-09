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
import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class InfoFilterImp implements InfoFilter,Serializable{

    @Override
    public boolean isDateOfBirthValid(String dob) 
            throws InvalidDateOfBirthException {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dob);
        if(matcher.matches()){
            return true;
        }else{
            String msg="Ngày sinh không hợp lệ";
            throw new InvalidDateOfBirthException(dob,msg);
        }
    }

    @Override
    public boolean isEmailValid(String email) throws InvalidEmailException {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9._]*@gmail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }else{
            String msg="Email không hợp lệ";
            throw new InvalidEmailException(email,msg);
        }
    }

    @Override
    public boolean isNameValid(String name) throws InvalidNameException {
        String regex = "^(\\w+.*[^0-9].*){1,40}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            return true;
        }else{
            String msg="Tên sinh viên không hợp lệ";
            throw new InvalidNameException(name,msg);
        }
    }

    @Override
    public boolean isPersonIdValid(String personId) throws InvalidPersonIdException {
        String regex = "^[0-9a-zA-Z]{9,13}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(personId);
        if(matcher.matches()){
            return true;
        }else{
            String msg="CMT/Hộ chiếu/Thẻ căn cước không hợp lệ";
            throw new InvalidPersonIdException(personId,msg);
        }
    }

    @Override
    public boolean isPhoneNumberValid(String phone) throws InvalidPhoneNumberException {
        String regex = "^(03|04|07|08|09)[0-9]{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            return true;
        }else{
            String msg="Số điện thoại không hợp lệ";
            throw new InvalidPhoneNumberException(phone,msg);
        }
    }

    @Override
    public boolean isStudentIdValid(String studentId) throws InvalidStudentIdException  {
        String regex = "^[a-zA-Z]{1}\\d{2}[a-zA-Z]{4}\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(studentId);
        if(matcher.matches()){
            return true;
        }else{
            String msg="Mã sinh viên không hợp lệ";
            throw new InvalidStudentIdException(studentId,msg);
        }
    }

    @Override
    public boolean isRecordExist(List<Registering> registerings, Registering r) {
        return registerings.contains(r);
    }
    
}
