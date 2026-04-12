package cl.uchile.dcc
package domain.effect

import domain.hand.Hand
import domain.score.Score

trait Effect:
  def apply(hand: Hand, score: Score): Score
