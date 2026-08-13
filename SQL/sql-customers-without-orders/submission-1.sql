-- Write your query below
--select name from customers join orders on order.customer_id!=customer.id

--select name from customers where id not in(select customer_id from orders);
--select name from customers left join orders on orders.customer_id=customers.id  where orders.id is null

select name from customers left join orders on orders.customer_id=customers.id  where orders.id is null