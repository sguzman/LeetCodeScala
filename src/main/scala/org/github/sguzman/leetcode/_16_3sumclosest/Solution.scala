package org.github.sguzman.leetcode._163sumclosest

object Solution {
  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    if (nums.length < 4){
      nums.sum
    } else if (nums.forall(_ == nums.head)) {
      nums.head * 3
    } else {
      var min = math.max(math.abs(target - Int.MaxValue), math.abs(target - Int.MinValue))
      var summation = 0
      val sort = nums.sorted
      for (idx <- 0 until sort.length - 2) {
        val ints = sort.slice(idx + 1, sort.length)
        @annotation.tailrec
        def close(elements: Array[Int], min: Int, sum: Int): (Int, Int) = {
          if (elements.length <= 1) (min, sum)
          else {
            val summ = sort(idx) + elements.head + elements.last
            val diff = math.abs(target - summ)

            if (diff == 0) (diff, summ)
            else {
              val (newSum, newMin) = if (diff < min) (summ, diff) else (sum, min)
              if (summ > target) close(elements.init, newMin, newSum)
              else close(elements.tail, newMin, newSum)
            }
          }
        }
        val ret = close(ints, min, summation)
        min = ret._1
        summation = ret._2
      }

      summation
    }
  }
}