package client

import shared.Adder

object Main {
  def main(args: Array[String]) = {
    println("Client" + Adder.add(4, 2))
  }
}
