package guessgame;

import java.util.Random;

public class AIThinker implements Thinker
{
	private Random rnd;
	private int secretNumber;

	public AIThinker()
	{
		rnd = new Random();
	}

	public void newGame(int min, int max)
	{
		this.secretNumber = rnd.nextInt((max - min + 1)) + min;
	}

	public int evaluate(int guess)
	{
		if(guess < secretNumber)
		{
			return 0;
		}
		if(guess > secretNumber)
		{
			return 1;
		}
		return 2;
	}
}
