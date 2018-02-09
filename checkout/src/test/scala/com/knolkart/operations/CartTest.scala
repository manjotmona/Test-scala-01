package com.knolkart.operations

import com.knolkart.modules.{Cart, Item}
import org.scalatest.FlatSpec

/**
 * Created by pallavi on 6/2/18.
 */
class CartTest extends FlatSpec{
  val pen = Item("Pen","Stationary",10.0f,"Raymond-Kalkaji",4)
  val pencil = Item("Pencil","Stationary",5.0f,"Natraj-Nehru Place",14)
  val cart = Cart(List(pen))
  val cart1 = Cart(List(pen,pencil))
  "Add com.knolkart.modules.Item Method" should "add an item to the cart" in {
    val result = cart.addItem(pencil)
    assert(result.contains(pencil))
  }

//  it should " not add an item to the cart" in {
//    val result = cart.addItem(pencil)
//    assert(result.contains(pencil))
//  }
  "Remove com.knolkart.modules.Item Method" should "remove an item from the cart" in {
    val result = cart.removeItem(pen)
    assert(result == List())
  }

  "Calculate Bill" should "calculates the bill in the cart" in {
    val result = cart1.calculateBill
    assert(result == 15f )
  }
  "to String" should "print object in string format" in {
    val result = cart.toString
    assert(result == "List(Pen Stationary 10.0 Raymond-Kalkaji 4)" )
  }

}
