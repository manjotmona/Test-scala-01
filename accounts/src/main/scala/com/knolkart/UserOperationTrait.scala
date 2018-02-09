package com.knolkart

import scala.concurrent.Future

import com.knolkart.modules.User
/**
 * Created by pallavi on 6/2/18.
 */
trait UserOperationTrait {
  def addNewUser(user: User): Future[Map[Int, User]]

  def authenticateUser(id: Int, userName: String, password: String): Future[Int]

}
