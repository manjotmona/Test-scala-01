package com.knolkart.operations

import scala.collection.immutable.ListMap

import com.knolkart.ItemListOperationTrait
import com.knolkart.modules.Item

/**
 * Created by pallavi on 6/2/18.
 */
case class ItemListOperation(stockOfItems: Map[Int, Item]) extends ItemListOperationTrait  {

  override def toString: String = s"$stockOfItems"
  def searchItemByCategory(category: String): String = {
    val itemList = stockOfItems.valuesIterator.toList

    def internalItemByCategory(list: List[Item], tempString: String): String = {
      list match {
        case Nil => tempString
        case head :: tail => head match {
          case item: Item if item.category == category =>
            internalItemByCategory(tail,
              tempString + item.name + " ")
          case item: Item if item.category != category =>
            internalItemByCategory(tail, tempString)
        }
      }
    }

    internalItemByCategory(itemList, "")
  }

  def sortByPriceAscending(): List[Item] = {
    val sortedMap = ListMap(this.stockOfItems.toSeq.sortWith(_._2.price > _._2.price): _*)
    val sortedList = sortedMap.valuesIterator.toList
    sortedList
  }

  def sortByPriceDescending: List[Item] = {
    val sortedMap = ListMap(this.stockOfItems.toSeq.sortWith(_._2.price < _._2.price): _*)
    val sortedList = sortedMap.valuesIterator.toList
    sortedList

  }

}
