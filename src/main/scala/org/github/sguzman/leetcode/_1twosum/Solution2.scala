package org.github.sguzman.leetcode._1twosum

object Solution2 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val indices = Map(nums.indices.map(idx => nums(idx) -> idx): _*)
    val sort = nums.sorted

    var i = 0
    var j = sort.length - 1
    while (i < j) {
      if (sort(i) + sort(j) == target) return Array[Int](indices(sort(i)), indices(sort(j)))
      else if (sort(i) + sort(j) > target) {
        j -= 1
      } else {
        i += 1
      }
    }

    Array[Int]()
  }

}
