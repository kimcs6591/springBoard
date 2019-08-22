// SqlSession�� ������ Ŭ����

package com.SpringBoard.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MybatisSqlSessionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static final Logger logger = (Logger)LoggerFactory.getLogger(MybatisSqlSessionFactory.class); //������� ���ؼ� logger�� ����մϴ�. �� ������Ʈ������ System.out.println�� ������� �ʾƿ�.
	
	public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {	
            	System.out.println(Resources.getDefaultClassLoader());
            	inputStream = Resources.getResourceAsStream("mybatis-config.xml"); //��Ʈ������ ���������� �޾ƿɴϴ�.
                
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //SessionFactoryBuilder�� �̿��ؼ� SessionFactory�� �����ɴϴ�.
                logger.debug("���� ���丮 ���� �Ϸ�");
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return sqlSessionFactory;
    }
	
	public static SqlSession openSession() {
        return getSqlSessionFactory().openSession();  //Session�� ������ �κ�
    }


 

}
