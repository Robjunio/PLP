module Main where

pertence :: Eq t => t -> [t] -> Bool
pertence a [] = False
pertence a (x:z) = if (a == x) then True
else pertence a z

interseccao :: Eq t => [t] -> [t] -> [t]
interseccao [] [] = []
interseccao a [] = []
interseccao [] a = []
interseccao as bs = [a | a <- as, (pertence a bs)]

main :: IO()
main = do
         putStr "- intersecção de listas -\nInsira duas listas:\n"
         l1 <- getLine
         l2 <- getLine
         print(interseccao (l1)(l2))