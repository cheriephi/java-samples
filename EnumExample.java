public class EnumExample {
	public enum BackgammonDice {
		ONE(1),
		TWO(2),
		FOUR(4),
		EIGHT(8);
		
		private int numberShowing;
		
		BackgammonDice(int numberShowing) {
			this.numberShowing = numberShowing;
		}
		
		public int getNumberShowing() {
			return numberShowing;
		}
	}
	
	public static void main(String[] args) {	
		for(BackgammonDice dice: BackgammonDice.values()) {
			System.out.println(dice.getNumberShowing());			
		}
	}
}
