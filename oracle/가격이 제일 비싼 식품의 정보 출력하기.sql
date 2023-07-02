SELECT *
FROM food_product
WHERE 1=1
AND price = (
    			SELECT MAX(price)
   				FROM food_product
            )
;