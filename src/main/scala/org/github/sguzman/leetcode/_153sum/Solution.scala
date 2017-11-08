package org.github.sguzman.leetcode._153sum

import scala.collection.mutable

object Solution {
  def threeSum(_nums: Array[Int]): List[List[Int]] = {
    val nums = _nums.sorted
    val lists = mutable.ListBuffer[List[Int]]()
    var i = 0
    while (i < nums.length - 2) {
      if (i == 0 || (i > 0 && nums(i) != nums(i - 1))) {
        var j = i + 1
        var k = nums.length - 1
        val sum = -nums(i)
        while (j < k)
          if (j != i + 1 && nums(j) == nums(j - 1)) {
            j += 1
          } else if (k != nums.length - 1 && nums(k) == nums(k + 1)) {
            k -= 1
          } else if (nums(j) + nums(k) == sum) {
            lists.append(List(nums(i), nums(j), nums(k)))
            while (j < k && nums(j) == nums(j + 1)) {
              j += 1
            }
            while (j < k && nums(k) == nums(k - 1)) {
              k -= 1
            }
            j += 1
            k -= 1
          } else if (nums(j) + nums(k) < sum) {
            j += 1
          } else {
            k -= 1
          }
      }
      i += 1
    }
    lists.toList
  }
}