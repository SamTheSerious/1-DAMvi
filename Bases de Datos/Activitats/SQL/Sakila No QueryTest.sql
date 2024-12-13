-- 1) 1. Mostrar totes les dades dels pagaments (taula payment) dels dies 26 de maig del 2005 i 28 de maig de 2005 que hagi atès l'empleat amb codi 2 
-- (staff_id) ordenades de major a menor import (amount).

SELECT p.*
FROM payment p 
WHERE p.payment_date BETWEEN '2005-05-26' AND '2005-05-28' AND p.staff_id = 2
ORDER BY p.amount ASC

-- 2) Mostrar el nom i cognom de tots els actors amb el títol de les pel·lícules que ha fet cadascun.
-- Si hi ha actors que no han fet cap pel·lícula també s’han de mostrar.

SELECT a.first_name as NomActor , a.last_name as CognomActor, IFNULL(f.title, NULL) as Movie
FROM actor a LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id LEFT JOIN film f ON fa.film_id = f.film_id

-- 3) Mostrar el nom i cognom dels actors amb el títol de les pel·lícules que ha fet cadascun i amb el nom de la categoria de la pel·lícula 
-- i ordenades pel títol de la pel·lícula.

SELECT a.first_name as NomActor , a.last_name as CognomActor, IFNULL(f.title, NULL) as Movie, c.name as Category
FROM actor a JOIN film_actor fa ON a.actor_id = fa.actor_id JOIN film f ON fa.film_id = f.film_id JOIN film_category fc ON f.film_id = fc.film_id JOIN category c ON fc.category_id = c.category_id
ORDER BY f.title 

-- 4) Mostrar el nom dels països que comencen per C i els dels que comença per B amb el nom de les seves ciutats ordenats pel nom de les ciutats.
SELECT coun.country , cit.city 
FROM country coun JOIN city cit ON coun.country_id = cit.country_id
WHERE (coun.country LIKE 'C%' OR coun.country LIKE 'B%')
ORDER BY cit.city

-- 5) Mostrar, sense repeticions, els noms de les ciutats on tenim botigues.

SELECT DISTINCT c.city 
FROM store s JOIN address a ON s.address_id = a.address_id JOIN city c ON a.city_id = c.city_id

-- 6) Mostrar el títol i la durada (length) de les pel·lícules tals que el seu títol comenci per "B" i la seva durada (length, en minuts) 
-- sigui superior a 2 hores o bé que continguin dues "a" al títol i la seva durada sigui superior a 2 hores i quart ordenats de major a menor durada.

SELECT f.title , f.`length` 
FROM film f 
WHERE (f.title LIKE 'B%' AND f.`length` > 120 ) OR (f.title LIKE '%aa%' AND f.`length` > 135)
ORDER BY f.`length` DESC

-- 7) Mostrar el nom i cognoms dels actors tals que el seu id és no inferior a 10 
-- i no superior a 20 i el seu cognom conté una "W" ordenats alfabèticament per cognom i nom.

SELECT a.first_name , a.last_name 
FROM actor a 
WHERE a.actor_id >= 10 AND a.actor_id <= 20 AND a.last_name LIKE '%W%'
ORDER BY a.last_name , a.first_name 

-- 8) Mostrar, sense repeticions, els noms i cognoms dels clients als qual hem llogat alguna vegada la pel·lícula "ALI FOREVER" ordenats pel nom i cognom.

SELECT DISTINCT c.first_name , c.last_name 
FROM customer c JOIN rental r ON c.customer_id = r.customer_id JOIN inventory i ON r.inventory_id = i.inventory_id JOIN film f ON i.film_id = f.film_id
WHERE f.title LIKE 'ALI FOREVER' 
ORDER BY c.first_name , c.last_name 

-- 9) Mostrar el títol i la descripció de les pel·lícules que no s’hagin llogat mai. 

SELECT f.title , f.description , r.rental_date 
FROM film f LEFT JOIN inventory i ON f.film_id = i.film_id LEFT JOIN rental r ON r.inventory_id = i.inventory_id
WHERE r.rental_date IS NULL

