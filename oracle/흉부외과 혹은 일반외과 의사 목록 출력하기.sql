SELECT dr_name, dr_id, mcdp_cd, to_char(hire_ymd, 'yyyy-mm-dd')
FROM doctor
WHERE 1=1
AND mcdp_cd = 'CS'
OR mcdp_cd = 'GS'
ORDER BY hire_ymd DESC, dr_name
;