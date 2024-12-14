```groovy
def calculateWithException(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Null values are not allowed")
  }
  return a + b
}

def calculateWithElvis(a, b) {
  return (a ?: 0) + (b ?: 0)
}

println calculateWithException(5, 3) // 8
println calculateWithElvis(5, 3) // 8

try {
  println calculateWithException(null, 3) // Throws exception
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}
println calculateWithElvis(null,3) //3
```