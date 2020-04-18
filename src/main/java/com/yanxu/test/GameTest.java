package com.yanxu.test;

import com.yanxu.dao.IThree_code_groud;
import com.yanxu.domain.Three_code_groud;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

public class GameTest {
    private static InputStream inputStream ;
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static IThree_code_groud iThree_code_groud;

    static {
        try {
            //读取配置文件
            inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3.使用构建者创建工厂对象 SqlSessionFactory
            sqlSessionFactory = builder.build(inputStream);
            //4.使用 SqlSessionFactory 生产 SqlSession 对象
           // sqlSession = sqlSessionFactory.openSession();
            ////5.使用 SqlSession 创建 dao 接口的代理对象
            //iThree_code_groud = sqlSession.getMapper(IThree_code_groud.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试添加三码
     */
    @Test
    public void testOneSaveThree_code_Groud(){
        Three_code_groud tcg = new Three_code_groud();
        int id = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = i+1; j <= 10; j++) {
                for (int k = j+1; k < 10; k++) {
                    tcg.setName_one_tcg((i<10 ? "0"+i:"10"));
                    tcg.setName_two_tcg((j<10 ? "0"+j:"10"));
                    tcg.setName_the_tcg((k<10 ?  "0"+k:"10"));
                    tcg.setNow_tcg(120);
                    tcg.setBefore_tcg(120);
                    tcg.setId_tcg(id);
                   // iThree_code_groud.saveThree_code_groud(tcg);
                    id++;
                }
            }
        }
    }

    @After
    public void destroy(){
       // sqlSession.commit();
       // sqlSession.close();
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void usdjfi(){

    }


}
