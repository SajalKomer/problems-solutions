--find duplicates

Select username, email, COUNT(*)
From users
Group By username, email
Having COUNT(*) > 1;
-----------

Select name, category
From product
Group By name, category
Having COUNT(id) > 1;
---------------

Select email, COUNT(email) count
From users
Group By email
Having COUNT(email) > 1;

=================================================
--get entire record for each dup row

Select a.*
From users a
Join ( Select username, email, COUNT(*)
From users
Group By username, email
Having COUNT(*) > 1) b
ON a.username = b.username
AND a.email = b.email
Order By a.email;
-----------

--get dup rows from same table where ids are not same because its same table
Select o1.order_id, o2.order_id
from orders o1
Inner Join orders o2
ON o1.customer_id = o2.customer_id
AND o1.order_date = o2.order_date
AND o1.order_id <> o2.order_id;
------------------------

--find dup using CTE
With CTE AS (
    Select col1, col2, col3, ROW_NUMBER()
    OVER(partition by col1, col2, col3 order by
    col1, col2, col3) AS RowNumber
    from table_name
    )
Select *
from CTE
where RowNumner > 1;
-----------------------------

-- https://www.sqlshack.com/different-ways-to-sql-delete-duplicate-rows-from-a-sql-table/
-- to get dup items
select *
from employee
where id not in
    (
    select max(id)
    from employee
    group by firstname, lastname, country
    )

-- to delete dup items
delete
from employee
where id not in
    (
    select max(id)
    from employee
    group by firstname, lastname, country
    )