package cl.uchile.dcc
package mcd
import scala.io.StdIn.readInt
/*
El siguiente import es necesario sí quieren leer números enteros desde la consola.
Pueden leer un entero de la siguiente forma:

  val a = readInt()
  
y luego usarlo como deseen

  val res = a + 5
  println(s"El resultado del número ingresado más 5 es $res")
  
*/


@main def euclidesInteractivo(): Unit = {
  // Inicio de la zona donde deben editar el código

  //objetos: dos numeros,
  //metodos: calcular el MCD entre ellos utilizando el algoritmo de Euclides

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

  def mcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else mcd(b, a % b)
  }

  def loop(): Unit = {

    val (a, b) = pedirnumeros()
    if (a != 0) {
      val resultado = mcd(a, b)
      println(s"El MCD es: $resultado")
      loop()
    }
  }

  loop()
  println("No le sé al máximo común divisor :(")
  
  // Fin de la zona donde deben editar el código
}
