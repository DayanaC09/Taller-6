package puntoNueve;

import java.util.ArrayList;

public class Hand {
  private ArrayList<Card> card;
  private int puntos;

  public Hand() {
    this.card = new ArrayList<Card>();
    this.puntos = 0;
  }

  public void agregarCarta(Card carta) {
    this.card.addAll(card);
    this.puntos += ((Hand) card).getPuntos();
  }

  public void verificarAses() {
    for (Card card : this.card) {
      if (card.getValor().equals("As") && this.puntos > 21) {
        card.setPuntos(1);
        this.puntos -= 10;
      }
    }
  }

  public ArrayList<Card> getCard() {
    return this.card;
  }

  public int getPuntos() {
    return this.puntos;
  }

  public boolean isBlackjack() {
    return this.card.size() == 2 && this.puntos == 21;
  }

  public boolean isBusto() {
    return this.puntos > 21;
  }


}
