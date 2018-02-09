package com.knolkart

import com.knolkart.modules.Item

/**
 * Created by pallavi on 6/2/18.
 */
trait ItemListOperationTrait  {
  def searchItemByCategory(category: String): String
  def sortByPriceAscending(): List[Item]
  def sortByPriceDescending: List[Item]

}
