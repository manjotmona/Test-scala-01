/**
 * Created by pallavi on 6/2/18.
 */
case class Cart(listOfItems: List[Item]) extends CartTrait{
  def addItem(item: Item): List[Item]={
    item :: listOfItems.reverse
  }
  def removeItem(item: Item) : List[Item] = {
    val newList = listOfItems.filter(_ != item)
    newList
  }

  def calculateBill: Float = {
      def internalSum(list: List[Item],sum: Float): Float = {
        list match {
          case head :: tail => internalSum(tail,sum + head.price)
          case Nil => sum
        }
      }
      internalSum(listOfItems,0)

  }

  override def toString(): String = s"$listOfItems\n"
}
