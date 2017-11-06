package org.github.sguzman.leetcode._153sum

import scala.collection.mutable

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val hash = mutable.HashMap[Int,(Int,Int)]()
    val lists = mutable.ListBuffer[List[Int]]()

    (0 until nums.length - 2).foreach(idx => {
      val numI = nums(idx)
      ((idx + 1) until nums.length).foreach(jdx => {
        val numJ = nums(jdx)

      })
    })

    lists.toList
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val mutHash = mutable.HashMap[Int,Int]()

    nums.indices.foreach(idx => {
      val num = nums(idx)
      if (mutHash.contains(num))
        return Array(mutHash(num), idx)
      else
        mutHash.put(target - num, idx)
    })

    // Shouldn't get here
    Array()
  }
}