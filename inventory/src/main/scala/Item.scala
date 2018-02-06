/**
 * Created by pallavi on 6/2/18.
 */
case class Item(name: String,
    category: String,
    price: Float,
    vendorInformation: String,
    itemCount: Int) {

  override def toString(): String = s"$name $category $price $vendorInformation $itemCount"
}