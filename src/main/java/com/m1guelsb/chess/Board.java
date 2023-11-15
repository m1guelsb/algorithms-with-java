package com.m1guelsb.chess;

public class Board {
  String[] rows = { "8", "7", "6", "5", "4", "3", "2", "1" };
  String[] columns = { "a", "b", "c", "d", "e", "f", "g", "h" };

  public void printBoard() {
    for (int i = 0; i < rows.length; i++) {
      System.out.println("+----+----+----+----+----+----+----+----+");
      for (String column : columns) {
        System.out.print("| " + rows[i] + column + " ");
      }
      System.out.println("|");
    }
    System.out.println("+----+----+----+----+----+----+----+----+");
  }
}