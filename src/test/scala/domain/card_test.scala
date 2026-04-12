package cl.uchile.dcc
package domain

import munit.FunSuite
import domain.card.{Card, Range, Heart, Diamond}

class CardTest extends FunSuite:

  val testRange: Range = new Range:
    val points: Int = 0
    val order: Int = 0
    val classification: String = "test"

  test("A Card can be created given a valid Range and Suit"):
    val card = Card(testRange, Heart)
    assert(card != null)

  test("Two Cards with the same Range but different Suit are not equal"):
    val card1 = Card(testRange, Heart)
    val card2 = Card(testRange, Diamond)
    assertNotEquals(card1, card2)
