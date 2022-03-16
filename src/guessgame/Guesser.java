package guessgame;

public interface Guesser
{
	public void newGame(int min, int max);
	public int guess();
	public void tellAnswer(int answer);
}
