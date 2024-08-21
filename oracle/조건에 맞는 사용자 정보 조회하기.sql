SELECT 
    USER_ID
    , NICKNAME
    , (CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2) AS 전체주소
    , (SUBSTR(TLNO, 0 , 3)) || '-' || (SUBSTR(TLNO, 4, 4)) || '-' || (SUBSTR(TLNO, 8, 4)) AS 전화번호
FROM USED_GOODS_USER
WHERE USER_ID IN (SELECT UGU.USER_ID
              FROM USED_GOODS_BOARD UGB, USED_GOODS_USER UGU
              WHERE UGB.WRITER_ID = UGU.USER_ID
              GROUP BY UGU.USER_ID
              HAVING (COUNT(*) >= 3))
ORDER BY USER_ID DESC
;