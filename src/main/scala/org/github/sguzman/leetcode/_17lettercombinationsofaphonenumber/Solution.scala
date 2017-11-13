package org.github.sguzman.leetcode._17lettercombinationsofaphonenumber

object Solution {
  def letterCombinations(digits: String): List[String] = {
    if (digits.isEmpty) List()
    else digits
      .map(toLetters)
      .foldLeft(Seq(""))(
        (c, d) => c
          .flatMap(i => d
            .map(i + _)
          )
      )
      .toList
  }

  def toLetters(digit: Char): Set[String] = digit match {
    case '2' => Set("a", "b", "c")
    case '3' => Set("d", "e", "f")
    case '4' => Set("g", "h", "i")
    case '5' => Set("j", "k", "l")
    case '6' => Set("m", "n", "o")
    case '7' => Set("p", "q", "r", "s")
    case '8' => Set("t", "u", "v")
    case '9' => Set("w", "x", "y", "z")
  }
}