package cl.uchile.dcc
package domain

import munit.FunSuite
import domain.joker.{Joker, GreedyJoker, DeviousJoker, EvenSteven, ScaryFace}

class JokerTest extends FunSuite:

  test("A Joker can be created"):
    assert(GreedyJoker != null)

  test("Jokers are different from one another"):
    assertNotEquals(GreedyJoker: Joker, DeviousJoker: Joker)
    assertNotEquals(GreedyJoker: Joker, EvenSteven: Joker)
    assertNotEquals(GreedyJoker: Joker, ScaryFace: Joker)

