module Main where

interc :: Eq t => [t] -> [t] -> [t]
interc [] [] = []
interc [] a = a
interc a [] = a
interc (a:as) (b:bs) = a: b: interc (as)(bs)

main :: IO()
main = do
         putStr "- Intercalando listas -\nInsira duas listas:\n"
         l1 <- getLine
         l2 <- getLine
         print(interc (l1)(l2))