package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        bishop.position();


    }

    @Test
    public void copy() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        bishop.copy(Cell.B1);

    }
}