SELECT b.food_type, b.rest_id, b.rest_name, b.favorites
FROM (
    SELECT distinct(food_type), max(favorites) as favorites
    FROM rest_info
    GROUP BY food_type
    ) a
JOIN rest_info b
ON a.food_type = b.food_type 
AND a.favorites = b.favorites
ORDER BY food_type DESC
;