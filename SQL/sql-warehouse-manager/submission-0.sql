-- Write your query below
select name as warehouse_name, sum(units*width*height*length)as volume from
warehouse join products on warehouse.product_id=products.product_id 
group by name 