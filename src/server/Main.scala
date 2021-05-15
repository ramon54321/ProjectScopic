package server

import shared.Adder

object Main {
  def main(args: Array[String]) = {
    println("Server" + Adder.add(1, 2))
  }
}
