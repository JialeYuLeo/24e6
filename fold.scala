object Demo
{
    def main(args:Array[String]) = 
    {
        val numbers = List(1, 2, 3, 4, 5)

        // A binary function that returns the sum of two integers
        val sum = (accumulator: Int, element: Int) => accumulator + element

        // Use foldLeft to sum the elements of the list with an initial value of 0
        val leftSum = numbers.foldLeft(0)(sum)
        println(s"Sum using foldLeft: $leftSum")

        // Use foldRight to sum the elements of the list with an initial value of 0
        val rightSum = numbers.foldRight(0)(sum)
        println(s"Sum using foldRight: $rightSum")
    }
}