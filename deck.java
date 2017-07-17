import java.util.Random;

public class deck<cards, Card> 
{

	private Card[] cards; 
	private int cardsInDeck;

	public static final int DECK_SIZE = 52;

		public void shuffle() 
		{
	    int newI;
	    Card temp;
	    Random randIndex = new Random();

	    for (int i = 0; i < cardsInDeck; i++)
	    {
	        newI = randIndex.nextInt(cardsInDeck);
	        temp = cards[i];
	        cards[i] = cards[newI];
	        cards[newI] = temp;
	    }
	}

	}
