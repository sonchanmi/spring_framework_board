package com.lbi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.lbi.model.BoardVO;

import com.lbi.service.BoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {
    
	private static final Logger log = LoggerFactory.getLogger(BoardServiceTest.class);

	@Autowired
	private BoardService service;
	
	
	//게시판 목록 테스트
	@Test
	public void testGetList() {
		 
		service.getList().forEach(board -> log.info("" + board));
	}
	
		
	}
	
	
	
	
    

	

	


