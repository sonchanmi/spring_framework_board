package com.lbi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lbi.model.BoardVO;
import com.lbi.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService bservice;

	// �Խ��� ��ȸ
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model) {
       model.addAttribute("pageInfo", bservice.getPage(bno));
	}
	


	/* �Խ��� ��� ������ ���� */
	@GetMapping("/list")
	// => @RequestMapping(value="list", method=RequestMethod.GET)
	public void boardListGET(Model model) {

		log.info("�Խ��� ��� ������ ����");

		model.addAttribute("list", bservice.getList());
	}

	@GetMapping("/enroll")
	// => @RequestMapping(value="enroll", method=RequestMethod.GET)
	public void boardEnrollGET() {

		log.info("�Խ��� ��� ������ ����");
	}

	// �Խ��ǵ��
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {

		log.info("BoardVO : " + board);

		bservice.enroll(board);

		rttr.addFlashAttribute("result", "enrol success");
		return "redirect:/board/list";

	}
	
	/* ���� ������ �̵� */
	@GetMapping("/modify")
	public void boardModifyGET(int bno, Model model) {
	  model.addAttribute("pageInfo", bservice.getPage(bno));
	}
	
	/* ������ ���� */
	@PostMapping("/modify")
	public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
		
		bservice.modify(board);
		
		rttr.addFlashAttribute("result", "modify success");
		
		return "redirect:/board/list";
		
	}
	
}
