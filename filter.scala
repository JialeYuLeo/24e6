object Demo {
   def main(args: Array[String]) = {
      val list = List(1, 2, 3, 6, 9, 4, 12)
      println(list)
      val result = list.filter(x=>{x % 3 == 0})
      println(result)      
   }
}