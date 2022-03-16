module Main where

conjPart :: [t] -> [[t]]
conjPart [] = [[]]
conjPart (x:xs) = map (x:) (conjPart xs) ++ conjPart xs

main :: IO()
main = do putStr "- Conjunto das partes -\nInsira uma lista:\n"
          lista <- getLine
          print(conjPart (lista))