/**
 * 
 */
package com.fs.tictac.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fs
 *
 */
public class Board {
	
	private int boardNumber;
	private String[][] board;
	private List<String> boardList;
	private boolean player1Role = true;

	public Board() {}
	
	public Board(int boardNumber, String[][] board, List<String> boardList) {
		this.boardNumber = boardNumber;
		this.board = board;
		this.boardList = boardList;
	}
	
	public Board(int boardNumber) {
		this.boardNumber = boardNumber;
		this.board = new String[boardNumber][boardNumber];
		this.boardList = new ArrayList<String>();
		for (int i = 0 ; i < boardNumber * boardNumber ; i++) {
			this.boardList.add("ini");
		}
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public List<String> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<String> boardList) {
		this.boardList = boardList;
	}

	public boolean isPlayer1Role() {
		return player1Role;
	}

	public void setPlayer1Role(boolean player1Role) {
		this.player1Role = player1Role;
	}
	
}