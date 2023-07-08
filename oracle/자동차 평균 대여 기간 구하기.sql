SELECT *
FROM (
        SELECT car_id, round(avg(end_date - start_date)+1, 1) as average_duration
        FROM car_rental_company_rental_history
        GROUP BY car_id
     )
WHERE 1=1
AND average_duration >= 7
ORDER BY average_duration DESC, car_id DESC
;