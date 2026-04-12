package cl.uchile.dcc
package domain.hand

import domain.card.Card
import domain.joker.Joker

case class Hand(cards: Set[Card], jokers: Set[Joker])
