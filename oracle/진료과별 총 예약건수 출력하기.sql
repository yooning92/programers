SELECT mcdp_cd AS "진료과 코드", count(*) AS "5월예약건수"
FROM appointment
WHERE 1=1
AND to_char(apnt_ymd, 'yyyy-mm-dd') BETWEEN '2022-05-01' AND '2022-05-31'
GROUP BY mcdp_cd
ORDER BY "5월예약건수", "진료과 코드"
;