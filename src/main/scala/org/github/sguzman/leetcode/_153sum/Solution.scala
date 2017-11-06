package org.github.sguzman.leetcode._153sum

import scala.collection.mutable

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val set = mutable.HashMap[Int,mutable.HashSet[Int]]()
    val lists = mutable.HashSet[Set[(Int,Int)]]()
    val values = mutable.HashSet[Set[Int]]()
    nums.indices.foreach(idx => {
      val num = nums(idx)
      if (set.contains(num)) {
        set(num).add(idx)
      } else {
        set.put(num, mutable.HashSet(idx))
      }
    })


    nums.indices.foreach(idx => {
      val numI = nums(idx)
      ((idx + 1) until nums.length).foreach(jdx => {
        val numJ = nums(jdx)
        val numH = 0 - (numI + numJ)
        if (set.contains(numH)) {
          val hdx = set(numH).head
          if (Set(hdx, idx, jdx).size == 3) {
            if (!values.contains(Set(numH, numJ, numI))) {
              lists.add(Set((numH, hdx), (numI, idx), (numJ, jdx)))
              values.add(Set(numH, numJ, numI))
            }
          }
        }
      })
    })

    lists.toList.map(_.toList.map(_._1))
  }
}