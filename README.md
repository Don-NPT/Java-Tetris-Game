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
   * rotateLeft()

2. Identify parameters, return types, return values, and exceptional behavior
   * parameter: pieceShape
   * return type: Shape
   * return value: a Shape object after rotate left

3. Model the input domain

|                           | b1      | b2     | b3|b4|b5|b6|b7|b8|
|---------------------------|---------|--------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: Is shape SquareShape? | True    | False  |

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

### Fifth Test Case
1. Identify testable functions
    * tryMove(Shape newPiece, int newX, int newY)

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: newPiece, newX, newY
    * return type: boolean
    * return value: the boolean value whether newPiece can move

3. Model the input domain

|                      | b1                      | b2                                | b3|b4|b5|b6|b7|b8|
|----------------------|-------------------------|-----------------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: validity of newX | 0 <= index < 10 (valid) | index < 0 or index > 10 (invalid) |  | || | |   |
| C2: validity of newY | 0 <= index < 22 (valid) | index < 0 or index > 21 (invalid) |  | || | |   |
| C3: Shape of newPiece | noShape                 | ZShape                            |  SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  |
| C4: x + newPiece.x   | < 10 and >= 0  (valid)  | > 9 or < 0 (valid)                |  | || | |
| C5: x + newPiece.x   | < 22 and >= 0  (valid)  | > 21 or < 0 (valid)               |  | || | |
4. Combine partitions into tests
    * ISP Criteria: ECC
    * Test requirements -- number of tests (upper bound) = 8
      (valid, valid, NoShape, valid), (invalid, invalid, ZShape, invalid), (valid, valid, SShape, valid), (valid, valid, LineShape, valid), (valid, valid, TShape, valid), (valid, valid, SquareShape, valid), (valid, valid, MirroredShape, invalid)
5. Derive test values
* | Test                                     | newX | newY | shape         | result |
  |------------------------------------------|------|------|--------|--------|
  | T1(valid, valid, NoShape, valid)         | 9    | 21   | NoShape       | true   |
  | T2(invalid, invalid, ZShape, invalid)    | 5    | 5    | ZShape        | false  |
  | T3(valid, valid, SShape, valid)          | 5    | 5    | SShape        | true   |
  | T4(valid, valid, LineShape, valid)       | 5    | 5    | LineShape     | true   |
  | T5(valid, valid, TShape, valid)          | 5    | 5    | TShape        | true   |
  | T6(valid, valid, SquareShape, valid)     | 5    | 5    | SquareShape   | true   |
  | T7(valid, valid, LShape, valid)          | 5    | 5    | LShape        | true   |
  | T8(valid, valid, MirroredShape, invalid) | 9    | 21   | MirroredShape | false  |

### Sixth Test Case
1. Identify testable functions
    * shapeAt(int x, int y)

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: x, y
    * return type: Tetrominoe
    * return value: Tetrominoe object in that position

3. Model the input domain

|                                     | b1                        | b2                                    | 
|-------------------------------------|---------------------------|---------------------------------------|
| C1: (y * BOARD_WIDTH) + x           | -1 < result < 220 (valid) | result >= 220 or result < 0 (invalid) |
| C2: Is it NoShape in that position? | True                      | False                                 |  

4. Combine partitions into tests
    * ISP Criteria: PWC
    * Test requirements -- number of tests (upper bound) = 4
      (valid, True), (valid, False), (invalid, False), (invalid, True)
5. Derive test valuess
* | Test               | x   | y | result  |
  |-----|--|---------|---------|
  | T1(valid, True)   | 0   | 0 | NoShape |
  | T2(valid, False) | 20   | 20 | not NoShape   |
  | T3(invalid, False) | 20   | 22 | Error   |
  | T4(invalid, True) | 20   | 22 | Error    |

### Seventh Test Case
1. Identify testable functions
    * pause()

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: -
    * return type: void
    * return value: -

3. Model the input domain

|                      | b1   | b2    |
|----------------------|------|-------|
| C1: shape is moving  | true | false |  
| C2: show pause label | true | false | 
| C3: isPaused         | true | false |

4. Combine partitions into tests
    * ISP Criteria: Pair wise
    * Test requirements -- number of tests (upper bound) = 4
      (true, true, true), (true, false, false), (false, true, true), (false, false, false)
   
5. Derive test values
* | Test                    | shape is move                   | show pause label                 | isPaused | result              |
    |--------------------------|----------------------------------|----------|---------------------|---------------------------------|
  | T1(true, true, true)    | true                            | true                             | true     | Invalid             |
  | T2(true, false, false)  | true                            | false                            | false    | String.valueOf(numLinesRemoved) |
   | T3(false, true, true)   | false                           | true                             | true     | show "paused" label |
  | T4(false, false, false) | false                           | false                            | false    | Invalid  |

### Eighth Test Case
1. Identify testable functions
    * getShape()

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: -
    * return type: Tetrominoe
    * return value: one type of Tetrominoe that's called pieceShape.

3. Model the input domain

|                       | b1                      | b2                                | b3|b4|b5|b6|b7|b8|
|-----------------------|-------------------------|-----------------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: Shape of newPiece | noShape                 | ZShape                            |  SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  |
4. Combine partitions into tests
    * ISP Criteria: ECC
    * Test requirements -- number of tests (upper bound) = 8
      (NoShape), (ZShape, (SShape), (LineShape), (TShape), (SquareShape), (MirroredShape)
5. Derive test values
* | Test              | shape         | result |
    |-------------------|---------------|----------|
  | T1(NoShape)       | NoShape       | NoShape   |
  | T2(ZShape)        | ZShape        | ZShape  |
  | T3(SShape)        | SShape        | SShape   |
  | T4(LineShape)     | LineShape     | LineShape   |
  | T5(TShape)        | TShape        | TShape   |
  | T6(SquareShape)   | SquareShape   | SquareShape   |
  | T7(LShape)        | LShape        | LShape   |
  | T8(MirroredShape) | MirroredShape | MirroredShape |

### Ninth Test Case
1. Identify testable functions
    * rotateLeft()

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: pieceShape
    * return type: Shape
    * return value: Shape object after rotate

3. Model the input domain

|                         | b1        | b2      | b3|b4|b5|b6|b7|b8|
|-------------------------|-----------|---------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: coord of each shape | NoShape   | ZShape  | SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  | 
4. Combine partitions into tests
    * ISP Criteria: MBCC
    * Test requirements -- number of tests (upper bound) = 8
      (NoShape), (ZShape), (SShape), (LineShape), (TShape), (SquareShape), (MirroredShape)
5. Derive test values
* | Test              | shape         | result (check by coords)             |
  |-------------------|---------------|--------------------------------------|
  | T1(NoShape)       | NoShape       | {0, 0},{ 0, 0 },{ 0, 0 }, { 0, 0 }   |
  | T2(ZShape)        | ZShape        | {-1, 0 },{0, 0 }, {0, 1 },{1, 1 }    |
  | T3(SShape)        | SShape        | {-1, 0 },{0, 0 }, {0, -1 },{1, -1 }  |
  | T4(LineShape)     | LineShape     | {-1, 0 },{0, 0 },{1, 0 },{2, 0 }     |
  | T5(TShape)        | TShape        | { 0, 1 },{ 0, 0 },{ 0, -1 },{ 1, 0 } |
  | T6(SquareShape)   | SquareShape   | { 0, 0 },{ 1, 0 },{ 0, 1 },{ 1, 1 }  |
  | T7(LShape)        | LShape        | { -1,1 },{ -1,0 },{ 0, 0 },{ 1,0 }   |
  | T8(MirroredShape) | MirroredShape | { -1, -1 },{ -1, 0 },{ 0, 0 },{1,0 } |


### Tenth Test Case
1. Identify testable functions
    * rotateRight()

2. Identify parameters, return types, return values, and exceptional behavior
    * parameter: pieceShape
    * return type: Shape
    * return value: Shape object after rotate

3. Model the input domain

|                         | b1        | b2      | b3|b4|b5|b6|b7|b8|
|-------------------------|-----------|---------|------------------------|------------------------|------------------------|------------------------|------------------------|------------------------|
| C1: coord of each shape | NoShape   | ZShape  | SShape |LineShape |TShape| SquareShape| LShape| MirroredLShape  | 
4. Combine partitions into tests
    * ISP Criteria: MBCC
    * Test requirements -- number of tests (upper bound) = 8
      (NoShape), (ZShape), (SShape), (LineShape), (TShape), (SquareShape), (MirroredShape)
5. Derive test values
* | Test              | shape         | result (check by coords)             |
  |-------------------|---------------|--------------------------------------|
  | T1(NoShape)       | NoShape       | {0, 0},{ 0, 0 },{ 0, 0 }, { 0, 0 }   |
  | T2(ZShape)        | ZShape        | {1, 0 },{ 0, 0 },{ 0,-1 },{ -1, -1 } |
  | T3(SShape)        | SShape        | { 1, 0 },{ 0, 0 },{ 0, 1 },{ -1, 1 } |
  | T4(LineShape)     | LineShape     | { 1, 0 },{ 0, 0 },{ -1, 0 },{-2, 0 } |
  | T5(TShape)        | TShape        | { 0, -1 },{ 0, 0 },{ 0, 1 },{-1, 0 } |
  | T6(SquareShape)   | SquareShape   | { 0, 0 },{ 1, 0 },{ 0, 1 },{ 1, 1 }  |
  | T7(LShape)        | LShape        | { 1, -1 },{ 1, 0 },{ 0, 0 },{-1, 0 } |
  | T8(MirroredShape) | MirroredShape | { 1, 1 },{ 1, 0 },{ 0, 0 },{-1, 0 }  |

