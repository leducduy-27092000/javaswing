/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Administrator
 */
public class InvalidPhoneNumberException extends Exception{
    private String invalidPhoneNumber;

    public InvalidPhoneNumberException(String invalidPhoneNumber,
            String message) {
        super(message);
        this.invalidPhoneNumber = invalidPhoneNumber;
    }

    public String getInvalidPhoneNumber() {
        return invalidPhoneNumber;
    }

    public void setInvalidPhoneNumber(String invalidPhoneNumber) {
        this.invalidPhoneNumber = invalidPhoneNumber;
    }
    
}
