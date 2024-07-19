package com.lbi.mapper;

import java.util.List;

import com.lbi.model.BoardVO;
import com.lbi.model.Criteria;

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
  
  //�Խ��� ����
  public int delete(int bno);
  
  //�Խø� ���(����¡ ����)
  public List<BoardVO> getListPaging(Criteria cri);
  
  //�Խ��� �� ����
  public int getTotal(Criteria cri);
  
  
}
