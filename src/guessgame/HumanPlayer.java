package guessgame;

import textui.TextUI;

public abstract class HumanPlayer
{
	private final boolean hotseat;
	protected TextUI ui;
	private String name;

	public HumanPlayer(boolean hotseat, TextUI ui)
	{
		this.hotseat = hotseat;
		this.ui = ui;
		this.name = null;
	}

	public abstract String getRole();

	public String getName()
	{
		if(name == null)
		{
			ui.print(getRole() + ": What is your name?");
			name = ui.get();
			ui.clear();
		}
		return name;
	}

	protected void turn()
	{
		if(hotseat)
		{
			ui.clear();
			ui.println(getName() + " it is your turn. Press Enter when ready!");
			ui.get();
			ui.clear();
		}
	}
}
