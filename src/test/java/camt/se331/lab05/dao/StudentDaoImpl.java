package camt.se331.lab05.dao;

import camt.se331.lab05.entity.Student;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dto on 2/15/2015.
 */
public class StudentDaoImpl {

    List<Student> students;
    public StudentDaoImpl(){
        Student[] students = {  new Student(1,"Somchai","Chaidee",0.77),
                new Student(2,"Yingluck","Shinnawat",3.21),
                new Student(3,"Prayuth","Chanocha",2.68),
                new Student(4,"Sonthi","Limthongkul",1.59),
                new Student(5,"Jayakrit","Hirisajja",4.00),
                new Student(6,"Naterutai","Ruangrit",1.00),
                new Student(7,"Suphitsara","Luo",2.00),
                new Student(8,"Jirapong","Chotisophon",2.99),
                new Student(9,"Wanipon","Onpraphai",1.59),
                new Student(10,"Furong","Li",4.00)
        };
        this.students = Arrays.asList(students);
    }

    public List<Student> getStudents(){
        return this.students;
    }
}
