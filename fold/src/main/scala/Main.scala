import scala.collection.parallel.CollectionConverters._
@main 
def demo: Unit =

  val parallelNum = List(1, 2, 3, 4, 5).par
  val foldResult = parallelNum.fold(0) { (acc1, acc2) =>
    val sum = acc1 + acc2
    println(s"Fold: acc1_is($acc1) + acc2_is($acc2) = $sum")
    sum
  }
  println(foldResult)

  val foldLeftResult = parallelNum.foldLeft(0) { (acc, currNum) =>
      val sum = acc + currNum
      println(s"FoldLeft: acc_is($acc) + currNum_is($currNum) = $sum ")
      sum
    }
  println(foldLeftResult)

  val foldRightResult = parallelNum.foldRight(0) { (currNum, acc) =>
      val sum = acc + currNum
      println(s"FoldRight: acc_is($acc) + currNum_is($currNum) = $sum")
      sum
    }
  println(foldRightResult)

  val stringifiedInts = List("1", "2", "3", "4", "5")
  val foldLeftSum = stringifiedInts.foldLeft(0)((acc, currNum) => acc + currNum.toInt)
  //val foldSum = stringifiedInts.fold(0)((currNum, acc) => currNum.toInt + acc)
  println(foldLeftSum)
