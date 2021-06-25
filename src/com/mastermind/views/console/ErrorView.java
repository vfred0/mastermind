package com.mastermind.views.console;

import com.mastermind.types.Color;
import com.mastermind.types.Error;
import com.utils.Console;

public class ErrorView {

	private String[] messages = { "Repeated colors", "Wrong colors, they must be: " + Color.getAllInitials(),
			"Wrong proposed combination length" };

	public ErrorView(Error error) {		
		Console.getInstance().writeln(messages[error.ordinal()]);
	}

}
