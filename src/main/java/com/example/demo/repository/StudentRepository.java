package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Description:
 * author yangbiao
 * date 2019/1/3
 */
public interface StudentRepository extends JpaRepository<Student,String>{

}
