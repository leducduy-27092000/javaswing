/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.sort;

import Model.Subject;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class sortSubjectByLessonASC implements Comparator<Subject>{
    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getTotalLesson()-o2.getTotalLesson();
    }
}
