val unsorted = Array(1, 3, 9, 19, 23, 45, 5, 2, 12, 7)
val sorted = Array(1, 2, 3, 5, 7, 9, 12, 19, 23, 45)

unsorted.sortWith(_<_).deep.equals(sorted.deep)