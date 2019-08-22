package com.SpringBoard.util;

import org.apache.ibatis.session.SqlSession;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MybatisSqlSessionFactoryTest {
	SqlSession session;
    private static final Logger logger = LoggerFactory.getLogger(MybatisSqlSessionFactoryTest.class);
 
    @Before //��� �׽�Ʈ �ڵ尡 ����Ǳ� ���� �۵��ϴ� �޼ҵ��Դϴ�. @Before �ֳ����̼����� �������� �� �־��.
    public void tearDown() throws Exception {
        session = MybatisSqlSessionFactory.openSession();
        logger.info("������ ���������� �ҷ��Խ��ϴ�.");
    }
 
    @Test //�׽�Ʈ �ڵ带 ������ִ� �ֳ����̼��Դϴ�.
    public void test() {
    }


}
