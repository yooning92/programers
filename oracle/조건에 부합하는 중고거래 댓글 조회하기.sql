SELECT 
    ugb.title
    , ugb.board_id
    , ugr.reply_id
    , ugr.writer_id
    , ugr.contents
    , TO_CHAR(ugr.created_date, 'YYYY-MM-DD') as created_date
FROM used_goods_board ugb
JOIN used_goods_reply ugr
ON ugb.board_id = ugr.board_id
WHERE 1=1
AND TO_CHAR(ugb.created_date,'YYYY-MM') = '2022-10'
ORDER BY ugr.created_date, ugb.title
;