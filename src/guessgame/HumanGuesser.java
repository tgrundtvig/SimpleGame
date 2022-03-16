package guessgame;

import textui.TextUI;

public class HumanGuesser extends HumanPlayer implements Guesser
{
	public HumanGuesser(boolean hotseat, TextUI ui)
	{
		super(hotseat, ui);
	}

	public void newGame(int min, int max)
	{
		turn();
		ui.println(getName() + ", you have to guess an integer between " + min + " and " + max + " (both inclusive).");
		ui.println("Press Enter when ready!");
		ui.get();
		ui.clear();
	}

	public int guess()
	{
		//turn();
		ui.print(getName() + ", make your guess:");
		int guess = ui.getInteger();
		ui.clear();
		return guess;
	}

	public void tellAnswer(int answer)
	{
		turn();
		switch(answer)
		{

			case 0:
				ui.println("Your guess was too low!");
				break;
			case 1:
				ui.println("Your guess was too high!");
				break;
			case 2:
				ui.println("Your guess was correct!");
				break;
			default:
				throw new RuntimeException("Something went horrible wrong!!!!");
		}
		ui.println("Press enter to continue...");
		ui.get();
		ui.clear();
	}

	@Override
	public String getRole()
	{
		return "Guesser";
	}
}
