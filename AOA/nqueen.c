#include<stdio.h>

#define n 4

int isSafe(char mat[n][n], int row, int col) {
    int i, j;

    // Check this row on left side
    for (i = 0; i < col; i++)
        if (mat[row][i] == 'Q')
            return 0;

    // Check upper diagonal on left side
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
        if (mat[i][j] == 'Q')
            return 0;

    // Check lower diagonal on left side
    for (i = row, j = col; j >= 0 && i < n; i++, j--)
        if (mat[i][j] == 'Q')
            return 0;

    return 1;
}

int solveNQueenUtil(char mat[n][n], int col) {
    // If all queens are placed then return true
    if (col >= n)
        return 1;

    // Consider this column and try placing this queen in all rows one by one
    for (int i = 0; i < n; i++) {
        // Check if the queen can be placed on board[i][col]
        if (isSafe(mat, i, col)) {
            // Place this queen in board[i][col]
            mat[i][col] = 'Q';

            // Recur to place rest of the queens
            if (solveNQueenUtil(mat, col + 1))
                return 1;

            // If placing queen in board[i][col] doesn't lead to a solution, then remove queen from board[i][col]
            mat[i][col] = '.';
        }
    }

    // If the queen cannot be placed in any row in this column col, then return false
    return 0;
}

int solveNQueen(char mat[n][n]) {
    if (solveNQueenUtil(mat, 0) == 0) {
        printf("Solution does not exist");
        return 0;
    }

    // Print the solution
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            printf("%c ", mat[i][j]);
        printf("\n");
    }
    return 1;
}

int main() {
    char mat[n][n];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            mat[i][j] = '.';

    solveNQueen(mat);
 return 0;
}