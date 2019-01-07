package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * author yangbiao
 * date 2019/1/4
 */
@Entity
public class Teacher implements Serializable {
    private static final long serialVersionUID = 2221680234458147539L;

    @Id
    private String id;

    private String teacherName;

    private Integer teacherAge;

//    @OneToMany(targetEntity = Student.class, fetch = FetchType.EAGER, mappedBy = "teacher")
//    private List<Student> students = new ArrayList<>(0);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherAge=" + teacherAge +
//                ", students=" + students +
                '}';
    }
}
