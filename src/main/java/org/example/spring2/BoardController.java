package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//싱글톤 + 컨트롤러로 등록
public class BoardController {
    //method + url 요청 분석 -- > 함수 하나
    //method+url 요청 분석 --> 함수하나!
    @GetMapping("createPost")
    public String createPost(BoardVO boardVO, Model model) {
        model.addAttribute("boardVo", boardVO);
        System.out.println("계시판 글쓰기 수행");
        return "createPost";

    }
    @PostMapping("board2")
    public String board2(BoardVO boardVO, Model model) {
        model.addAttribute("boardVo", boardVO);
        return "board2";
    }

    @GetMapping("deletePost")
    public String deletePost(BoardVO boardVO, Model model) {
        model.addAttribute("boardVo", boardVO);
        System.out.println("계시판 글삭제 실행");
        return "deletePost";
    }

    @GetMapping("editPost")
    public String editPost(BoardVO boardVO, Model model) {
        model.addAttribute("boardVo", boardVO);
        System.out.println("계시판 글수정 수행");
        return "editPost";
    }

    @PostMapping("viewPost")
    public String viewPost(BoardVO boardVO, Model model) {
        System.out.println("boardVO.getId(): " + boardVO.getId());
        // 값 확인
        model.addAttribute("boardVo", boardVO);
        return "viewPost";
    }


}
