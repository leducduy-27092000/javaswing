/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.sort;

import Model.Student;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class sortStudentByNameASC implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
