# Java-Tetris-Game
Java Tetris game clone source code. Uses Java 12.  
https://zetcode.com/javagames/tetris/

![Tetris game screenshot](tetris_game.png)

## Test Case Explanation
### First Test Case
1. Identify testable functions
   * x(int index)

2. Identify parameters, return types, return values, and exceptional behavior
   * parameter: index
   * return type: int
   * return value: the value inside coords[index][0]

3. Model the input domain

|                         | b1                     | b2                               | b3|b4|b5|b6|b7|b8|
|-------------------------|------------------------|----------------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: validity of index   | -1 < index < 4 (valid) | index < 0 or index > 3 (invalid) |  
| C2: coord of each shape | NoShape                | ZShape                           | SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  | 
4. Combine partitions into tests
   * ISP Criteria: BCC
   * Test requirements -- number of tests (upper bound) = 9
     (valid, LShape),(invalid, LShape), (valid, NoShape), (valid, ZShape), (valid, SShape), (valid, LineShape), (valid, TShape), (valid, SquareShape), (valid, MirroredShape)
5. Derive test values
* | Test                     | index | shape         | result                         |
  |--------------------------|-------|---------------|--------------------------------|
  | T1(valid, LShape)        | 3     | LShape        | 0                              |
  | T2(invalid, LShape)      | 4     | LShape        | ArrayIndexOutOfBoundsException |
  | T3(valid, NoShape)       | 3     | NoShape       | 0                              |
  | T4(valid, ZShape)        | 3     | ZShape        | -1                             |
  | T5(valid, SShape)        | 3     | SShape        | 1                              |
  | T6(valid, LineShape)     | 3     | LineShape     | 0                              |
  | T7(valid, TShape)        | 3     | TShape        | 0                              |
  | T8(valid, SquareShape)   | 3     | SquareShape   | 1                              |
  | T9(valid, MirroredShape) | 3     | MirroredShape | 0                              |

### Second Test Case
1. Identify testable functions
   * y(int index)

2. Identify parameters, return types, return values, and exceptional behavior
   * parameter: index
   * return type: int
   * return value: the value inside coords[index][0]

3. Model the input domain

|                         | b1                     | b2                               | b3|b4|b5|b6|b7|b8|
|-------------------------|------------------------|----------------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: validity of index   | -1 < index < 4 (valid) | index < 0 or index > 3 (invalid) |
| C2: coord of each shape | NoShape                | ZShape                           | SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  | 
4. Combine partitions into tests
   * ISP Criteria: BCC
   * Test requirements -- number of tests (upper bound) = 9
     (valid, LShape),(invalid, LShape), (valid, NoShape), (valid, ZShape), (valid, SShape), (valid, LineShape), (valid, TShape), (valid, SquareShape), (valid, MirroredShape)
5. Derive test values
* | Test                     | index | shape         | result                         |
    |-------|-------|--------------------------------|--------------------------------|
  | T1(valid, LShape)        | 0     | LShape        | -1                             |
  | T2(invalid, LShape)      | 4     | LShape        | ArrayIndexOutOfBoundsException |
  | T3(valid, NoShape)       | 0     | NoShape       | 0                              |
  | T4(valid, ZShape)        | 0     | ZShape        | -1                             |
  | T5(valid, SShape)        | 0     | SShape        | -1                             |
  | T6(valid, LineShape)     | 0     | LineShape     | -1                             |
  | T7(valid, TShape)        | 0     | TShape        | 0                              |
  | T8(valid, SquareShape)   | 0     | SquareShape   | 0                              |
  | T9(valid, MirroredShape) | 0     | MirroredShape | -1                             |

### Third Test Case
1. Identify testable functions
    * minX()

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: -
    * return type: int
    * return value: the minimum value of x inside a pieceShape

3. Model the input domain

|                         | b1        | b2      | b3|b4|b5|b6|b7|b8|
|-------------------------|-----------|---------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: coord of each shape | NoShape   | ZShape  | SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  | 
4. Combine partitions into tests
    * ISP Criteria: ACoC
    * Test requirements -- number of tests (upper bound) = 8
      (NoShape), (ZShape), (SShape), (LineShape), (TShape), (SquareShape), (MirroredShape)
5. Derive test values
* | Test              | shape         | result |
  |-------------------|---------------|--------|
  | T1(NoShape)       | NoShape       | 0      |
  | T2(ZShape)        | ZShape        | -1     |
  | T3(SShape)        | SShape        | 0      |
  | T4(LineShape)     | LineShape     | 0      |
  | T5(TShape)        | TShape        | -1     |
  | T6(SquareShape)   | SquareShape   | 0      |
  | T7(LShape)        | LShape        | -1     |
  | T8(MirroredShape) | MirroredShape | 0      |

### Forth Test Case
1. Identify testable functions
    * minY()

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: -
    * return type: int
    * return value: the minimum value of y inside a pieceShape

3. Model the input domain

|                         | b1        | b2      | b3|b4|b5|b6|b7|b8|
|-------------------------|-----------|---------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: coord of each shape | NoShape   | ZShape  | SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  | 
4. Combine partitions into tests
    * ISP Criteria: ACoC
    * Test requirements -- number of tests (upper bound) = 8
      (NoShape), (ZShape), (SShape), (LineShape), (TShape), (SquareShape), (MirroredShape)
5. Derive test values
* | Test              | shape         | result |
    |-------------------|--------|--------|
  | T1(NoShape)       | NoShape       | 0      |
  | T2(ZShape)        | ZShape        | -1     |
  | T3(SShape)        | SShape        | -1     |
  | T4(LineShape)     | LineShape     | -1     |
  | T5(TShape)        | TShape        | 0      |
  | T6(SquareShape)   | SquareShape   | 0      |
  | T7(LShape)        | LShape        | -1     |
  | T8(MirroredShape) | MirroredShape | -1     |
