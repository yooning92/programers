SELECT count(*)
FROM user_info
WHERE 1=1
AND to_char(joined, 'yyyy') = '2021'
AND age between 20 and 29
;