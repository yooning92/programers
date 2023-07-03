SELECT member_id, member_name, gender, TO_CHAR(date_of_birth, 'YYYY-MM-DD') as date_of_birth
FROM member_profile
WHERE 1=1
AND TO_CHAR(date_of_birth, 'MM') = '03'
AND gender = 'W'
AND tlno IS NOT NULL
ORDER BY member_id
;