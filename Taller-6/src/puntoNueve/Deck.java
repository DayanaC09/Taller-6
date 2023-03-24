package puntoNueve;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();
    String[] palos = { "Corazones", "Diamantes", "Picas", "Tréboles" };
    String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota", "Reina", "Rey" };
    int[] puntos = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
    for (int i = 0; i < palos.length; i++) {
      for (int j = 0; j < valores.length; j++) {
        Card card = new Card(valores[j], palos[i], puntos[j]);
        this.cards.add(card);
      }
    }
  }

  public void mezclar() {
    Collections.shuffle(this.cards);
  }

  public Card DrawCards() {
    return this.cards.remove(0);
  }
}


