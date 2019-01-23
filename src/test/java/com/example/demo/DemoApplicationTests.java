package com.example.demo;

import com.example.demo.model.People;
import com.example.demo.repository.PeopleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    //缺少jar的依赖
//    @Autowired
//    private JwtService jwtService;
    @Autowired
    private PeopleRepository peopleRepository;

    @Test
    public void contextLoads() {
        //杜绝使用getOne,会出现很多的异常状况,不建议使用
//        People one = peopleRepository.getOne("1");
//        System.err.println(one);
    }

//    @Test
//    public void contextLoads1() {
//        //生成token
//        String token = jwtService.createToken();
//        System.err.println(token);
//        //解析token
//        Claims claims = jwtService.parseToken(token);
//        System.err.println(claims);
//    }
}

