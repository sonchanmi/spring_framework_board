package com.lbi.service;

import java.util.List;

import com.lbi.model.BoardVO;
import com.lbi.model.Criteria;

public interface BoardService {
	/* �Խ��� ��� */
	public void enroll (BoardVO board);
	
	//�Խ��� ���
	public List<BoardVO> getList();
	
	//�Խ��� ��ȸ
	public BoardVO getPage(int bno);
	
	//�Խ��� ����
	public int modify(BoardVO board);
	
	//�Խ��� ����
	public int delete(int bno);
	
	//�Խ��� ����¡ ����
	public List<BoardVO> getListPaging(Criteria cri);
	
	//�Խù� �� ����
	public int getTotal(Criteria cri);
}
