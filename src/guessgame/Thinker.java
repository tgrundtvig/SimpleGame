package guessgame;

public interface Thinker
{
	void newGame(int min, int max);
	int evaluate(int guess);
}
