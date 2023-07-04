SELECT p.product_code, SUM(p.price * os.sales_amount) as sales
FROM product p
JOIN offline_sale os
ON p.product_id = os.product_id
GROUP BY p.product_code
ORDER BY sales DESC, p.product_code
;