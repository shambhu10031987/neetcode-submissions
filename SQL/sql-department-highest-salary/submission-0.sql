-- Write your query below
with ctx as(
select  department ,employee, max(salary)  over(partition by department) as max_salary ,salary from (
select d.name as department,e.name as employee,
e.salary as salary from employee e join department d on e.department_id=d.id
) 
)
select department,employee,salary from ctx
where salary=max_salary