package com.example.test.controller;


import com.example.test.entity.Board;
import com.example.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PutMapping("/{id}")
    public Board updateBoard(@PathVariable("id") Long id, @RequestBody Board board) {
        return boardService.updateBoard(id, board);
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardService.createBoard(board);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
    }

    @GetMapping("/list")
    public List<Board> getBoardList() {
        return boardService.getBoardList();
    }

    @GetMapping("/listOrderByCreateAt")
    public List<Board> getBoardListOrderByCreatedAt() {
        return boardService.getBoardListOrderByCreatedAt();
    }

    @GetMapping("/byUserId/{userId}")
    public List<Board> getBoardListByUserId(@PathVariable("userId") String userId) {
        return boardService.getBoardListByUserId(userId);
    }

    @GetMapping("/{id}")
    public Board getBoardById(@PathVariable("id") Long id) {
        return boardService.getBoardById(id);
    }
}
