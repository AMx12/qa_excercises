def luhnAlgorithm (num: String): Int = { var evens: Int = 0; var odds: Int = 0
  for (i<-0 to num.length - 1  by 2) evens += num.charAt(i).toString.toInt
  for (i<-1 to num.length - 1 by 2) { var oddSplit = num.charAt(i).toString.toInt * 2
    if (oddSplit > 9) odds += oddSplit.toString.substring(0,1).toInt + oddSplit.toString.substring(1).toInt else odds += oddSplit
  }
  evens + odds
}
def luhnCheck (luhn: Int): Any = if (luhn % 10 == 0) luhn + " Valid" else luhn + " Not valid"
println(luhnCheck(luhnAlgorithm(("49927398716").reverse)))