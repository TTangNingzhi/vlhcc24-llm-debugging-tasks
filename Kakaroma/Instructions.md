# Task1: Kakamora

**This is an algorithm task. Copilot has generated a solution yet it still has several bugs. Please read the "Background" below carefully and finish the task.**
(This task is inspired by Dr. Peter Bui’s Programming Challenges Challenge 12 homework)

## Background

Moana needs to take the heart of Te Fiti back to its original master. Given a grid representing the ocean, where each square contains the number of Kakamora present. You are to find a path from the northwest corner to the southeast corner while minimizing the number of Kakamora that encounters during her voyage.

Moana **only moves east, south, or southeast** from one square to another until she reaches the final location. Knowing what parts of the ocean to avoid due to the large amount of Kakamora will help her greatly, so not only report **the minimum number of Kakamora** she'd encounter but also **the actual path to take**.

### Input

You will be given a series of **NxN** grids where each square contains the population of the Kakamora. The first line will contain **the number of squares in each direction N**, followed by the NxN grid itself. You may assume N is no larger than 100. The end of input will be denoted by a 0 as the value of N.

### Example Input

```
5\
1 5 2 3 6\
4 3 2 1 2\
3 8 4 2 1\
0 5 2 3 4\
3 1 4 2 1\
0
```

### Output

For each grid, output the **minimum number** of Kakamora encountered on one line, followed by the path taken on the next (indicate paths by printing the sequence of squares visited as denoted by the Kakamora population).

When re-constructing path backward, **favor horizontal movements first, then vertical, and finally diagonal** as this will maximize the number of regions visited and give consistent path results.

### Example Output

```
12\
1 3 2 2 3 1
```

## Your Task

Open **Kakamora.java**, Github Copilot has written a solution for this problem. However, there are many bugs in it. Please find and fix those problems so that it can return the correct output with an example input.

**When you finished `readGrid(int n)`, `table(int[][] grid)` and `printPath(int[][] grid)`, please let the interviewer know.**
