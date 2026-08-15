-- Write your query below

select employees.employee_id from employees where employee_id not in(
    select employee_id  from salaries
) 
union

select salaries.employee_id from salaries where employee_id not in(
    select employee_id  from employees
)  order by employee_id
