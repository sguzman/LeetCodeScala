package org.github.sguzman.leetcode._153sum

import scala.collection.mutable

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val set = mutable.HashMap[Int,mutable.HashSet[Int]]()
    val lists = mutable.HashSet[Set[(Int,Int)]]()
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
          val filtered = set(numH).filter(s => s != idx && s != jdx)
          if (filtered.nonEmpty) {
            val hdx = filtered.head
            lists.add(Set((numH, hdx), (numI, idx), (numJ, jdx)))
            set(numH).remove(hdx)
          }
        }
      })
    })

    lists.toList.map(_.toList.map(_._1))
  }
}