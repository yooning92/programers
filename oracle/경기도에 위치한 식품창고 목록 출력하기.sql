SELECT warehouse_id, warehouse_name, address, nvl(freezer_yn, 'N') freezer_yn
FROM food_warehouse
WHERE 1=1
AND address LIKE '경기도%'
ORDER BY warehouse_id
;