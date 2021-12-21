package com.ubs.frs.gwm.poc

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World! This is Shyam" )
    println("concat arguments = " + foo(args))
  }

}
