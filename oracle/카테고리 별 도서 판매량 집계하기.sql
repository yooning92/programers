SELECT b.category, SUM(bs.sales) as 'total_sales'
FROM book b
JOIN book_sales bs
ON b.book_id = bs.book_id
WHERE 1=1
AND bs.sales_date LIKE '2022-01-%'
GROUP BY b.category
ORDER BY b.category
;