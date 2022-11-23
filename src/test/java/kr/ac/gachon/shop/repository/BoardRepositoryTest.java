package kr.ac.gachon.shop.repository;


import kr.ac.gachon.shop.entity.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardRepositoryTest {
    @Autowired
    BoardRepository boardRepository;

    @Test
    @DisplayName("글 생성 확인")
    public void createBoard() {
        Board board = new Board();
        board.setTitle("글 제목");
        Board savedBoard = boardRepository.save(board);
        System.out.println(savedBoard.toString());
    }

}