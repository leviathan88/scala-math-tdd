val list = List(1,2,3,4,5,6,7,8)

val twoThree = List(2,3)
val oneTwoThree = 1 :: twoThree

// :: actually calls the method of the right side object
// not the left side, basically any operator call that ends with :
// calls the right side