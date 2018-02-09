package com.knolkart.operations

import com.knolkart.modules.Item
import org.scalatest.FlatSpec

/**
 * Created by pallavi on 6/2/18.
 */
class ItemListOperationTest  extends FlatSpec{
  val firstPen = Item("Pen","Stationary",10.0f,"Raymond-Kalkaji",4)
  val firstPencil = Item("Pencil","Stationary",5.0f,"Natraj-Nehru Place",14)
  val firstLaptop =Item("Lenovo-401","Electronic",21000.0f,"Lenovo-Patel Nagar",15)
  val firstShirt = Item("RaymondShirt","Clothing",1200.0f,"Raymond-Kalkaji",100)
  val itemList = ItemListOperation(Map(1->firstPen,2->firstPencil,3->firstLaptop,4->firstShirt))
  val comparisonList = List(firstPencil,firstPen,firstShirt,firstLaptop)
  val equalsList = ItemListOperation(Map(1->firstPen))
  "Search com.knolkart.modules.Item By category" should "return list of all items in that category" in {
    val result = itemList.searchItemByCategory("Stationary")
    assert(result == "Pen Pencil ")
  }
  it should "not return list of items not in that category" in {
    val result = itemList.searchItemByCategory("Clothing")
    assert(result != "Lenovo-401 ")
  }

  "sortByPriceAscending" should "list in Ascending Order" in {
    val result = itemList.sortByPriceAscending()

    assert(result == comparisonList.reverse)
  }
  "sortByPriceDescending" should "list in Ascending Order" in {
    val result = itemList.sortByPriceDescending
    assert(result == comparisonList)
  }

  "to String" should "print object in string format" in {
    val result = equalsList.toString
    assert(result == "Map(1 -> Pen Stationary 10.0 Raymond-Kalkaji 4)")
  }
}
