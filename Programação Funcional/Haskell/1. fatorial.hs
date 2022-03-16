module Main where

fat :: Int -> Int
fat 0 = 1
fat n = n * fat(n - 1)

fatorial :: IO()
fatorial = do
              putStr "- Calculando fatorial -\nInsira um número:\n"
              num <- getLine
              putStr(num ++ "! é igual a ")
              print(fat (read num))

main :: IO()
main = do fatorial