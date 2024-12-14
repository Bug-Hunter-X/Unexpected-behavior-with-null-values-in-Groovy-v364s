# Groovy Null Value Handling Bug

This repository demonstrates a common issue in Groovy related to handling null values in functions.  The `calculate` function doesn't explicitly handle null values, leading to unexpected behavior.  This example shows how to improve null handling and avoid potential errors.

## Bug Description

The `calculate` function, designed to add two numbers, returns 0 when either input is null. This might not be the desired behavior in all cases.  Ideally, the function should either throw an exception or handle nulls in a more appropriate way.

## Solution

The solution demonstrates two better ways to handle null values:

1. **Explicit Null Check with Exception:**  Throws an `IllegalArgumentException` if a null value is passed.
2. **Null Coalescing Operator:** Uses Groovy's Elvis operator (`?:`) to provide a default value if a null is encountered.

This example highlights the importance of explicit null handling to prevent unexpected outcomes in Groovy applications.