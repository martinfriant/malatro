package cl.uchile.dcc
package domain

import munit.FunSuite
import domain.score.Score

class ScoreTest extends FunSuite:

  test("A Score can be created given valid chips and multiplier"):
    val score = Score(100, 2)
    assert(score != null)
