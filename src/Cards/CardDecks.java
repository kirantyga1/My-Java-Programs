package Cards;

public class CardDecks {

	public static void main(String[] args) {

		String[] suit = { "S", "C", "D", "H" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] deck = new String[52];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = rank[i % 13] + suit[1 / 13];

		}
		//shuffel the cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);

			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;

		}
		//print the shuffeled deck
		for (String u : deck) {
			System.out.println(u);
		}
	}

}
