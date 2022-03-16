package guessgame;

import textui.TextUI;

public class GameCtrl
{
	private TextUI ui;

	public GameCtrl(TextUI ui)
	{
		this.ui = ui;
	}

	void runGame(Thinker thinker, Guesser guesser, int min, int max)
	{
		thinker.newGame(min, max);
		guesser.newGame(min, max);
		int numberOfGuesses = 0;
		int answer = 0;
		while(answer != 2)
		{
			++numberOfGuesses;
			int guess = guesser.guess();
			answer = thinker.evaluate(guess);
			guesser.tellAnswer(answer);
		}

		ui.print("Game over. " + numberOfGuesses + " guesses used!");
	}
}
