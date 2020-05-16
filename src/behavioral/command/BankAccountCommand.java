package behavioral.command;

public class BankAccountCommand implements Command {

	private BankAccount bankAccount;

	private Action action;

	private int amount;

	private boolean succeeded = true;

	public BankAccountCommand(BankAccount bankAccount, Action action, int amount) {
		super();
		this.bankAccount = bankAccount;
		this.action = action;
		this.amount = amount;
	}

	@Override
	public void call() {
		switch (action) {
		case WITHDRAW:
			succeeded = bankAccount.withdraw(amount);
			break;
		case DEPOSIT:
			bankAccount.deposit(amount);
			break;
		}
	}

	@Override
	public void undo() {
		if (succeeded) {
			switch (action) {
			case DEPOSIT:
				bankAccount.withdraw(amount);
				break;
			case WITHDRAW:
				bankAccount.deposit(amount);
				break;
			}
		}
	}

}
