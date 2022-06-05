package com.work.basicweb.logics.board;

import com.work.basicweb.logics.board.dao.BoardDao;
import com.work.basicweb.model.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDao boardDao;

    public List<BoardDto> getList(){
        return boardDao.getList();
    }

    public BoardDto get(int boardSeq){
        return boardDao.get(boardSeq);
    }

    public void save(BoardDto boardDto){
        boardDao.save(boardDto);
    }

    public void delete(int boardSeq){
        boardDao.delete(boardSeq);
    }


}
