package com.example.MiniProject.controller;

import com.example.MiniProject.entity.Board;
import com.example.MiniProject.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/board")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class BoardController {

    @Autowired
    private BoardService service;

    @PostMapping("/register")
    public ResponseEntity<Board> register(@Validated @RequestBody Board board) throws Exception {
        log.info("post register request from vue");

        service.register(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
   /*
    @Autowired
    private BoardService listservice;

    @GetMapping("/lists")
    public String getLists (Model model) throws Exception {
        log.info("getLists(): " + listservice.list());

        model.addAttribute("lists", listservice.list());

        return "/board/lists";
    }

    @GetMapping("/read")
    public String getRead (int boardNo, Model model) throws Exception{
        log.info("read");

        model.addAttribute(boardservice.read(boardNo));

        return "/board/read";
    }


    @PostMapping("/remove")
    public String remove (int boardNo, Model model) throws Exception{
        log.info("remove");

        boardservice.remove(boardNo);

        model.addAttribute("msg", "삭제가 완료되었습니다");

        return "/board/success";
    }



    @GetMapping("/modify")
    public String getModify(int boardNo, Model model) throws Exception{
        log.info("getmodify()");

        model.addAttribute(boardservice.read(boardNo));

        return "/board/modify";
    }

    @PostMapping("/modify")
    public String postModify (Board board, Model model) throws Exception{
        log.info("postModify()");

        boardservice.modify(board);
        model.addAttribute("msg", "수정이 성공적으로 완료되었습니다");

        return  "/board/success";
    }

    @GetMapping("/search")
    public String getSearch(int boardNo, Model model) throws Exception{
        log.info("getSearch()");

        model.addAttribute(boardservice.read(boardNo));

        return "/board/modify";
    }

    @PostMapping("/search")
    public String postSearch (Board board, Model model) throws Exception{
        log.info("postSearch()");

        boardservice.modify(board);
        model.addAttribute("msg", "수정이 성공적으로 완료되었습니다");

        return  "/board/success";
    }

     */
}
