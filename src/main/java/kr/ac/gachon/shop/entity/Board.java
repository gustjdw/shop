package kr.ac.gachon.shop.entity;

import kr.ac.gachon.shop.dto.BoardDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "board")
@Getter
@Setter
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;  // 글 번호

    @Column
    private String title;

    @Column
    private String text;

    public static Board createBoard(BoardDto boardDto) {
        Board board = new Board();
        board.setTitle(boardDto.getTitle());
        board.setText(board.getText());
        return board;
    }
}
