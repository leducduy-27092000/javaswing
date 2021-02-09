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
public class InvalidDateOfBirthException extends Exception{
    private String invalidDateOfBirth;

    public InvalidDateOfBirthException(String invalidDateOfBirth,
            String message) {
        super(message);
        this.invalidDateOfBirth = invalidDateOfBirth;
    }

    public String getInvalidDateOfBirth(){
        return invalidDateOfBirth;
    }

    public void setInvalidDateOfBirth(String invalidDateOfBirth) {
        this.invalidDateOfBirth = invalidDateOfBirth;
    }
}
