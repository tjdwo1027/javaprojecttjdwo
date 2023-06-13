package com.example.test.service.impl;

package com.example.test.service.impl;

import com.example.test.entity.Board;
import com.example.test.repository.BoardRepository;
import com.example.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board updateBoard(Long id, Board board) {
        Board existingBoard = boardRepository.findById(id).orElseThrow();
        existingBoard.setTitle(board.getTitle());
        existingBoard.setContents(board.getContents());
        existingBoard.setUpdatedAt(LocalDateTime.now());
        return boardRepository.save(existingBoard);
    }

    @Override
    public Board createBoard(Board board) {
        board.setCreatedAt(LocalDateTime.now());
        board.setUpdatedAt(LocalDateTime.now());
        return boardRepository.save(board);
    }

    @Override
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }

    @Override
    public List<Board> getBoardList() {
        return boardRepository.findAll();
    }

    @Override
    public List<Board> getBoardListOrderByCreatedAt() {
        return boardRepository.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public List<Board> getBoardListByUserId(String userId) {
        return boardRepository.findByUserId(userId);
    }

    @Override
    public Board getBoardById(Long id) {
        return boardRepository.findById(id).orElseThrow();
    }
}
