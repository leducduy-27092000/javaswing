/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Course;
import Model.Registering;
import Model.Student;
import Model.Subject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface DataController {
    int SUBJECT =1;
    int STUDENT =2;
    int REGISTERING =3;
    
    String SUBJECT_FILE="SUBJECT.DAT";
    String STUDENT_FILE="STUDENT.DAT";
    String REGISTERING_FILE="REGISTERING.DAT";
    
    
    <T> void writeToFile(List<T> list,String fileName);
    <T> List<T> readFromFile(String fileName);
    
    //SUBJECT
    void sortSubjectByLessonASC(List<Subject>subjects);
    void sortSubjectByLessonDESC(List<Subject>subjects);
    void sortSubjectByNameASC(List<Subject>subjects);
    void sortSubjectByNameDESC(List<Subject>subjects);
    
    List<Subject> searchSubjectByLesson(List<Subject>subjects, int from, int to);
    List<Subject> searchSubjectByName(List<Subject>subjects,String s);
    
    //STUDENT
    void sortStudentByNameASC(List<Student>students);
    void sortStudentByNameDESC(List<Student>students);
    void sortStudentByIdASC(List<Student>students);
    
    List<Student> searchStudentById(List<Student>students, String s);
    List<Student> searchStudentByMajor(List<Student>students,String s);
    List<Student> searchStudentByName(List<Student>students,String s);
    
    //REGISTERING
    void sortRegisteringByNameASC(List<Registering>registerings);
    void sortRegisteringByNameDESC(List<Registering>registerings);
    void sortRegisteringByTimeASC(List<Registering>registerings);
    void sortRegisteringByTimeDESC(List<Registering>registerings);
    
    List<Registering> searchRegisteringByTime(List<Registering>registerings, Date from, Date to);
    List<Registering> searchRegisteringByName(List<Registering>registerings,String s);
    
    //COURSE
    List<Course> createCourse(List<Registering> rs, List<Subject>subjects);
    
}
