package org.github.sguzman.leetcode._174sum

import scala.collection.mutable

object Solution {
  def fourSum(nums: Array[Int], target: Int): List[List[Int]] = {
    if (nums.length == 4 && nums.sum == target) List(List(nums: _*))
    else if (nums.length < 4) List(List())
    else {
      val sort = nums.sorted
      val lists = mutable.ListBuffer[List[Int]]()
      for (h <- 0 until sort.length - 3) {
        if (h == 0 || (h > 0 && sort(h) != sort(h - 1))) {
          for (i <- h + 1 until sort.length) {
            if (i == h + 1 || (i > h + 1 && sort(i) != sort(i - 1))) {
              var l = i + 1
              var r = sort.length - 1

              while (l < r) {
                val sum = sort(h) + sort(i) + sort(l) + sort(r)

                if (sum == target) {
                  lists.append(List(sort(h), sort(i), sort(l), sort(r)).sorted)
                  l += 1
                  r -= 1
                  while (l < r && sort(l) == sort(l - 1)) {
                    l += 1
                  }
                  while (l < r && sort(r) == sort(r - 1)) {
                    r -= 1
                  }
                } else if (sum > target) {
                  r -= 1
                } else {
                  l += 1
                }
              }
            }
          }
        }
      }

      lists.toList
    }
  }
}