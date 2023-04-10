# Using (equivalents of) lambda, map, filter, and fold in Scala

## Table of Contents
 - [Introduction](#introduction)  
 - [Overview of Scala](#overview-of-scala)  
 - [Basic Syntax](#basic-syntax)
 - [lamda and HOPs in Scala](#lambda-and-hops-in-scala)
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
In this section we will be disscussing the use of lambda and HOPs in Scala.

### lambda


In Scala, a collection is a data structure that houses a number of items. Collections include things like List, Tuple, Option, Map, etc.
Many techniques can be used to modify these collections. Here we will be focusing on the behavior of the HOPs on the most common type of Collection which is Lists. 

### map
The behavior is similar to Racket.
Some important remarks:
- Every collection object has the map() method.
- map() returns a new collection of the same type as the source collection.

#### Syntax
```
// collection is the original collection
// func is a predefined function
collection = (e1, e2, e3, ...)
result_collection = collection.map(func)
```

#### Example 1: pass a user defined function
```
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
The output will be:
List(1, 4, 9, 16, 25, 36)
```
#### Example 2: define the body of func in the bracket
```
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
The output will be:
List(Joel, Ed, Chris, Maurice)
```
Since we have discuessed the use of lambda expression in Scala, we can also use lambda expression
#### Example 3
```
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
The output will be:
List(1, 4, 9, 16, 25, 36)
```

### fold
The fold method iterates over a collection using an initial value for the accumulator and a function that correctly updates the accumulator using each element. The fold method has two variants - foldLeft and foldRight. 





## Conlusion


## Reference
https://docs.scala-lang.org/overviews/scala-book/collections-methods.html#map
