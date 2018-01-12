def elloEllo (hello: String, num: Int): String =  hello.substring(hello.length-num)
println(elloEllo("Hello", 4))

def con5 (first: String, second: String, third: Char, fourth: Char ): String ={
  var word: String = first.concat(second)
    word.replace(fourth, third)
}
println(con5("Ha","llo",'e','a'))

def operator911 (num1: Int, num2: Int, bool: Boolean) : Int = {
  if (num1 == 0 && num2 ==0 )
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


def welcomeName(hello: String, num: Int): Unit = {
  for (i <- 1 to num)
    println(hello)
}
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
pattern(1)