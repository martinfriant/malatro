package cl.uchile.dcc
package mcd
import scala.io.StdIn.readInt

@main def euclidesInteractivo(): Unit = {
  // Inicio de la zona donde deben editar el código

  /*
   * pedirnumeros utiliza getnum.
   * getnum solicita al usuario un numero Int
   * pedirnumeros solicita valores los valores y guarda en la tupla (a, b)
   */

  def pedirnumeros(): (Int, Int) = {

    def getnum(mensaje: String): Int = {
      println(mensaje)
      val a: Int = readInt()
      a
    }

    val a = getnum(s"Ingrese primer numero (0 para terminar): ")
    val b = getnum(s"Ingrese segundo numero: ")
    (a, b)

  }

  /*
   * mcd recibe una tupla (a, b)
   * encuentra el mcd siguiendo las reglas de README.md
   */

  def mcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else mcd(b, a % b)
  }

  /*
   * loop solicita los valores (a, b) mediante pedirnumeros(),
   * siempre y cuando el valor a ingresado sea distinto de 0,
   * se calcula el mcd entre (a, b) mediante mcd(a, b) y se entrega al usuario
   * vuelve a iniciar el loop.
   */

  def loop(): Unit = {

    val (a, b) = pedirnumeros()
    if (a != 0) {
      val resultado = mcd(a, b)
      println(s"El MCD es: $resultado")
      loop()
    }
  }

  loop()
  println("Exito, si le supe al minimo comun divisor")
  
  // Fin de la zona donde deben editar el código
}
