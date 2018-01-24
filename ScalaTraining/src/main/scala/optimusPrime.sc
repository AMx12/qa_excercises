def optimusPrime (limit: Int) : Unit = {
  var counter1: Int = 0
  var counter2: Int = 0
   for(i<-1 to limit){
     counter1 = 0
     for(j<-1 to i if(i%j==0)){
       counter1+=1
     }
     if (counter1 == 2) counter2+=1
   }
  println(counter2)
}
optimusPrime(10000)
