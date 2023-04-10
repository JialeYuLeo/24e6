# Using (equivalents of) lambda, map, filter, and fold in Scala

## Table of Contents
 - [Introduction](#introduction)  
 - [Overview of Scala](#overview-of-scala)  
 - [Basic Syntax](#basic-syntax)
 - [lambda and HOPs in Scala](#lambda-and-hops-in-scala)
   - [lambda](#lambda)
   - [map](#map)
   - [filter](#filter)
   - [fold](#fold)
 - [Conclusion](#conclusion)
 - [Reference](#reference)
 
 ## Introduction
 Functional programming is a programming paradigm that focuses on the use of functions to perform operations. 
 It is an approach to programming that emphasizes the use of pure functions and immutable data structures. 
 Some of the key concepts in functional programming include lambda expressions, map, filter, and fold. 
 Scala is a popular programming language that supports functional programming paradigms. 
 In this lesson, we will explore how these functional programming concepts are used in Scala and compare them with Racket, 
 another popular functional programming language which has been covered in our course.
 
 ## Overview of Scala
Scala is a robust, statically typed, high-level, general-purpose programming language that is compatible with both 
functional and object-oriented programming. Many of Scala's design choices are intended to address Java criticisms 
because it is designed to be concise.  
Scala offers a simple syntax for defining **anonymous functions**(lambda expressions) and also enables 
the use higher-order functions.
Scala is widely used in industry and academia for a variety of applications, including web development,
data analysis, and scientific computing. Its combination of object-oriented and functional programming features make 
it a versatile language that can be used for many different types of projects.  
[The install instruction of Scala](https://www.scala-lang.org/download/)  
[A nice tutorial for you to get started](https://docs.scala-lang.org/getting-started/index.html)  
[Another tutorial for beginners](https://www.tutorialspoint.com/scala/index.htm)

Currently, Scala 2 and Scala 3 are two major versions of the Scala programming language. 
The main version of Scala has been Scala 2 from its initial release in 2004. 
In 2020, Scala 3, also known as Dotty, saw its initial release. It is a significant update to the 
language that adds a number of new features and enhancements.

In this lesson, we will be using **Scala 3** to demonstrate HOPs in Scala.  


## Basic Syntax

## lambda and HOPs in Scala
In this section we will be discussing the use of lambda and HOPs in Scala.

### lambda

Lambda expressions use anonymous functions to define reusable functions in a concise way. It is particularly useful when you need to pass a function as an argument to a higher-order function, such as `map` or `filter`.

#### Syntax
```Scala
val variableName = (inputVariable: DataType) => transformationExpression
```

#### Example 1: Basic lambda function with String
```Scala
object Lambda
{
    def main(args:Array[String]) = 
    {
        // Define a lambda function that takes a string and returns its reverse
        val reverseString = (input: String) => input.reverse  
        val result = reverseString("Scala")
        println(result)
    }
}
```

The output will be:

```Scala
alacS
```

#### Example 2: Basic lambda function with Int
```Scala
object Lambda
{
    def main(args:Array[String]) = 
    {
        // Define a lambda function that takes two integers and returns the sum
        val add = (x: Int, y: Int) => x + y
        val result = add(5, 7)
        println(result)
    }
}
```
The output will be:

```Scala
12
```


In Scala, a collection is a data structure that houses a number of items. Collections include things like List, Tuple, Option, Map, etc.
Many techniques can be used to modify these collections. Here we will be focusing on the behavior of the HOPs on the most common type of Collection which is Lists. 

### map
The behavior is similar to Racket.
Some important remarks:
- Every collection object has the map() method.
- map() returns a new collection of the same type as the source collection.

#### Syntax
```Scala
// collection is the original collection
// func is a predefined function
collection = (e1, e2, e3, ...)
result_collection = collection.map(func)
```

#### Example 1: pass a user defined function
```Scala
object Map
{
    // square of an integer
    def square(a:Int):Int =
    {
        a*a
    }  
    def main(args:Array[String]) = 
    {
        // original collection
        val collection = List(1, 2, 3, 4, 5, 6) 
        
        // result collection
        val result_collection = collection.map(square)
        println(result_collection)
  
    }
  
}
```
The output will be:

```Scala
List(1, 4, 9, 16, 25, 36)
```
#### Example 2: define the body of func in the bracket
```Scala
object Map
{
    def main(args:Array[String]) = 
    {
        // original collection
        val collection = List("joel", "ed", "chris", "maurice")
        
        // result collection
        val result_collection = collection.map(_.capitalize)
        println(result_collection)
    }
  
}
```

The output will be:
```Scala
List(Joel, Ed, Chris, Maurice)
```
Since we have discussed the use of lambda expression in Scala, we can also use lambda expression
#### Example 3
```Scala
object Map
{
    def main(args:Array[String]) = 
    {
        // original collection
        val collection = List(1, 2, 3, 4, 5, 6) 
        
        // result collection
        val result_collection = collection.map(x => x * x )
        println(result_collection)
  
    }
  
}
```

The output will be:
```Scala
List(1, 4, 9, 16, 25, 36)
```

### filter
The filter() method is utilized to select all elements of the list which satisfies a stated predicate.

#### syntax
```
def filter(p: (A) => Boolean): List[A]
```

#### Example
```Scala
object Filter {
   def main(args: Array[String]) = {
      val list = List(3, 6, 9, 4, 2)
      println(list)
      val result = list.filter(x=>{x % 3 == 0})
      println(result)      
   }
}
```
The output will be:
```Scala
List(3, 6, 9, 4, 2)
List(3, 6, 9)
```

### fold
The fold method iterates over a collection using an initial value for the accumulator and a function that correctly updates the accumulator using each element. The fold method has two variants - `foldLeft` and `foldRight`. They differ in the direction in which they traverse the collection: `foldLeft` processes elements from left to right, and `foldRight` processes elements from right to left.

#### Syntax

foldLeft: 
```Scala
collection.foldLeft(initialValue)((accumulator, element) => operation)
```
foldRight: 
```Scala
collection.foldRight(initialValue)((element, accumulator) => operation)
```
In both cases, the initialValue is the starting value of the accumulator, and operation is the binary function used to combine the accumulator and the current element.

#### Example
```Scala
object Map
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
```

The output will be:
```Scala
Sum using foldLeft: 15
Sum using foldRight: 15
```
But in Scala, we have a fold() method also which does not specify the order of processing order of elements in the input list. The fold method primarily exists to support ***parallelism***. 
In order to make parallel programming easier, parallel collections were added to the Scala standard library. By sparing users from low-level parallelization complexities, parallel collections offer them a straightforward and recognisable high-level abstraction. The processing of large amounts of data, multimedia, and heavy calculations can all be sped up with parallel computing. Hence parallel collections will be useful when users are dealing with large input data.
To perform the same operation in ***parallel***, one just simply invoke the `par` method on the collection.
```
// first we want to parallelize the list to see the difference between the behavior of fold() and foldLeft()/foldRight().
// without parallelizing the list fold() will act exactly the same as foldLeft().
// the script below will print the actuall process of the internal execution

  val parallelNum = List(1, 2, 3, 4, 5).par
  val foldResult = parallelNumSeq.fold(0) { (acc1, acc2) =>
    val sum = acc1 + acc2
    println(s"Fold: acc1($acc1) + acc2($acc2) = $sum")
    sum
  }
  println(foldResult)

  val foldLeftResult =
    parallelNum.foldLeft(0) { (acc, currNum) =>
      val sum = acc + currNum
      println(s"FoldLeft: acc($acc) + currNum($currNum) = $sum ")
      sum
    }
  println(foldLeftResult)

  val foldRightResult =
    parallelNum.foldRight(0) { (currNum, acc) =>
      val sum = acc + currNum
      println(s"FoldRight: acc($acc) + currNum($currNum) = $sum")
      sum
    }
  println(foldRightResult)

And the output will be:
Fold: acc1(0) + acc2(4) = 4
Fold: acc1(0) + acc2(2) = 2
Fold: acc1(0) + acc2(5) = 5
Fold: acc1(0) + acc2(3) = 3
Fold: acc1(0) + acc2(1) = 1
Fold: acc1(1) + acc2(2) = 3
Fold: acc1(4) + acc2(5) = 9
Fold: acc1(3) + acc2(9) = 12
Fold: acc1(3) + acc2(12) = 15
15
FoldLeft: acc(0) + currNum(1) = 1 
FoldLeft: acc(1) + currNum(2) = 3 
FoldLeft: acc(3) + currNum(3) = 6 
FoldLeft: acc(6) + currNum(4) = 10 
FoldLeft: acc(10) + currNum(5) = 15 
15
FoldRight: acc(0) + currNum(5) = 5
FoldRight: acc(5) + currNum(4) = 9
FoldRight: acc(9) + currNum(3) = 12
FoldRight: acc(12) + currNum(2) = 14
FoldRight: acc(14) + currNum(1) = 15
15
```
## Conlusion


## Reference
https://docs.scala-lang.org/overviews/scala-book/collections-methods.html#map
