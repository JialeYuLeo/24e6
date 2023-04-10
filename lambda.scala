object Demo
{
    def main(args:Array[String]) = 
    {   
        //lambda Example1
        // Define a lambda function that takes a string and returns its reverse
        val reverseString = (input: String) => input.reverse  
        val resultEx1 = reverseString("Scala")
        println(resultEx1)

        //lambda Example2
        // Define a lambda function that takes two integers and returns the sum
        val add = (x: Int, y: Int) => x + y
        val resultEx2 = add(5, 7)
        println(resultEx2)
    }
}