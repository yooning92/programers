SELECT user_id, nickname, total_price
FROM (
    SELECT writer_id, sum(price) as total_price
    FROM used_goods_board
    WHERE 1=1
    AND status = 'DONE'
    GROUP BY writer_id
) ugb
JOIN used_goods_user ugu
ON ugb.writer_id = ugu.user_id
WHERE 1=1
AND total_price >= 700000
ORDER BY total_price
;