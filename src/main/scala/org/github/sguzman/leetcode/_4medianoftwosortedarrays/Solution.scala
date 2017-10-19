package org.github.sguzman.leetcode._4medianoftwosortedarrays

object Solution {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val len = nums1.length + nums2.length

    if (len % 2 == 0) {
      // if even
      val a = Solution.findKth(nums1, nums2, len / 2 + 1)
      val b = Solution.findKth(nums1, nums2, len / 2)

      (a + b) / 2.0
    } else {
      // if odd
      Solution.findKth(nums1, nums2, (len + 1) / 2)
    }
  }

  def findKth(nums1: Array[Int], nums2: Array[Int], k: Int): Int = {
    if (nums1.length == 0) nums2(k - 1)
    else if (nums2.length == 0) nums1(k - 1)
    else if (k == 1)
      if (nums1.head > nums2.head) nums2.head
      else nums1.head
    else {
      val medianA = nums1.length / 2
      val medianB = nums2.length / 2

      if (medianA + medianB + 1 >= k)
        if (nums1(medianA) <= nums2(medianB)) Solution.findKth(nums1, nums2.slice(0, medianB), k)
        else Solution.findKth(nums1.slice(0, medianA), nums2, k)
      else if (nums1(medianA) <= nums2(medianB)) Solution.findKth(nums1.slice(medianA + 1, nums1.length), nums2, k - medianA - 1)
      else Solution.findKth(nums1, nums2.slice(medianA + 1, nums2.length), k - medianB - 1)
    }
  }
}