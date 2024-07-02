# Write your MySQL query statement below
Select v.customer_id, Count(v.customer_id) count_no_trans
From Visits as v LEFT JOIN Transactions as t
ON v.visit_id = t.visit_id
where t.transaction_id IS null
GROUP BY v.customer_id;