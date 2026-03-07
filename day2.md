# Day 2 — Variables, Data Types & Writing Your First Program

> **DSA Partner Challenge** | Week 1: Language Basics + Maths for DSA

---

## 📌 Topic of the Day

##Notes: https://drive.google.com/file/d/1GWlAVWke6TmOTyRqjnvbPNQzvtUP6TUa/view?usp=sharing

**Variables, Data Types, Input/Output & Debugging**

Today you write actual code for the first time in this challenge. By the end of the day you should be able to take input, process it, and print output — the skeleton of every single DSA solution you'll ever write.

---

## 🎥 Resources

| Language | Resource |
|----------|----------|
| ☕ Java | [Kunal Kushwaha — Java Architecture, I/O & Debugging](https://youtu.be/TAtrPoaJ7gc?si=dngwtFRNn0whie7D) |
| 🐍 Python | CampusX — 100 Days of Python *(Variables, Data Types & I/O section)* |
| ⚙️ C++ | Love Babbar / Striver — Variables, Data Types & I/O |

---

## 🧠 What to Learn Today

### Variables
- A named container in memory that holds a value
- Every variable has a name, a type, and a value
- Declaration → `int age;` | Initialization → `age = 21;` | Both → `int age = 21;`
- Java convention: camelCase → `myAge` not `my_age`

### Primitive Data Types (Java)

| Type | Size | Example | Use |
|------|------|---------|-----|
| `int` | 4 bytes | `int x = 10;` | Whole numbers — most common in DSA |
| `long` | 8 bytes | `long x = 100000L;` | Large whole numbers |
| `double` | 8 bytes | `double pi = 3.14;` | Decimals (more precise) |
| `float` | 4 bytes | `float x = 3.14f;` | Decimals (less precise) |
| `char` | 2 bytes | `char c = 'A';` | Single character (single quotes) |
| `boolean` | 1 bit | `boolean b = true;` | true or false only |
| `byte` | 1 byte | `byte b = 127;` | Small integers |
| `short` | 2 bytes | `short s = 300;` | Integers -32768 to 32767 |

> `String` is **not** a primitive — it's an object. `String name = "Tripti";` (capital S, double quotes)

### Type Casting
- Widening (automatic): `int → long → double` — no data loss
- Narrowing (manual): must cast explicitly — `int x = (int) 9.99;` → gives `9` (decimal lost)

### Output (Java)
```java
System.out.println("Hello");           // prints + newline
System.out.print("Hello");             // prints, no newline
System.out.printf("Name: %s, Age: %d%n", name, age);  // formatted
```
Format specifiers: `%d` (int), `%f` (double), `%s` (String), `%c` (char), `%n` (newline)

### Input using Scanner (Java)
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int num      = sc.nextInt();         // reads integer
double d     = sc.nextDouble();      // reads decimal
String word  = sc.next();            // reads one word
String line  = sc.nextLine();        // reads full line
char c       = sc.next().charAt(0);  // reads character
sc.close();
```

> ⚠️ After `nextInt()`, calling `nextLine()` reads the leftover newline. Fix: add an extra `sc.nextLine()` to flush it.

### Python I/O
```python
name = input("Enter name: ")       # always returns string
age  = int(input("Enter age: "))   # cast to int
print("Hello", name)
print(f"Hello {name}, you are {age} years old")  # f-string
```

### C++ I/O
```cpp
#include <iostream>
using namespace std;

int x;
cin >> x;
cout << "Value: " << x << endl;
```

### Debugging Basics
- **Syntax Error** → wrong grammar, caught at compile time (missing `;`, wrong spelling)
- **Runtime Error** → valid code but crashes during execution (divide by zero, null pointer)
- **Logic Error** → runs fine but gives wrong output — hardest to find
- Debug by: reading the full error message, adding print statements to trace values, using breakpoints in IDE
- Check first: wrong variable name? Off by one? `=` instead of `==`?

---

## 💻 Practice Questions

Solve in your language. Push solutions to your fork of the repo.

**1.** Write a program to print whether a number is **even or odd** — take input from the user.

**2.** Take a **name as input** and print a greeting message for that name.
```
Input: Tripti
Output: Hello Tripti, welcome to the DSA Challenge!
```

**3.** Input **Principal (P), Time (T), Rate (R)** from the user and calculate **Simple Interest**.
```
SI = (P * T * R) / 100
```

**4.** Take two numbers and an **operator (+, -, *, /)** as input and calculate the result using if conditions.
```
Input: 10 + 5
Output: 15
```

**5.** Take **2 numbers** as input and print the **largest**.

**6.** Input an amount in **Indian Rupees** and convert it to **USD**.
*(Use: 1 USD = 83.5 INR — update with current rate)*

**7.** Print the **Fibonacci Series** up to n numbers.
```
Input: 7
Output: 0 1 1 2 3 5 8
```

**8.** Check whether a given **String is a Palindrome** or not.
```
Input: "racecar" → Palindrome
Input: "hello"   → Not a Palindrome
```

**9.** Find all **Armstrong Numbers** between two given numbers.
> An Armstrong number = sum of each digit raised to the power of number of digits
> e.g. 153 = 1³ + 5³ + 3³ = 153 ✅

---

## ✅ Checklist Before You Sleep

- [ ] Watched the resource video for my language
- [ ] I know all 8 primitive types in Java (or equivalents in my language)
- [ ] I can take input and print output without looking it up
- [ ] I understand the difference between `print` and `println`
- [ ] I know what widening and narrowing type casting mean
- [ ] I can explain the 3 types of errors
- [ ] Solved at least questions 1–5
- [ ] Attempted questions 6–9

---

## 💬 Community

Stuck on any question? Drop the question number in the community — someone will help.

**Solved all 9? Drop a 🔥 in the community.**

---

*Next up → Day 3: Conditional Statements (if, else if, else, switch, ternary)*
