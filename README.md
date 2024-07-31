# Kai Programming Language

## How to Run

To run a Kai program, you need a Kai interpreter,which is this repo . Follow these steps:

1. **Install the Kai Interpreter**: Download and install the Kai interpreter and build it .
2. **Execute the code**: This interpreter supports two ways of running code.If you start the interpreter from the command line and give it a path to a file, it reads the file and executes it. You can also run it interactively by firing it up without any arguments, and it will drop you into a prompt where you can enter and execute code one line at a time.

## Language features and grammar
## 1. Data Types

### Booleans
- Represent truth values: `true` and `false`.
```
true;  // Not false.
false; // Not *not* false.
```

### Numbers
- Kai has only one kind of number: double-precision floating-point.
```
1234;  // An integer.
12.34; // A decimal number.
```

### Strings
- Textual data enclosed in double quotes.
```
"I am a string";
"";    // The empty string.
```

### Nil
- Represents “no value”, similar to `null` in many other languages. In Kai, it's spelled `nil`.

## 2. Expressions

### Arithmetic
- Kai features basic arithmetic operators.
```
add + me;
subtract - me;
multiply * me;
divide / me;
-negateMe;
```

### Comparison and Equality
- Numbers (and only numbers) can be compared using standard comparison operators.
```
less < than;
lessThan <= orEqual;
greater > than;
greaterThan >= orEqual;
```
- Equality and inequality can be tested for values of any kind.Different types are never equivalent
```
1 == 2;         // false.
"cat" != "dog"; // true.
```

### Logical Operators
- The `not` operator (`!`) is a prefix operator that returns `false` if its operand is `true`, and vice versa.
```
!true;  // false.
!false; // true.
```

## 3. Statements

```
print "Hello, world!";
"some expression";
{
  print "One statement.";
  print "Two statements.";
}
```

## 4. Variables

- Variables are declared using `var` statements.
- If an initializer is omitted, the variable’s value defaults to `nil`.
```
var imAVariable = "here is my value";
var iAmNil;
```

## 5. Control Flow

### If Statement
- Executes one of two statements based on a condition.
```
if (condition) {
  print "yes";
} else {
  print "no";
}
```

### While Loop
- Repeatedly executes the body as long as the condition expression evaluates to `true`.
```
var a = 1;
while (a < 10) {
  print a;
  a = a + 1;
}
```

### For Loop
```
for (var a = 1; a < 10; a = a + 1) {
  print a;
}
```

## 6. Functions

- You can decalre your own function using fun keyword
```
fun printSum(a, b) {
  print a + b;
}
```
- A function call expression looks the same as it does in C
```
printSum(a, b);
```


