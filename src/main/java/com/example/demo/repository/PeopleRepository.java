package com.example.demo.repository;

import com.example.demo.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description:
 * author yangbiao
 * date 2019/1/7
 */
public interface PeopleRepository extends JpaRepository<People,String> {

}
