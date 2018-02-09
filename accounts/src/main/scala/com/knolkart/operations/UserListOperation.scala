package com.knolkart.operations

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import com.knolkart.UserOperationTrait
import com.knolkart.modules.User

/**
 * Created by pallavi on 6/2/18.
 */
case class UserListOperation(registeredUsers: Map[Int, User]) extends UserOperationTrait {


  override def toString(): String = s"$registeredUsers"

  def addNewUser(user: User): Future[Map[Int, User]] = Future{
    registeredUsers + (user.contactNumber -> user)
  }

  def authenticateUser(id: Int, userName: String, password: String): Future[Int] = Future{
    val user = registeredUsers(id)
    user.authenticateSingleUser(userName, password)
  }

}




