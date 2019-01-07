package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * author yangbiao
 * date 2019/1/3
 */
@Entity
public class Student implements Serializable {
    private static final long serialVersionUID = -3272421320600950226L;

    @Id
    private String id;

    private String studentName;

    private String book;

    private Integer studentAge;

    private String teacherId;

//    @ManyToOne(targetEntity = Teacher.class,fetch = FetchType.LAZY)
//    private Teacher teacher;

    @Transient
    private List<String> books = new ArrayList<>(0);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

//    public Teacher findTeacher() {
//        return teacher;
//    }
//
//    public void addTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", book='" + book + '\'' +
                ", studentAge=" + studentAge +
                ", books=" + books +
                '}';
    }
}
