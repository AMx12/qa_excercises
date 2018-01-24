def footLong(one: String, two: String): Unit = { var oneSet: Set[String] = Set(); var twoSet: Set[String] = Set()
  var num: Int = 0
  var num2: Int = 0
  for(i<-0 to one.length){ num+=1
    for(j<-num to one.length) oneSet += one.toLowerCase().substring(i,j)
  }
  for(i<-0 to two.length){ num2+=1
    for(j<-num2 to two.length) twoSet += two.toLowerCase().substring(i,j)
  }
  println((oneSet&twoSet).maxBy(_.length))
}
footLong("hellohelloandrewoiqweowiqumoon", "yoechohellomoonandrwanderew")