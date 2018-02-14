def sayHello(callback: () => Unit): Unit = {
  callback
}

val another = (callback: () => Unit) =>  callback()

val fod: (Int => Int) => Int = (cb: Int => Int) => cb(12)
val add1: Int => Int = (i) => i + 1
val add2: Int => Int = (i) => { i + 1 }

val empty: Unit => {}

val executeAndPrint: ((Int, Int)=>Int, Int, Int) => Unit
  = (f: (Int, Int) => Int, a: Int, b: Int) => println(f(a,b))

val executeTwoFunctions : ((Int, Int) => Int, (Int, Int) => Int, Int, Int) => Tuple2[Int,Int] =
  (f1: (Int, Int) => Int, f2: (Int, Int) => Int, x: Int, y: Int) => (f1(x, y), f2(x, y))

def execute(f1: (Int, Int) => Int) : Int = f1(12,12)