 def summerBois(temp: Int, summer: Boolean): Any = (temp,summer) match{
  case(_,true) if (temp <= 100 && temp>=60) => true
  case(_,false) if (temp <= 90 && temp>=60) => true
  case(_) => false
}
println(summerBois(1, false))
println(summerBois(600, true))
println(summerBois(60, false))

def sum3(num1: Int, num2: Int, num3: Int): Unit = {
  val myL = List(num1, num2, num3)
  if ((List(num1, num2, num3).distinct.length) == 1) println(0)
  if ((List(num1, num2, num3).distinct.length) > 1) {
    ist(num1, num2, num3).distinct.filterNot(List(num1, num2, num3).groupBy(identity).collect { case (x, List(_, _, _*)) => x }))
  }
}
sum3(3, 2, 3)

def luhnAlgorithm (num: String): Int = {
  val number: String = num.reverse
  var evens: Int = 0
  var odds: Int = 0
  var oddSplit: Int = 0
  for (i<-0 to number.length - 1  by 2) evens += number.charAt(i).toString.toInt
  for (i<-1 to number.length - 1 by 2) {
    oddSplit = number.charAt(i).toString.toInt * 2
    if (oddSplit > 9){
     odds += oddSplit.toString.substring(0,1).toInt + oddSplit.toString.substring(1).toInt
    } else {
      odds += oddSplit
    }
  }
  evens + odds
}
def luhnCheck (luhn: Int): Any = if (luhn % 10 == 0) luhn + " Valid" else luhn + " Not valid"
println(luhnCheck(luhnAlgorithm("49927398716")))



def elloEllo (hello: String, num: Int): String =  hello.substring(hello.length-num)
println(elloEllo("Hello", 4))

def con5 (first: String, second: String, third: Char, fourth: Char ): String ={
  var word: String = first.concat(second)
    word.replace(fourth, third)
}
println(con5("Ha","llo",'e','a'))

def operator911 (num1: Int, num2: Int, bool: Boolean) : Int = {
  if (num1 == 0 && num2 ==0)
    0
  else if (num1 == 0)
    num2
  else if (num2 == 0)
    num1
  else if (bool == true)
    num1 + num2
  else
    num1 * num2
}
  println(operator911(3,8, false))


def welcomeName(hello: String, num: Int): Unit = for (i <- 1 to num) println(hello)
welcomeName("Hello", 8)


def leppard(hello: String, num: Int): Unit = {
  for (i <- 1 to num)
    println(hello * num)
}
leppard("A", 5)

def tones(f: String, b: String) : Unit = {
  for (i <- 1 to 30)
    if (i % 3 == 0 && i % 5 == 0) println(f + b)
    else if (i % 3 == 0) println(f)
    else if (i % 5 == 0) println(b)
    else println(i)
}
tones("Fizz","Buzz")

//def welcomeNoLoops(hello: String, num: Int) : Unit = {
//  if (0 < num)
//    println(hello)
//    welcomeNoLoops("Boi", num - 1)
//
//}
//welcomeNoLoops("Boi", 5)

//def welcomeNoLoops1(hello: String, num: Int, count: Int) : Unit = {
//  if (0 < count){
//    println(hello * num)
//  welcomeNoLoops1("B", num, count -1)
//} else {
//  sys.exit()
//}
//}
//welcomeNoLoops1("B", 5, 5)

def metal(f: String, b: String, count: Int, i: Int) : Unit = {
  if (i <= count) {
    if (i % 3 == 0 && i % 5 == 0) println(f + b)
    else if (i % 3 == 0) println(f)
    else if (i % 5 == 0) println(b)
    else println(i)
    metal("Mad", "Dog", 30 , i+1)
  }
}
metal("Mad", "Dog", 30, 1)

def pattern(i:Int) : String = i match {
case i if (i % 3 == 0 && i % 5 == 0) => "Saturdays are for the boys"
case i if (i % 3 == 0) => "Saturdays"
case i if (i % 3 == 0) => "Boys"
case _ => i.toString
}
pattern(16)

def operator999 (num1: Int, num2: Int, bool: Boolean) : Int = num1 match{
  case 1 if (num1 == 0 && num2 == 0) => 0
  case 2 if (num1 == 0) => num2
  case 3 if (num2 == 0) => num1
  case 4 if (bool == true) => num1 + num2
  case _ if (bool == false) => num1 * num2
}
operator999(0, 5, false)


def switcher (num1: Int, num2: Int)  = Int match {
  case _ => (num2, num1)
}
switcher(3,8)

def blackJack (num1: Int, num2: Int) : Any = (num1, num2) match {
  case (_,_) if (num1 > 21 && num2 > 21) => 0 + " Dealer and Player bust!"
  case (_,_) if (num1 == num2) => num1 + " Dealer wins!"
  case (_,_) if (num1 <= 21 && num1 > num2 || num2 > 21) => num1 + " Dealer wins!"
  case (_,_) if (num2 <= 21 && num2 > num1 || num1 > 21) => num2 + " Player wins!"
}
blackJack(20, 22)

def userNameMaker (fstName: String, sndName: String) : String = {
  val first: String = fstName.substring(0, 3)
  val second: String = sndName.substring(0, 3)
  val third: String = fstName.substring(0, 1)
  val fourth: String = sndName.substring(0, 1)
  val r = new scala.util.Random()
  val r1 = 1 + r.nextInt(99 - 1)
  (first + second + third + fourth).toLowerCase() + r1.toString + "@scala.com"
}
println(userNameMaker("David", "Hutton-Lewis"))

