import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    Random randomMineGenerator = new Random();
    int numRows;
    int numColumns;
    String[][] mineField;
    String[][] playerView;
    int totalMines;

    // Oyunu başlatan metod
    public void startGame() {
        System.out.println(" = Welcome to MineSweeper Game = ");
        System.out.print("Enter Number of Rows    : ");
        numRows = scanner.nextInt();
        System.out.print("Enter Number of Columns : ");
        numColumns = scanner.nextInt();

        // Maden sayısını belirleme
        totalMines = (numRows * numColumns) / 4;

        // Oyuncunun gördüğü ve madenlerin bulunduğu alanları temsil eden matrisleri oluşturma
        mineField = new String[numRows][numColumns];
        playerView = new String[numRows][numColumns];

        // Matrisleri başlangıç değerleri ile doldurma
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                playerView[i][j] = "-";
                mineField[i][j] = "-";
            }
        }

        // Madenleri yerleştirme
        while (totalMines > 0) {
            int mineRow = randomMineGenerator.nextInt(numRows);
            int mineColumn = randomMineGenerator.nextInt(numColumns);

            if (mineField[mineRow][mineColumn].equals("-")) {
                mineField[mineRow][mineColumn] = "*";
                totalMines--;
            }
        }

        // Oyuncuya başlangıç durumunu gösterme
        printPlayerView();
        // İlk hamleyi yapma
        makeMove();
    }

    // Oyuncunun hamlesini yapmasını sağlayan metod
    public void makeMove() {
        boolean gameOver = false;
        while (!gameOver) {
            System.out.print("Enter Row    : ");
            int selectedRow = scanner.nextInt();
            System.out.print("Enter Column : ");
            int selectedColumn = scanner.nextInt();

            int mineCount = 0;

            // Seçilen hücrenin geçerli olup olmadığını kontrol etme
            if (selectedRow < numRows && selectedColumn < numColumns) {
                if (mineField[selectedRow][selectedColumn].equals("-") && playerView[selectedRow][selectedColumn].equals("-")) {
                    // Seçilen hücre etrafındaki maden sayısını hesaplama
                    for (int i = selectedRow - 1; i < selectedRow + 2; i++) {
                        for (int j = selectedColumn - 1; j < selectedColumn + 2; j++) {
                            if (i >= 0 && j >= 0 && i < numRows && j < numColumns && mineField[i][j].equals("*")) {
                                mineCount++;
                                playerView[selectedRow][selectedColumn] = Integer.toString(mineCount);
                            } else {
                                playerView[selectedRow][selectedColumn] = Integer.toString(mineCount);
                            }
                        }
                    }

                    // Oyuncunun güncellenmiş görünümünü gösterme
                    printPlayerView();
                    // Kazanıp kazanmadığını kontrol etme
                    if (!checkWin()) {
                        System.out.println("Congratulations! You won the game :)");
                        printMineField();
                        gameOver = true;
                    }
                } else if (mineField[selectedRow][selectedColumn].equals("*")) {
                    // Madene denk gelinirse oyunu bitirme
                    System.out.println("Game Over :( You Hit a Mine :( Boom!!! ");
                    printMineField();
                    gameOver = true;
                } else if (!playerView[selectedRow][selectedColumn].equals("-")) {
                    // Daha önce seçilmiş bir hücreyse uyarı verme
                    System.out.println("Already revealed! Choose a different cell...");
                }
            } else {
                // Geçersiz bir hücre seçimi durumunda uyarı verme
                System.out.println("Invalid entry! Please choose from within the field.");
            }
        }
    }

    // Maden alanını ekrana basan metod
    public void printMineField() {
        System.out.println("MineField:");
        for (String[] row : mineField) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }

    // Oyuncunun gördüğü alanı ekrana basan metod
    public void printPlayerView() {
        System.out.println("Player View:");
        for (String[] row : playerView) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }

    // Oyunun kazanılıp kazanılmadığını kontrol eden metod
    boolean checkWin() {
        int emptyCells = 0;
        int minedCells = 0;
        for (int i = 0; i < playerView.length; i++) {
            for (int j = 0; j < playerView[i].length; j++) {
                if (playerView[i][j].equals("-")) {
                    emptyCells++;
                }
                if (mineField[i][j].equals("*")) {
                    minedCells++;
                }
            }
        }
        // Tüm boş hücreler açıldıysa ve maden hücreleri tespit edildiyse oyun kazanılmıştır
        return emptyCells == minedCells;
    }
}
