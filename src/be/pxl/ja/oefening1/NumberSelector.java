package be.pxl.ja.oefening1;

public class NumberSelector {
	private NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		return numberMachine.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int number) {
				return number % 2 == 0;
			}
		});
	}

	public String printHexNumbers() {
		return numberMachine.convertNumbers();
	}

	public String showNumbersAbove(int number) {
		return numberMachine.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int num) {
				return num > number;
			}
		});
	}
}
