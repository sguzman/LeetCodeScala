package org.github.sguzman.leetcode._10regularexpressionmatching

object Solution {
  def isMatch(text: String, pattern: String): Boolean = {
    if (pattern.isEmpty) return text.isEmpty

    val first = !text.isEmpty && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.')
    if (pattern.length >= 2 && pattern.charAt(1) == '*')
      isMatch(text, pattern.tail.tail) || (first && isMatch(text.tail, pattern))
    else
      first && isMatch(text.substring(1), pattern.substring(1))
  }
}