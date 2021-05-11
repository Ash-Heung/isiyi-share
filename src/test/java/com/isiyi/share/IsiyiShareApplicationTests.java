package com.isiyi.share;

import com.alibaba.fastjson.JSON;
import com.isiyi.share.mapper.DbTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {IsiyiShareApplication.class})
public class IsiyiShareApplicationTests {

    @Autowired
    DbTestMapper dbTestMapper;


    @Test
    public void testMapper() {
        String correctParam = "A1";
        String WrongParam = "\'A1\' OR 1 = 1";
//        Integer expectedRes = dbTestMapper.selectExpectedCount(correctParam);
//        System.out.println("expectedRes:"+ expectedRes);
        Integer correctRes = dbTestMapper.selectCorrectCount(WrongParam);
        System.out.println("correctRes:" + correctRes);
//        Integer wrongRes = dbTestMapper.selectWrongCount(WrongParam);
//        System.out.println("wrongRes:" + wrongRes);

    }

    /***
     * 68
     * 75
     */
    @Test
    public void testFastJson(){
        String payload21 = "{\"@type\":\"java.lang.AutoCloseable\",\"@type\":\"com.isiyi.share.domain.Test01\",\"cmd\":\"calc.exe\"}";
        JSON.parse(payload21);
    }

}
