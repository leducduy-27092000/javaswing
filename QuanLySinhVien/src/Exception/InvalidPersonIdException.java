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
public class InvalidPersonIdException extends Exception{
    private String invalidPersonId;

    public InvalidPersonIdException(String invalidPersonId,
            String message) {
        super(message);
        this.invalidPersonId = invalidPersonId;
    }

    public String getInvalidPersonId() {
        return invalidPersonId;
    }

    public void setInvalidPersonId(String invalidPersonId) {
        this.invalidPersonId = invalidPersonId;
    }
}
