package behavioral.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandPattern {
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		System.out.println(account);
		List<BankAccountCommand> commands = new ArrayList<>();
		commands.add(new BankAccountCommand(account, Action.DEPOSIT, 200));
		commands.add(new BankAccountCommand(account, Action.WITHDRAW, 1000));
		for (Command c : commands) {
			c.call();
			System.out.println(account); 
		}
		Collections.reverse(commands);
		for (Command c : commands) {
			c.undo();
			System.out.println(account); 
		}
		
		
	}

}
