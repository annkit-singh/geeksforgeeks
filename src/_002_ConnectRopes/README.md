### [002] Connect N Ropes with Minimum Cost

We maintain a min-heap which contains all current ropes we have. Each time we pick the two most shortest ropes to connect
 and add this newly created rope back to queue.
 
 Why? Let's see an example. Say we have Rope1, Rope2, Rope3, and Rope4, and our strategy is each time we pick the first two ropes.
 
 Round 1:  connect `Rope 1` and `Rope 2`
 ```plain
            | Rope 1 | Rope 2 | Rope 3 | Rope 4 |
            |   1    |    1   |   0    |   0    |  (how many times we involve this rope in connection)
 ```
 
 Round 2:  connect `Rope1'` and `Rope2'`, with `Rope1'` is actual combination of `Rope1` and `Rope2` 
  ```plain
        | Rope1'  |  Rope2' | Rope3' |        | Rope 1 | Rope 2 | Rope 3 | Rope 4 |
        | R1 + R2 |    R3   |   R4   |        |   2    |    2   |   1    |   0    |
 ```
 
 Round 3:  connect `Rope1''` and `Rope2''`, with `Rope1''` is actual combination of `Rope1'` and `Rope2'` 
 ```plain
       |    Rope1''   |  Rope2'' |        | Rope 1 | Rope 2 | Rope 3 | Rope 4 |
       | R1 + R2 + R3 |     R4   |        |   3    |    3   |   2   |    1    |
```

So, after three rounds, we have one rope left. If we observe more closely, we can see, under this strategy, the times we involve one rope in connection is 

```plain
    | Rope1 | Rope2 | Rope3 | Rope4 | Rope5 | ....... | Rope N-1 | RopeN |
    | n - 1 | n - 1 | n - 2 | n - 3 | n - 4 | ....... |     2    |   1   |
```

