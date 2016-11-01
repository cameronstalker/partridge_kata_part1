package alarmclock
import org.scalatest.{Matchers, FlatSpec}

class AGPTest extends FlatSpec with Matchers{

  "2 + 2 " should "equal 4" in {
    2 + 2 should be (4)
  }

  val lynnMessage = "Lynn, I've pierced my foot on a spike!!"

  "Alan" should "say ...Foot on a spike if no terms are found" in {
    AGP.chat() shouldBe lynnMessage 
  }

  it should "say ..Foot on a spike for an unrelated term" in {
    AGP.chat( List("Brent") ) shouldBe lynnMessage 
  }

}
