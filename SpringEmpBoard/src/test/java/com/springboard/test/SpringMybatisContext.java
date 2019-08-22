package com.springboard.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.SpringBoard.mappers.BoardMapper;

//@Runwith�� @ContextConfiguration�� spring-test�� Ȱ���ϴ� �ֳ����̼��̿���. �׽�Ʈ �ڵ忡���� ������ ������ �����ϵ��� ���ݴϴ�.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/root-context.xml")

public class SpringMybatisContext {

	@Autowired	
	BoardMapper boardMapper;
	//SqlSessionTemplate sqpSession;
	

	@Test
	public void test() {
		assertNotNull(boardMapper);
	}

}
