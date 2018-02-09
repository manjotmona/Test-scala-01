package com.knolkart.modules.ItemTest

import com.knolkart.modules.Item
import org.scalatest.FlatSpec

/**
 * Created by pallavi on 8/2/18.
 */
class ItemTest extends FlatSpec  {
  val price = 10.0f
  val pen = Item("Pen","Stationary",price,"Raymond-Kalkaji",4)

  "to String" should "print object in string format" in {
    val result = pen.toString
    assert(result == "Pen Stationary 10.0 Raymond-Kalkaji 4"  )
  }

}
