package com.lbi.mapper;

import java.util.List;

import com.lbi.model.BoardVO;

//������ ���̽��� ������ �� �ִ� CRUD
public interface BoardMapper {
	//�Խ��ǵ��
  public void enroll(BoardVO board);
  
  //�Խ��� ���
  public List<BoardVO> getList();
  
  //�Խ��� ��ȸ
  public BoardVO getPage(int bno);
  
  //�Խ��� ����
  public int modify(BoardVO board);
}
