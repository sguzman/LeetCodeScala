package org.github.sguzman.leetcode._4medianoftwosortedarrays

object Solution {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val len = nums1.length + nums2.length
    if (len %  2 == 0) {
      val a = Solution.findK(Array(), nums1, nums2, (len - 1) / 2)
      val b = Solution.findK(Array(), nums1, nums2, len / 2)

      (a + b) / 2.0
    }
    else Solution.findK(Array(), nums1, nums2, (len - 1) / 2)
  }

  def findK(buff: Array[Int], nums1: Array[Int], nums2: Array[Int], k: Int): Double = {
    if (buff.length == (k + 1)) buff.last
    else if (nums1.length == 0 || nums2.length == 0) {
      val nums = buff ++ nums1 ++ nums2
      nums(k)
    } else if (nums1.head == nums2.head) {
      Solution.findK(buff :+ nums1.head :+ nums2.head, nums1.tail, nums2.tail, k)
    } else if (nums1.head > nums2.head) {
      Solution.findK(buff :+ nums2.head, nums1, nums2.tail, k)
    } else {
      Solution.findK(buff :+ nums1.head, nums1.tail, nums2, k)
    }
  }
}