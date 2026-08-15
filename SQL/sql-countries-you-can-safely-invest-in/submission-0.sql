-- Write your query below



--country_avg>(select avg(duration) from calls)

WITH call_data AS (
    SELECT substring(p.phone_number,1,3) as country_code, ca.duration
    FROM calls ca
    JOIN person p ON ca.caller_id = p.id
    UNION ALL
    SELECT substring(p.phone_number,1,3) as country_code, ca.duration
    FROM calls ca
    JOIN person p ON ca.callee_id = p.id
)
select  c.name as country from call_data cd
join country c on 
cd.country_code=c.country_code
group by c.name
having avg(cd.duration)>(select avg(duration) from calls)