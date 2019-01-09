package com.example.demo.repository;

import com.example.demo.model.Teacher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Description:
 * author yangbiao
 * date 2019/1/7
 */
public interface TeacherRepository extends JpaRepository<Teacher,String>, JpaSpecificationExecutor<Teacher> {

    long countByTeacherName(String a);
}
