package kr.ac.gachon.shop.repository;

import kr.ac.gachon.shop.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
