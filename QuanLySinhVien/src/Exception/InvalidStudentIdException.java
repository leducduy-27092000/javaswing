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
public class InvalidStudentIdException extends Exception{
    private String invalidStudentId;

    public InvalidStudentIdException(String invalidStudentId,
            String message) {
        super(message);
        this.invalidStudentId = invalidStudentId;
    }

    public String getInvalidStudentId() {
        return invalidStudentId;
    }

    public void setInvalidStudentId(String invalidStudentId) {
        this.invalidStudentId = invalidStudentId;
    }
}
