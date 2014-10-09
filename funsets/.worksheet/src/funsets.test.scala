package funsets

import Math.abs

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  println("Welcome to the Scala worksheet");$skip(27); 
  
  val tolerance = 1E-10;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(81); 
  
  def isEnough(x: Double, y: Double): Boolean =
  	abs(x - y) / x < tolerance;System.out.println("""isEnough: (x: Double, y: Double)Boolean""");$skip(235); 
  	
  def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
  	def iterate(guess: Double): Double = {
  		val next = f(guess)
  		if(isEnough(guess, f(guess))) guess
  		else iterate(next)
  	}
  	iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(42); val res$0 = 
  
  fixedPoint(x => 1E30 + x / 2)(1E-60);System.out.println("""res0: Double = """ + $show(res$0))}
}
