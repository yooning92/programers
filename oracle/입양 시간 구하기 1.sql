SELECT to_number(to_char(datetime, 'HH24')) HOUR, count(*) COUNT
FROM animal_outs
WHERE 1=1
AND to_char(datetime, 'HH24') BETWEEN 9 AND 20
GROUP BY to_char(datetime, 'HH24')
ORDER BY to_char(datetime, 'HH24')

;