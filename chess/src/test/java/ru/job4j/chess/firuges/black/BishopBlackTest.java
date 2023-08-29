package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell expected = Cell.A1;
        BishopBlack bishop = new BishopBlack(Cell.A1);
        assertThat(bishop.position()).isEqualTo(expected);

    }

    @Test
    public void copy() {
        Figure expected = new BishopBlack(Cell.A1);
        BishopBlack bishop = new BishopBlack(Cell.A1);
        expected.copy(Cell.A1);
        assertThat(bishop.position()).isEqualTo(expected.position());

    }
}