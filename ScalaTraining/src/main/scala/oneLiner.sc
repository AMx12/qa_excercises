def theOne(): Unit = java.util.TimeZone.getAvailableIDs.map(_.split('/').tail.filter(_.size>1)).take(10).foreach(item => print(item.head + ", "))
theOne()