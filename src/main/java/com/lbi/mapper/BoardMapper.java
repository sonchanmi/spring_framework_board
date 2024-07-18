package com.lbi.mapper;

import java.util.List;

import com.lbi.model.BoardVO;

//데이터 베이스에 접속할 수 있는 CRUD
public interface BoardMapper {
	//게시판등록
  public void enroll(BoardVO board);
  
  //게시판 목록
  public List<BoardVO> getList();
  
  //게시판 조회
  public BoardVO getPage(int bno);
  
  //게시판 수정
  public int modify(BoardVO board);
}
