/**
 * 
 */
package com.fs.tictac.model;

/**
 * @author fs
 *
 */
public class Player {
	
	private String symbol;
	private boolean[][] boardPos;
	private boolean win;
	private String winPos;
	
	public Player(String symbol) {
		this.symbol = symbol;
	}
	public Player(String symbol, int num) {
		this.symbol = symbol;
		this.boardPos = new boolean[num][num];
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public boolean[][] getBoardPos() {
		return boardPos;
	}
	public void setBoardPos(boolean[][] boardPos) {
		this.boardPos = boardPos;
	}
	public void setPos(int x, int y) {
		this.boardPos[x][y] = true; 
	}
	public boolean isWin() {
		// horizontal
		for (int i = 0 ; i < boardPos.length ; i++) {
			win = true;
			for (int j = 0 ; j < boardPos[i].length ; j++) {
				if (!boardPos[i][j])
					win = false;
			}
			if (win) {
				winPos = "-" + i + " horizontal row " + i;
				return true;
			}
		}
//		vertical
//		transpose matric
		boolean[][] temp = new boolean[this.boardPos.length][this.boardPos.length];
		for (int i = 0 ; i < boardPos.length ; i++) {
			for (int j = 0 ; j < boardPos[i].length ; j++) {
				temp[j][i] = boardPos[i][j];
			}
		}
		for (int i = 0 ; i < boardPos.length ; i++) {
			win = true;
			for (int j = 0 ; j < boardPos[i].length ; j++) {
				if (!temp[i][j])
					win = false;
			}
			if (win) {
				winPos = "|" + i + " vertical column " + i;
				return true;
			}
		}
//		diagonal
//		getval
		boolean[][] tempDia = new boolean[2][this.boardPos.length];
		for (int i = 0 ; i < boardPos.length ; i++) {
			for (int j = 0 ; j < boardPos[i].length ; j++) {
				if (i == j)
					tempDia[0][j] = boardPos[i][j];
				else if (i + j == boardPos.length - 1) 
					tempDia[1][j] = boardPos[i][j];
			}
		}
		for (int i = 0 ; i < tempDia.length ; i++) {
			win = true;
			for (int j = 0 ; j < tempDia[i].length ; j++) {
				if (!tempDia[i][j])
					win = false;
			}
			if (win) {
				if (i == 0) 
					winPos = "\\ Diagonal";
				else if (i == 1)
					winPos = "/ Diagonal";
				return true;
			}
		}
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}
	public String getWinPos() {
		return winPos;
	}
	public void setWinPos(String winPos) {
		this.winPos = winPos;
	}
}