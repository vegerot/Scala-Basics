object flatmaps extends App {
  var coll = (1 until (10)).flatMap(i => {
    (1 until (10)).withFilter(j => i+j==10 /*true  some condition */ ).map(j => (i, j))
  }) 
  println(coll)
}
