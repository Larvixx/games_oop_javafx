package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(position.getX() - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = (dest.getX() > position().getX()) ? 1 : -1;
        int deltaY = (dest.getY() > position().getY()) ? 1 : -1;
        int x = position.getX();
        int y = position.getY();
        for (int index = 0; index < size; index++) {
            x += deltaX;
            y += deltaY;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        int dx = dest.getX();
        int sx = source.getX();
        int dy = dest.getY();
        int sy = source.getY();
        if (dx - sx == sy - dy
                || sx - dx == dy - sy
                || sx - dx == sy - dy
                || sx + dx == sy + dy) {
            return true;
        }
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}