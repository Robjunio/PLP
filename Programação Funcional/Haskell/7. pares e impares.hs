module Main where

par n = mod n 2 == 0
impar n = mod n 2 /= 0

parImpar :: [Int] -> [[Int]]
parImpar xs = [filter impar xs, filter par xs]

main = do putStr "- Pares e impares -\n"
          print([1,2,3,4,5,6,7])
          print(parImpar [1,2,3,4,5,6,7])