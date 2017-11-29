val map = Map(1 -> "smrdo", 2 -> "stuff")

// scala compiler transforms a binary operation expressions like
// 1 -> "smrdo" into (1).->("smrdo")
// thus you are actually calling a method named ->
// on an integer with the value 1, passing in a string as a parameter

// -> method can be called on any object, returns a two-element tuple
// containing the key and value
