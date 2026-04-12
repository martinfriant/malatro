package cl.uchile.dcc
package domain

import munit.FunSuite
import domain.card.{Card, Range, Heart}
import domain.hand.Hand
import domain.joker.{GreedyJoker, DeviousJoker}

class HandTest extends FunSuite:

  val testRange: Range = new Range:
    val points: Int = 0
    val order: Int = 0
    val classification: String = "test"

  test("A Hand can be created given a valid set of Cards and Jokers"):
    val hand = Hand(Set(Card(testRange, Heart)), Set(GreedyJoker))
    assert(hand != null)

  test("A Hand can be created with no Jokers"):
    val hand = Hand(Set(Card(testRange, Heart)), Set.empty)
    assert(hand != null)

  test("Two Hands with the same Jokers in different order are equal"):
    val hand1 = Hand(Set(Card(testRange, Heart)), Set(GreedyJoker, DeviousJoker))
    val hand2 = Hand(Set(Card(testRange, Heart)), Set(DeviousJoker, GreedyJoker))
    assertEquals(hand1, hand2)
