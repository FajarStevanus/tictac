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
				return true;
			}
		}
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}
}