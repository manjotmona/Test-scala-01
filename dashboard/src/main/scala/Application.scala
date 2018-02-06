/**
 * Created by pallavi on 6/2/18.
 */
object  Application extends {
  def main(args: Array[String]): Unit = {
    val api = new Api
    val newUser = User("Jas", 65778, "jas20", "jas")
    print(api.userTraitApi.addNewUser(newUser))

  }
}
