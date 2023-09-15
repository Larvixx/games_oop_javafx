package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.assertj.core.api.Assertions.assertThat;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        Cell expected = Cell.A1;
        assertThat(bishop.position()).isEqualTo(expected);

    }

    @Test
    public void copy() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        Figure expected = bishop.copy(Cell.B2);
        assertThat(expected.position()).isEqualTo(Cell.B2);

    }

    @Test
    public void way() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishop.way(Cell.G5)).isEqualTo(expected);
    }

    @Test
    public void whenIsNotDiagonal() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        try {
            bishop.isDiagonal(Cell.A1, Cell.B3);
        } catch (ImpossibleMoveException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }
}