-- Examen SQL de DAMvi-B 28/11/2024
-- Alumno: Samuel Rumbo Álvarez
-- Version de Examen: V3

use traders;

-- Pregunta 1

SELECT s.*
FROM Ships s
ORDER BY s.Capacity

-- Pregunta 2

SELECT t.Id 
FROM Trades t
WHERE YEAR(t.`DateTime`) >= 2300

-- Pregunta 3

SELECT t.Id, SUM(t2.Total) 
FROM Traders t JOIN Stays s ON t.Id = s.TraderId JOIN Trades t2 ON t2.StayId = s.Id
WHERE YEAR(t2.`DateTime`) > 2375
GROUP BY t.Id

-- Pregunta 4

SELECT DISTINCT p.Name
FROM Products p JOIN PriceChanges pc ON p.Id = pc.ProductId
WHERE pc.NewPrice > 1000000
ORDER BY p.Name

-- Pregunta 5

SELECT trd.Id , trd.Nickname  , p.Name , COUNT(p.Id) as TotalComerciat
FROM Products p JOIN TradeLines tl ON p.Id = tl.ProductId JOIN Trades t ON tl.TradeId = t.Id JOIN Stays s ON t.StayId = s.Id JOIN Traders trd ON s.TraderId = trd.Id
GROUP BY trd.Id , trd.Nickname , p.Name 
HAVING TotalComerciat > 2
ORDER BY trd.Nickname, TotalComerciat

-- Pregunta 6

SELECT t.Nickname , s.StartDate , s.EndDate 
FROM Traders t JOIN Stays s ON t.Id = s.TraderId JOIN Planets p ON s.PlanetId = p.Id
WHERE p.Name LIKE 'Boythea'
ORDER BY s.EndDate

-- Pregunta 7

SELECT t.Id , COUNT(p.SystemId) as Moviments
FROM Traders t JOIN Stays s ON t.Id = s.TraderId JOIN Planets p ON s.PlanetId
GROUP BY t.Id
ORDER BY Moviments DESC
LIMIT 1

-- Pregunta 8

SELECT t.Id 
FROM Trades t JOIN Stays s ON t.StayId = s.Id JOIN Planets p ON s.PlanetId = p.Id JOIN SolarSystems ss ON p.SystemId = ss.Id
WHERE  t.Total < 10000000 AND (ss.Name LIKE 'Reuth' OR p.`Position`= 2)
ORDER BY p.`Position` 

-- Pregunta 9

SELECT ss.Name , SUM(ssd.Distance) as DistanciaTotal
FROM SolarSystems ss JOIN SolarSystemsDistances ssd ON ss.Id = ssd.SystemId1 JOIN SolarSystems ss2 ON ss.Id != ss2.Id 
GROUP BY ss.Name
HAVING DistanciaTotal > 30
ORDER BY DistanciaTotal

-- Pregunta 10

SELECT t.Firstname , t.Lastname
FROM Traders t
WHERE t.Nickname LIKE '%g%'