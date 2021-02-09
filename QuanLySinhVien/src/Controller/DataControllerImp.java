/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.sort.sortRegisteringByNameASC;
import Controller.sort.sortRegisteringByNameDESC;
import Controller.sort.sortRegisteringByTimeASC;
import Controller.sort.sortRegisteringByTimeDESC;
import Controller.sort.sortStudentByIdASC;
import Controller.sort.sortStudentByNameASC;
import Controller.sort.sortStudentByNameDESC;
import Controller.sort.sortSubjectByLessonASC;
import Controller.sort.sortSubjectByLessonDESC;
import Controller.sort.sortSubjectByNameASC;
import Controller.sort.sortSubjectByNameDESC;
import Model.Course;
import Model.Registering;
import Model.Student;
import Model.Subject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class DataControllerImp implements DataController, Serializable{

    @Override
    public <T> void writeToFile(List<T> list, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> List<T> readFromFile(String fileName) {
        File file = new File(fileName);
        List<T> list = new ArrayList<>();
        if (file.length() > 0) {
            try (FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                list = (List<T>) ois.readObject();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void sortSubjectByLessonASC(List<Subject> subjects) {
        Collections.sort(subjects, new sortSubjectByLessonASC());
    }

    @Override
    public void sortSubjectByLessonDESC(List<Subject> subjects) {
        Collections.sort(subjects, new sortSubjectByLessonDESC());
    }

    @Override
    public void sortSubjectByNameASC(List<Subject> subjects) {
        Collections.sort(subjects, new sortSubjectByNameASC());
    }

    @Override
    public void sortSubjectByNameDESC(List<Subject> subjects) {
        Collections.sort(subjects, new sortSubjectByNameDESC());
    }

    @Override
    public List<Subject> searchSubjectByLesson(List<Subject> subjects, int from, int to) {
        List<Subject> s =new ArrayList<>();
        for (Subject subject : subjects) {
            if(subject.getTotalLesson()>=from && subject.getTotalLesson() <= to){
                s.add(subject);
            }
        }
        return s;
    }

    @Override
    public List<Subject> searchSubjectByName(List<Subject> subjects,String name) {
        List<Subject> s =new ArrayList<>();
        String regex = ".*"+name+".*";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        for (Subject subject : subjects) {
            Matcher matcher = pattern.matcher(subject.getSubjectName());
            if(matcher.matches()){
                s.add(subject);
            }
        }
        return s;
    }

    @Override
    public void sortStudentByNameASC(List<Student> students) {
        Collections.sort(students, new sortStudentByNameASC());
    }

    @Override
    public void sortStudentByNameDESC(List<Student> students) {
        Collections.sort(students, new sortStudentByNameDESC());
    }

    @Override
    public void sortStudentByIdASC(List<Student> students) {
        Collections.sort(students, new sortStudentByIdASC());
    }

    @Override
    public List<Student> searchStudentById(List<Student> students, String id) {
        List<Student> s =new ArrayList<>();
        String regex = ".*"+id+".*";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        for (Student student : students) {
            Matcher matcher = pattern.matcher(student.getStudentId());
            if(matcher.matches()){
                s.add(student);
            }
        }
        return s;
    }

    @Override
    public List<Student> searchStudentByMajor(List<Student> students, String major) {
        List<Student> s =new ArrayList<>();
        String regex = ".*"+major+".*";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        for (Student student : students) {
            Matcher matcher = pattern.matcher(student.getMajor());
            if(matcher.matches()){
                s.add(student);
            }
        }
        return s;
    }

    @Override
    public List<Student> searchStudentByName(List<Student> students, String name) {
        List<Student> s =new ArrayList<>();
        String regex = ".*"+name+".*";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        for (Student student : students) {
            Matcher matcher = pattern.matcher(student.getFullName());
            if(matcher.matches()){
                s.add(student);
            }
        }
        return s;
    }

    @Override
    public void sortRegisteringByNameASC(List<Registering> registerings) {
        Collections.sort(registerings, new sortRegisteringByNameASC());
    }

    @Override
    public void sortRegisteringByNameDESC(List<Registering> registerings) {
        Collections.sort(registerings, new sortRegisteringByNameDESC());
    }

    @Override
    public void sortRegisteringByTimeASC(List<Registering> registerings) {
        Collections.sort(registerings, new sortRegisteringByTimeASC());
    }

    @Override
    public void sortRegisteringByTimeDESC(List<Registering> registerings) {
        Collections.sort(registerings, new sortRegisteringByTimeDESC());
    }

    @Override
    public List<Registering> searchRegisteringByTime(List<Registering>
            registerings, Date from, Date to) {
        List<Registering> s =new ArrayList<>();
        long deltaTime = 24*60*60*1000-1;
        for (Registering r : registerings) {
            if(from.getTime() <= r.getTimeRegistering().getTime() &&
                    (to.getTime()+deltaTime)>=r.getTimeRegistering().getTime()){
                s.add(r);
            }
        }
        return s;
    }

    @Override
    public List<Registering> searchRegisteringByName(List<Registering> registerings, String name) {
        List<Registering> s =new ArrayList<>();
        String regex = ".*"+name+".*";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        for (Registering r : registerings) {
            Matcher matcher = pattern.matcher(r.getStudent().getFullName());
            if(matcher.matches()){
                s.add(r);
            }
        }
        return s;
    }

    @Override
    public List<Course> createCourse(List<Registering> rs, List<Subject> subjects) {
        String letters = "ABCDEGHIKLMNOPQRSTUVXY";
        int index = 0;
        List<Course> courses = new ArrayList<>();
        for (Subject s : subjects) {
            Course course = new Course();
            course.setName(s.getSubjectName()+"_"+letters.charAt(index));
            courses.add(course);
            for (Registering r : rs) {
                if(r.getSubject().getSubjectName().
                        compareToIgnoreCase(s.getSubjectName()) == 0){
                    if(course.getRegistering().size()>=3){
                        course = new Course();
                        course.setName(s.getSubjectName()+"_"+letters.charAt(++index));
                        courses.add(course);
                        course.addToCourse(r);
                    }else{
                        course.addToCourse(r);
                    }
                }
            }
            index = 0;
        }
        return courses;
    }
}
