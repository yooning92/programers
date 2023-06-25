SELECT substr(product_code, 1, 2) CATEGORY, count(*) PRODUCTS
FROM product
GROUP BY substr(product_code, 1, 2)
ORDER BY substr(product_code, 1, 2)
;