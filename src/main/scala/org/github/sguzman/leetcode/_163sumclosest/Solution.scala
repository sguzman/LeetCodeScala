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
        var jdx = idx + 1
        var kdx = sort.length - 1
        while (jdx < kdx) {
          val sum = sort(idx) + sort(jdx) + sort(kdx)
          val diff = math.abs(target - sum)

          if (diff == 0) {
            return sum
          }

          if (diff < min) {
            min = diff
            summation = sum
          }

          if (sum > target) {
            kdx -= 1
          } else {
            jdx += 1
          }
        }
      }

      summation
    }
  }
}