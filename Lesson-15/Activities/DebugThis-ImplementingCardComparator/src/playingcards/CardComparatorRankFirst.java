package playingcards;

import java.util.Comparator;

public class CardComparatorRankFirst implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        return c1.suitDiff(c2);
    }    
}
