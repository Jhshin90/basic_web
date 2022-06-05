package com.work.basicweb.logics.board.dao;

import com.work.basicweb.model.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    public List<BoardDto> getList();

    public BoardDto get(int boardSeq);

    public void save(BoardDto boardDto);

    public void delete(int boardSeq);

}
