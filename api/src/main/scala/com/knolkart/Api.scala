package com.knolkart

import com.knolkart.modules.{Cart, Item, User}
import com.knolkart.operations.{ItemListOperation, UserListOperation}

/**
 * Created by pallavi on 6/2/18.
 */
class Api {
  val user1 = User("mona", 45675, "m19", "pwd")
  val pen = Item("Pen", "Stationary", 10.0f, "Raymond-Kalkaji", 4)
  val pencil = Item("Pencil", "Stationary", 5.0f, "Natraj-Nehru Place", 14)
  val laptop = Item("Lenovo-401", "Electronic", 21000.0f, "Lenovo-Patel Nagar", 15)
  val shirt = Item("RaymondShirt", "Clothing", 1200.0f, "Raymond-Kalkaji", 100)
  val userTraitApi: UserOperationTrait = UserListOperation(Map(user1.contactNumber -> user1))
  val cartTraitApi: CartTrait = Cart(List())
  val inventoryTraitApi: ItemListOperationTrait = ItemListOperation(Map(1 -> pen,
    2 -> pencil,
    3 -> laptop,
    4 -> shirt))

}
