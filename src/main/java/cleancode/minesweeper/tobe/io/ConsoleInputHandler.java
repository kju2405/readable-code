package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.BoardIndexConverter;
import cleancode.minesweeper.tobe.position.CellPosition;

import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {
    private static final Scanner scanner = new Scanner(System.in);
    private final BoardIndexConverter boardIndexConverter = new BoardIndexConverter();

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }

    @Override
    public CellPosition getCellPositionFromUser() {
        String userInput = scanner.nextLine();

        int rowIndex = boardIndexConverter.getSelectedColIndex(userInput);
        int colIndex = boardIndexConverter.getSelectedRowIndex(userInput);
        return CellPosition.of(rowIndex, colIndex);
    }
}
