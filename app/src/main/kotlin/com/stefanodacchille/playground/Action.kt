package com.stefanodacchille.playground

enum class Action {
  // digits
  ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
  // binary operations
  ADD, SUB, MUL, DIV,
  // unary operations
  PERCENT, NEGATE, DECIMAL,
  EQUALS, CLEAR

  companion object {

    fun digits() : Array<Action> {
      return arrayOf(ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE)
    }
  }
}
