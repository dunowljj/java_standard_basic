package practice.oop2;

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0; i<CARD_NUM/2; i++){
            cards[i] = new SutdaCard(i+1, false);
            if(i == 1 || i == 3 || i == 8) cards[i].isKwang = true;
        }
        for(int i=CARD_NUM/2; i<CARD_NUM; i++) {
            cards[i] = new SutdaCard(i-9, false);
        }
    }
}


class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}



public class Pr7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i< deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }
    }
}
