module Main where

pertence :: Eq t => t -> [t] -> Bool
pertence a [] = False
pertence a (x:z) = if (a == x) then True
else pertence a z

uniao :: Eq t => [t] -> [t] -> [t]
uniao [] [] = []
uniao a [] = a
uniao [] a = a
uniao as bs = as ++ [b | b <- bs, not (pertence b as)]

main :: IO()
main = do
         putStr "- Unindo listas -\nInsira duas listas:\n"
         l1 <- getLine
         l2 <- getLine
         print(uniao (l1)(l2))