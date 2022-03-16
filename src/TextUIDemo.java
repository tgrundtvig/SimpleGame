import textui.SysTextUI;

import java.util.ArrayList;

public class TextUIDemo
{
	public static void main(String[] args)
	{
		SysTextUI ui = new SysTextUI();
		ui.print("How old are you?");
		int age = ui.getInteger(0, 200);
		ui.clear();
		ui.print("You are " + age + " years old!");
		ui.get();
		ui.clear();
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Kiwi");

		int favorite = ui.select("What is your favorite fruit?", fruits, "Please choose:");
		ui.print("Your favorite fruit is " + fruits.get(favorite) + ".\n");
		if(favorite == 3)
		{
			ui.print("What an excellent choice!\n");
		}
	}
}
