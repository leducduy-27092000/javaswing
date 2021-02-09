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
public class InvalidNameException extends Exception{
    private String invalidName;

    public InvalidNameException(String invalidName,
            String message) {
        super(message);
        this.invalidName = invalidName;
    }

    public String getInvalidName(){
        return invalidName;
    }

    public void setInvalidName(String invalidName) {
        this.invalidName = invalidName;
    }
}
