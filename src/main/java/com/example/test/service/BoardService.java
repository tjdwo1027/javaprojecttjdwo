package com.example.test.service;

import com.example.test.entity.Board;

import java.util.List;

public interface BoardService {
    Board updateBoard(Long id, Board board);

    Board createBoard(Board board);

    void deleteBoard(Long id);

    List<Board> getBoardList();

    List<Board> getBoardListOrderByCreatedAt();

    List<Board> getBoardListByUserId(String userId);

    Board getBoardById(Long id);
}
