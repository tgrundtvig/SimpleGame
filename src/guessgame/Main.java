package guessgame;

import textui.SysTextUI;
import textui.TextUI;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Thinker thinker = null;
		Guesser guesser = null;
		TextUI ui = new SysTextUI();
		String[] thinkerChoices = {"Human thinker", "Computer thinker"};
		int thinkerType = ui.select("Select thinker type:", thinkerChoices, "Enter your choice:");
		String[] guesserChoices = {"Human guesser", "Computer guesser"};
		int guesserType = ui.select("Select guesser type:", guesserChoices, "Enter your choice:");
		boolean hotseat = thinkerType == 0 && guesserType == 0;
		if(thinkerType == 0)
		{
			thinker = new HumanThinker(hotseat, ui);
		}
		else
		{
			thinker = new AIThinker();
		}
		if(guesserType == 0)
		{
			guesser = new HumanGuesser(hotseat, ui);
		}
		else
		{
			guesser = new AIGuesser();
		}
		GameCtrl gameCtrl = new GameCtrl(ui);
		gameCtrl.runGame(thinker, guesser, 1, 100);
	}
}
