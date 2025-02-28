package com.lbi.mapper;

import java.util.List;

import com.lbi.model.BoardVO;
import com.lbi.model.Criteria;

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
  
  //게시판 삭제
  public int delete(int bno);
  
  //게시만 목록(페이징 적용)
  public List<BoardVO> getListPaging(Criteria cri);
  
  //게시판 총 갯수
  public int getTotal(Criteria cri);
  
  
}
