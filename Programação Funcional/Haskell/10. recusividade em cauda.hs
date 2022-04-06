module Main where

fatCauda :: Int -> Int
fatCauda n = aux n 1
    where aux n res
            | n > 1 = aux (n -1) (res * n)
            | otherwise = res

fatorial :: IO()
fatorial = do
              putStr "- Calculando fatorial -\nInsira um número:\n"
              num <- getLine
              putStr(num ++ "! é igual a ")
              print(fatCauda (read num))

main :: IO()
main = do fatorial