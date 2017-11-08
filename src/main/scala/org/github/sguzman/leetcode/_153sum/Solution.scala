package org.github.sguzman.leetcode._153sum

import scala.collection.mutable

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val lists = mutable.ListBuffer[List[Int]]()
    val sort = nums.sorted

    (0 until (sort.length - 2)).foreach(idx => {
      if (idx == 0 || (idx > 0 && sort(idx) != sort(idx - 1))) {
        var jdx = idx + 1
        var kdx = sort.length - 1
        val partial = 0 - sort(idx)

        while (jdx < kdx) {
          if (sort(jdx) + sort(kdx) == partial) {
            lists.append(List(sort(idx), sort(jdx), sort(kdx)))
            while (jdx < kdx && sort(jdx) == sort(jdx + 1)) jdx += 1
            while (jdx < kdx && sort(kdx) == sort(kdx - 1)) jdx += 1

            jdx += 1
            kdx -= 1
          }
          else if (sort(jdx) + sort(kdx) > partial) {
            kdx -= 1
          } else {
            jdx += 1
          }
        }
      }
    })

    lists.toList
  }
}