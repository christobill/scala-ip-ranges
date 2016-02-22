package ipranges.v4
import scala.util.Random

/**
  * Created by admin on 21/02/2016.
  */
class Gen {
  def randomIp() : IP = new IP(Random.nextInt)

  def randomIpBetween(start: IP, end : IP) : IP = {
    new IP(Random.nextInt(end.value - start.value) + start.value)
  }
}

object FakeIP{
  def apply(
             aS : String,
             bS : String,
             cS : String,
             dS : String) :IP = {
    val a = Random.nextInt & 255
    val b = Random.nextInt & 255
    val c = Random.nextInt & 255
    val d = Random.nextInt & 255
    IP(a, b, c, d)
  }

  def apply(
             a : Int,
             bS : String,
             cS : String,
             dS : String) :IP = {
    val b = Random.nextInt & 255
    val c = Random.nextInt & 255
    val d = Random.nextInt & 255
    IP(a, b, c, d)
  }

  def apply(
             a : Int,
             b : Int,
             cS : String,
             dS : String) :IP = {
    val c = Random.nextInt & 255
    val d = Random.nextInt & 255
    IP(a, b, c, d)
  }

  def apply(
             a : Int,
             b : Int,
             c : Int,
             dS : String) :IP = {
    val d = Random.nextInt & 255
    IP(a, b, c, d)
  }
}

