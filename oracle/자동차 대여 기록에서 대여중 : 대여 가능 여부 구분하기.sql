SELECT a.car_id, max(a.availabilty)
FROM (
    SELECT car_id, 
    CASE WHEN (TO_CHAR(start_date, 'YYYY-MM-DD') <= '2022-10-16') 
    AND (TO_CHAR(end_date, 'YYYY-MM-DD') >= '2022-10-16') 
    THEN '대여중' 
    ELSE '대여 가능'
    END as availabilty
    FROM car_rental_company_rental_history
    ) a
GROUP BY car_id
ORDER BY car_id DESC
;