module Main where

sequencia :: Int -> Int -> [Int]
sequencia 0 _ = []
sequencia n m = m: sequencia (n - 1)(m + 1)

main :: IO()
main = do
              putStr "- Lista: sequência -\nInsira dois números:\n"
              n <- getLine
              m <- getLine
              print(sequencia (read n)(read m))