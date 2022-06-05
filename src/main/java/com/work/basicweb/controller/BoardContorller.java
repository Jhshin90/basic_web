package com.work.basicweb.controller;

import com.work.basicweb.logics.board.BoardService;
import com.work.basicweb.model.BoardDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardContorller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/getList")
    public List<BoardDto> getList(){

        List<BoardDto> boardList = boardService.getList();
        logger.info("result457 {}", boardList);

        return boardList;
    }

    @GetMapping("/board/{boardSeq}")
    public BoardDto get(@PathVariable int boardSeq){
        return boardService.get(boardSeq);
    }

    @GetMapping("/board/save")
    public void save(BoardDto boardDto){
        boardService.save(boardDto);
    }

    @GetMapping("/board/delete/{boardSeq}")
    public void delete(@PathVariable int boardSeq){
        boardService.delete(boardSeq);
    }


}
