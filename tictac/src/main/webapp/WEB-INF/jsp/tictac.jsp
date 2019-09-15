<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Tic Tac Toe!</title>
<link href="/css/main.css" rel="stylesheet">
</head>
<body>
	<table>
		<tbody>
			<tr>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="0" /> <input class="tic"
							type="submit" value="${board.board[0][0]}">
					</form>
				</td>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="1" /> <input class="tic"
							type="submit" value="${board.board[0][1]}">
					</form>
				</td>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="2" /> <input class="tic"
							type="submit" value="${board.board[0][2]}">
					</form>
				</td>
			</tr>
			<tr>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="3" /> <input class="tic"
							type="submit" value="${board.board[1][0]}">
					</form>
				</td>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="4" /> <input class="tic"
							type="submit" value="${board.board[1][1]}">
					</form>
				</td>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="5" /> <input class="tic"
							type="submit" value="${board.board[1][2]}">
					</form>
				</td>
			</tr>
			<tr>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="6" /> <input class="tic"
							type="submit" value="${board.board[2][0]}">
					</form>
				</td>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="7" /> <input class="tic"
							type="submit" value="${board.board[2][1]}">
					</form>
				</td>
				<td>
					<form action="/tictactoe/acc">
						<input type="hidden" name="pos" value="8" /> <input class="tic"
							type="submit" value="${board.board[2][2]}">
					</form>
				</td>
			</tr>
		</tbody>
	</table>
	<form action="/">
		<input type="hidden" name="restart" value="1" /> <input class="tic"
			type="submit" value="restart">
	</form>

	<script src="/js/main.js"></script>
</body>
</html>