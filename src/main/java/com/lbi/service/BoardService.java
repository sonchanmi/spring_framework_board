package com.lbi.service;

import java.util.List;

import com.lbi.model.BoardVO;

public interface BoardService {
	/* �Խ��� ��� */
	public void enroll (BoardVO board);
	
	//�Խ��� ���
	public List<BoardVO> getList();
	
	//�Խ��� ��ȸ
	public BoardVO getPage(int bno);
	
	//�Խ��� ����
	public int modify(BoardVO board);
}
