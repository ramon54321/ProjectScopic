package client

import shared.Threading

object Main {
  def main(args: Array[String]) = {
    val client = new Client()
    client.start()
    Threading.registerShutdownHook()
  }
}
