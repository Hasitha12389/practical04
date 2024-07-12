object q1{
  // Inventory means Array of items in the stock

  //q1 part 1
  def displayInventory(arr1: Array[String], arr2: Array[Int]): Unit = {
    arr1.zip(arr2).foreach { case (str, num) =>  // zip - pair the coresponding elements of both String and Int Arrays
      println(s"$str -->> $num")    // for each loop print that all pairs in this format
    }
  }


  //q2 part 2
  def createInventory(arr1: Array[String], arr2: Array[Int]): Map[String, Int] = {
    arr1.zip(arr2).toMap   // tomap - method convert pairs into map (key-value pairs (name - quantities)) 
  }

  def restockItem(name: String, quantity: Int, inventory: Map[String, Int]): Map[String, Int] = {        // Map[String, Int] String int pairs 
    inventory.get(name) match {           // get the given argument name and check it is exists in the inventory
      case Some(existingQuantity) =>
        val updatedQuantity = existingQuantity + quantity
        println("Restocked item")
        inventory.updated(name, updatedQuantity)

      case None =>
        println("Item does not exist in inventory.")
        inventory
    }
    //This function return the updated inventory map
  }

  def main(args: Array[String]): Unit = {
    val names = Array("Biscuits", "Sugar", "Cake", "Rice", "Soap")
    val quantities = Array(20, 10, 5, 20, 15)

    displayInventory(names, quantities)

    val initialInventory = createInventory(names, quantities)                 // inventory map
    var updatedInventory = restockItem("Biscuits", 17, initialInventory)
    updatedInventory = restockItem("toffy", 5, initialInventory)
    // You can continue using 'updatedInventory' in your program

    println(updatedInventory)
  }
}
