SELECT 
    A.PRODUCT_CODE,
    A.PRICE * B.AMOUNT AS SALES
FROM PRODUCT A
JOIN (SELECT PRODUCT_ID, SUM(SALES_AMOUNT) AS AMOUNT FROM OFFLINE_SALE GROUP BY PRODUCT_ID) B 
  ON A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY SALES DESC, A.PRODUCT_CODE ASC