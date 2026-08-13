-- Write your query below
--select s.name from sales_person s left join orders o on o.sales_id=s.sales_id 
--                                      and o.com_id not in (select com_id from company where name='CRIMSON')
select name from sales_person where sales_id not in(
 select o.sales_id from orders o join company c on o.com_id=c.com_id and c.name='CRIMSON')