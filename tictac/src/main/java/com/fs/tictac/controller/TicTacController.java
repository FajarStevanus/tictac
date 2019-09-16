/**
 * 
 */
package com.fs.tictac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fs.tictac.model.Board;
import com.fs.tictac.model.Player;

/**
 * @author fs
 *
 */
@Controller
public class TicTacController {
	Board board = null;
	Player p1 = null;
	Player p2 = null;
	boolean gameOn;
	String playerWin;

//	@RequestMapping({ "/", "/index" })
	public String home(Model model,
			@RequestParam(value = "restart", required = false) String restart) {
		if (restart != null) {
			init("3", true);
		}
		return "index";
	}

	@RequestMapping({ "/", "/index", "/tictactoe"})
	public String tictactoe(Model model,
			@RequestParam(value = "num", required = false, defaultValue = "3") String num) {
		init(num, true);
		model.addAttribute("board", board);
		return "tictac";
	}

	@RequestMapping("/tictactoe/acc")
	public String action(Model model, @RequestParam(value = "pos", required = true) String pos) {
		setPos(board.isPlayer1Role() ? p1 : p2, pos);
		if (!isGameOn()) {
			model.addAttribute("win", playerWin);
			return "win";
		}
		model.addAttribute("board", board);
		return "tictac";
	}

	public void init(String num, boolean restart) {
		int numb = 0;
		gameOn = true;
		if (num != null) {
			numb = Integer.valueOf(num);
			if (board == null || restart)
				board = new Board(numb);
			if (p1 == null || restart)
				p1 = new Player("X", numb);
			if (p2 == null || restart)
				p2 = new Player("O", numb);
		}
	}

	public void setPos(Player player, String pos) {
		int poss = 0;
		if (pos != null)
			poss = Integer.valueOf(pos);
		int x = (poss / board.getBoardNumber());
		int y = (poss % board.getBoardNumber());
		if (board.getBoard()[x][y] == null || board.getBoard()[x][y].isEmpty()) {
			board.getBoard()[x][y] = player.getSymbol();
			player.setPos(x, y);
			board.setPlayer1Role(board.isPlayer1Role() ? false : true);
		}
	}
	
	public boolean isGameOn() {
		if (p1.isWin()) {
			playerWin = "Player 1 (X) WON " + p1.getWinPos();
			return false;
		} else if (p2.isWin()) {
			playerWin = "Player 2 (O) WON " + p2.getWinPos();
			return false;
		}
		return true;
	}

}
