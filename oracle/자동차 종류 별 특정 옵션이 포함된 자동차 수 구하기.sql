SELECT car_type, count(*) cars
FROM car_rental_company_car
WHERE 1=1
AND options LIKE '%통풍시트%'
OR options LIKE '%열선시트%'
OR options LIKE '%가죽시트%'
GROUP BY car_type
ORDER BY car_type
;