def whilst(testCondition: => Boolean)(blockOfCode: => Unit): Unit = {
  while(testCondition) {
    blockOfCode
  }
}

var i = 0
whilst(i < 5) {
  println(i)
  i+=1
}

// common pattern:
// 1. use one or more parameter groups to break the input parameters into different compartments
// 2. Specifically define the parameter in the last parameter group as a by-name parameter
// so the function can accept a custom block of code

def ifBothTrue(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) = {
  if(test1 && test2) {
    codeBlock
  }
}


// using IMPLICIT values
def printIntIfTrue(a: Int)(implicit b: Boolean) = if (b) println(s"printing ${a}")
implicit val boo = true
printIntIfTrue(45)

// must be in the same scope
// can only be one implicit parameter
// and it must be the last one

// using DEFAULT values
def f2(a: Int = 1)(b: Int = 3) = a + b

f2()()

f2()(12)

def f3(a: Int = 7)(b: Int = a) = a + b
f3(9)()
