package cl.uchile.dcc
package domain.joker

import domain.effect.Effect
import domain.hand.Hand
import domain.score.Score

trait Joker extends Effect

case object GreedyJoker  extends Joker:
  def apply(hand: Hand, score: Score): Score = ???

case object DeviousJoker extends Joker:
  def apply(hand: Hand, score: Score): Score = ???

case object EvenSteven   extends Joker:
  def apply(hand: Hand, score: Score): Score = ???

case object ScaryFace    extends Joker:
  def apply(hand: Hand, score: Score): Score = ???
