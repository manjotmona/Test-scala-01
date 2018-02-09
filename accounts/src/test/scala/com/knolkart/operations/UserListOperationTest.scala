package com.knolkart.operations

import scala.concurrent.ExecutionContext.Implicits.global

import com.knolkart.modules.User
import org.scalatest.FlatSpec


class UserListOperationTest extends FlatSpec {
  val user1 = User("mona",45675,"m19","pwd")
  val user2 = User("jas",6567,"j20","pwd")
  val testClass = UserListOperation(Map(user1.contactNumber->user1))

  "Add new user method" should "add a new user" in {
    val result = testClass.addNewUser(user2)
    result map{ x=> assert(x.contains(user1.contactNumber))}
  }
  it should "not add an already Existing user" in {
    val result = testClass.addNewUser(user1)
    result map { x => assert(!x.contains(98876))
    }
  }

  "Authenticate use" should "authenticate a valid user" in {
    val result = testClass.authenticateUser(user1.contactNumber,"m19","pwd")
   result map { x=> assert(x != -1 ) }
  }

  it should "not authenticate an invalid user" in {
    val result = testClass.authenticateUser(user1.contactNumber,"m19","abf")
   result map{ x=> assert(x == -1 )}
  }
  "to string" should "print list of all users in a string" in {
    val result = testClass.toString
    assert(result == "Map(45675 -> mona 45675 m19)")
  }
  it should "print a user string" in {
    val result = testClass.toString
    assert(result != "Map(1 -> mona 45675 m19 pwd)")
  }

}
