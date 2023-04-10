object Demo
{
    // square of an integer
    def square(a:Int):Int =
    {
        a*a
    }  
    def main(args:Array[String]) = 
    {
        // original collection
        val collectionEx1 = List(1, 2, 3, 4, 5, 6) 
        
        // result collection
        val result_collectionEx1 = collectionEx1.map(square)
        println(result_collectionEx1)


        // original collection
        val collectionEx2 = List("joel", "ed", "chris", "maurice")
        
        // result collection
        val result_collectionEx2 = collectionEx2.map(_.capitalize)
        println(result_collectionEx2)

        // original collection
        val collectionEx3 = List(1, 2, 3, 4, 5, 6) 
        
        // result collection
        val result_collectionEx3 = collectionEx3.map(x => x * x )
        println(result_collectionEx3)
  
    }
  
}