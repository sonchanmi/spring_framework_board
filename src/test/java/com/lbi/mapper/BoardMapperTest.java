package com.lbi.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lbi.model.BoardVO;
import com.lbi.model.Criteria;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	private static final Logger log = LoggerFactory.getLogger(BoardMapperTest.class);
	@Autowired
	private BoardMapper mapper;
    
	
	
	//게시판 페이징 적용 테스트
	@Test
	public void testGetListPageing() {
		
		Criteria cri = new Criteria();
			
			List list = mapper.getListPaging(cri);
			
			list.forEach(board -> log.info(""+board));
		}
		
		
	}
	

