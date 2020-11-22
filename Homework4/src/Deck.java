import java.util.Iterator;

public class Deck implements Iterator {
    char[] deck = new char[14];
    private int counter = 0;

    @Override
    public boolean hasNext() {
        if(deck.equals('A'))
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        this.counter++;
        if(this.counter > 1 && this.counter < 10)
            return (char)this.counter;
        else if (this.counter == 1) {
            return 'A';
        }
        else if(this.counter == 11){
            return 'J';
        }
        else if(this.counter == 12){
            return 'Q';}
        else if(this.counter == 13) {
            return 'K';
        }
        else {
            this.counter = 0;
            return 'A';
        }

}

    @Override
    public void remove() {
        StringBuilder sb = new StringBuilder();
        sb.append(deck);
        sb.deleteCharAt(0);
        deck = sb.toString().toCharArray();

    }

}
