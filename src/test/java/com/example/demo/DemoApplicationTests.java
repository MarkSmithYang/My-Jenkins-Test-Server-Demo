package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.yb.service.JwtService;
import io.jsonwebtoken.Claims;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.persistence.criteria.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    public static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    private JwtService jwtService;
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void contextLoads() {
        List<Teacher> all = teacherRepository.findAll((root, query, cb) -> {
            //处理teacher实体里的查询条件
            Predicate teacherName = cb.like(root.get("teacherName"), "jack");
            //teacher内连接student,获取能查询student的"root",因为这里使用Teacher的Repository
            Join<Teacher, Student> studentRoot = root.join("teacherId", JoinType.INNER);
            //处理student实体里的查询条件
            Predicate studentName = cb.like(studentRoot.get("studentName"), "tom");
            //组合参数条件形成sql语句
            query.where(teacherName, studentName);
            //通过query这种方式来的话,就不需要返回Predicate了,可以少好几行代码,而且更好使用or(或)关系
            return null;
        });
        System.err.println(all);
    }

    @Test
    public void contextLoads1() {
        //生成token
        String token = jwtService.createToken();
        System.err.println(token);
        //解析token
        Claims claims = jwtService.parseToken(token);
        System.err.println(claims);
    }
}

