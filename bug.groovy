```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 //This will cause unexpected behavior if a or b is null
  }
  return a + b
}

println calculate(5, 3) // 8
println calculate(null, 3) // 0, unexpected if you expect an exception or different behavior
```