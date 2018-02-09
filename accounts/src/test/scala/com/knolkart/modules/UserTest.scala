package com.knolkart.modules

import org.scalatest.FlatSpec

/**
 * Created by pallavi on 7/2/18.
 */
class UserTest extends FlatSpec {
  val user = User("Rahul", 12457, "r34", "rah")
  "Authenticate Single user" should "generates a random number between 0-50 for a valid user" in {
    val result = user.authenticateSingleUser("r34", "rah")
    assert(result != -1)
  }

  it should "generates -1 for an invalid user" in {
    val result = user.authenticateSingleUser("r34", "pwd")
    assert(result == -1)
  }
  "to string" should "print a user string" in {
    val result = user.toString
    assert(result == "Rahul 12457 r34")
  }
  it should "not print a user password" in {
    val result = user.toString
    assert(result != "Rahul 12457 r34 rah")
  }

}
