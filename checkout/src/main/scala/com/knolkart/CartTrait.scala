package com.knolkart

import com.knolkart.modules.Item

/**
 * Created by pallavi on 6/2/18.
 */
trait CartTrait {
  def addItem(item: Item): List[Item]

  def removeItem(item: Item): List[Item]

  def calculateBill: Float

}
