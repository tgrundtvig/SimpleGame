package guessgame;

import textui.TextUI;

import java.util.ArrayList;

public class HumanThinker extends HumanPlayer implements Thinker
{
	public HumanThinker(boolean hotseat, TextUI ui)
	{
		super(hotseat, ui);
	}

	@Override
	public String getRole()
	{
		return "Thinker";
	}

	public void newGame(int min, int max)
	{
		turn();
		ui.println(getName() + ", think of an integer between " + min + " and " + max + " (both inclusive).");
		ui.println("Press Enter when ready!");
		ui.get();
		ui.clear();
	}

	public int evaluate(int guess)
	{
		turn();
		String[] choices = {"Too low.", "Too high.", "Correct!"};
		int answer =  ui.select("The guesser guessed on: " +
								guess + " what is your evaluation?",
								choices, "Enter your answer: "  );
		ui.clear();
		return answer;
	}
}
