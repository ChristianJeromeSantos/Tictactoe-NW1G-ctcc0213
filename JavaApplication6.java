/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication6 {
    public static String i1 = " 1 ", i2 = " 2 ", i3 = " 3 ", i4 = " 4 ", i5 = " 5 ", i6 = " 6 ", i7 = " 7 ", i8 = " 8 ", i9 = " 9 ";
    public static String board = " "+i1+" | "+i2+" | "+i3+" \n-----|-----|-----\n "+i4+" | "+i5+" | "+i6+" \n-----|-----|-----\n "+i7+" | "+i8+" | "+i9+" ";
    public static int inp;
    public static int lol;

    public static void updateBoard(int x, String symbol) {
        switch (x) {
            case 1: i1 = symbol; break;
            case 2: i2 = symbol; break;
            case 3: i3 = symbol; break;
            case 4: i4 = symbol; break;
            case 5: i5 = symbol; break;
            case 6: i6 = symbol; break;
            case 7: i7 = symbol; break;
            case 8: i8 = symbol; break;
            case 9: i9 = symbol; break;
        }
        updateDisplay();
    }

    public static void updateDisplay() {
        board = " "+i1+" | "+i2+" | "+i3+" \n-----|-----|-----\n "+i4+" | "+i5+" | "+i6+" \n-----|-----|-----\n "+i7+" | "+i8+" | "+i9+" ";
    }

   public static void checkWinner() {
    if (checkLine(i1, i2, i3) || checkLine(i4, i5, i6) || checkLine(i7, i8, i9) ||
        checkLine(i1, i4, i7) || checkLine(i2, i5, i8) || checkLine(i3, i6, i9) ||
        checkLine(i1, i5, i9) || checkLine(i3, i5, i7)) {
        System.out.println(i1.trim() + " wins!");
        System.exit(0);
    } else if (!i1.contains(" ") && !i2.contains(" ") && !i3.contains(" ") &&
               !i4.contains(" ") && !i5.contains(" ") && !i6.contains(" ") &&
               !i7.contains(" ") && !i8.contains(" ") && !i9.contains(" ")) {
        System.out.println(board);
        System.out.println("It's a draw!");
        System.exit(0);
    }
}



    public static boolean checkLine(String a, String b, String c) {
        return a.equals(b) && b.equals(c) && !a.equals(" "); 
    }

    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    for (int i = 1; i <= 9; i++) {
        String symbol = (i % 2 == 0) ? " X " : " O ";
        System.out.println(board);
        System.out.println((symbol.trim()) + ": ");
        inp = input.nextInt();

        if (inp < 1 || inp > 9 || !board.contains(" " + inp + " ")) {
            System.out.println("Whoops, wrong choice. Try again.");
            System.exit(0);
        }

        updateBoard(inp, symbol);
        checkWinner();
    }
}

}