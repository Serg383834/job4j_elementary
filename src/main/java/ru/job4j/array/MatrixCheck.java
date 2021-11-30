package ru.job4j.array;

// В этом задании нужно проверить то, что строка в двухмерном массиве целиком
// заполнена символом 'X'.
// Добавить аналогичный метод, который проверит, чтобы все
//элементы в колонке были заполнены символом 'X'.

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                    result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

//    Игровое поле представляет собой массив, заполненный символами ' ' (пробел)
//    и 'X' -6.7.4. Выигрышные комбинации в сокобан [#53859 #9676]  крестик.
//    Цель игры - расположить крестики в линию на 5 элементов. Элементы X должны
//    располагаться либо вертикально, либо горизонтально.
//    Ваша задача - написать метод, который будет проверять, находится ли на поле
//    выигрышная ситуация.

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < 4; i++) {
            if (board[i][i] == 'X') {
                monoHorizontal(board, i);
                monoVertical(board, i);
                result = true;
                break;
            }
        }
        return result;
    }
}
