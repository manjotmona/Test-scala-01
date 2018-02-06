/**
 * Created by pallavi on 6/2/18.
 */
case class Cart(listOfItems: List[Item]){
  def addItem(item: Item): List[Item]={
    item :: listOfItems.reverse
  }
  def removeItem(item: Item) : List[Item] = {
    val newList = listOfItems.filter(_ != item)
    newList
  }
  override def toString(): String = s"$listOfItems\n"
}
