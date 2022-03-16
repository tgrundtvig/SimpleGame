package guessgame;

public class AIGuesser implements Guesser
{
	private int lowerLimit;
	private int upperLimit;

	@Override
	public void newGame(int min, int max)
	{
		this.lowerLimit = min;
		this.upperLimit = max;
	}

	@Override
	public int guess()
	{
		return middle();
	}

	@Override
	public void tellAnswer(int answer)
	{
		switch(answer)
		{
			case 0: //Too low
				lowerLimit = middle();
				break;
			case 1: //Too high
				upperLimit = middle();
				break;
		}
	}

	private int middle()
	{
		return (lowerLimit + upperLimit)/2;
	}
}
