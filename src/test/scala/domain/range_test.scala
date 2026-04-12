package cl.uchile.dcc
package domain

import munit.FunSuite
import domain.card.Range

class RangeTest extends FunSuite:

  test("A Range can be created given valid points, order and classification"):
    val testRange: Range = new Range:
      val points: Int = 0
      val order: Int = 0
      val classification: String = "test"
    assert(testRange != null)
