module Main where

fib :: Int -> Int
fib 1 = 0
fib 2 = 1
fib n = fib(n - 1) + fib(n - 2)

fibonacci :: IO()
fibonacci = do
              putStr "- Calculando Fibonacci -\nInsira um número:\n"
              num <- getLine
              putStr("O " ++ num ++ "o número de Fibonacci é ")
              print(fib (read num))

main :: IO()
main = do fibonacci