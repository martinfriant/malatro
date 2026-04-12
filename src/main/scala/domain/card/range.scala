package cl.uchile.dcc
package domain.card

trait Range:
  val points: Int
  val order: Int
  val classification: String

case object Ace   extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Two   extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Three extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Four  extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Five  extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Six   extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Seven extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Eight extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Nine  extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Jack  extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object Queen extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???

case object King  extends Range:
  val points: Int = ???
  val order: Int = ???
  val classification: String = ???
