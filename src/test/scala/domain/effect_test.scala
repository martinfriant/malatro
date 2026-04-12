package cl.uchile.dcc
package domain

import munit.FunSuite
import domain.card.{Card, Range, Heart}
import domain.effect.Effect
import domain.hand.Hand
import domain.score.Score

class EffectTest extends FunSuite:

  val testRange: Range = new Range:
    val points: Int = 0
    val order: Int = 0
    val classification: String = "test"

  val testHand: Hand = Hand(Set(Card(testRange, Heart)), Set.empty)

  val doubleMultiplier: Effect = new Effect:
    def apply(hand: Hand, score: Score): Score =
      Score(score.chips, score.multiplier * 2)

  test("An Effect can be created"):
    assert(doubleMultiplier != null)

  test("A x2 Effect doubles the multiplier of a Score"):
    val initial = Score(100, 2)
    val result  = doubleMultiplier(testHand, initial)
    assertEquals(result, Score(100, 4))

  test("A x2 Effect does not change the chips of a Score"):
    val initial = Score(100, 2)
    val result  = doubleMultiplier(testHand, initial)
    assertEquals(result.chips, 100)
