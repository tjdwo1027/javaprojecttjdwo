package com.example.test.dao;

import com.example.test.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardDAO extends JpaRepository<Board, Long> {
    List<Board> findByUserId(String userId);
}
