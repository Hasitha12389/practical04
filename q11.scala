object q11 {
  val itemNames = Array("biscuits", "sugar", "cake", "rice", "soap")
  val itemQuantities = Array(20, 10, 5, 20, 15)

  def displayInventory(): Unit = {
    println("-----------------Inventory--------------------------")
    itemNames.zip(itemQuantities).foreach { // zip method pair each element of the two arrays
      case (name, quantity) =>              //for each print each pair 
      println(s"$name -->> $quantity")                                  
    }
  }

  def restockItem(name: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(name)         // find out index of given name in itemNames array and store it in val.
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $name. Now ${itemQuantities(index)} $name are available.")
    } else {
      println(s"$name is does not exist in inventory.")
    }
  }

  def sellItem(name: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(name)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $name. Remaining $name quantity is ${itemQuantities(index)}.")
      } else {
        println(s"Not enough quantity of $name to sell. Only available ${itemQuantities(index)}.")
      }
    } else {
      println(s"$name is does not exist in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("biscuits", 17)
    restockItem("banana",10)
    sellItem("sugar", 8)
    sellItem("cake",7)
    sellItem("jam",4)
    displayInventory()
  }
}
