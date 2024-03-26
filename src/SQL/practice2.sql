--fetch employee who belong to department 'admin'
select id, name
from employee e, dept d
where e.deptid = d.deptid
and upper(d.dname)='ADMIN';

-----------
select id, name
from employee
where deptid = (select deptid
                from dept
                 where upper(deptid)='ADMIN');
-------------------------
--fetch employees who earn the highest salary in their dept
select id, name
from employee e1
where salary = (select max(salary)
                from employee e2
                where e1.deptid = e2.deptid
                group by e2.deptid);

--update all employees gender from male to female and female to male
update employee
set gender = decode(upper(gender),'MALE','FEMALE','FEMALE','MALE');

---------
update employee
set gender = case when upper(gender)='MALE' then 'FEMALE' when
upper(gender)='FEMALE' then 'MALE' end;
==================

--select employees with 3rd highest salary in their dept
select id, name, salary, dname
from (
select id, name, salary, dname, dense_rank()
over(partition by deptid order by salary desc) rank
from employee e, dept d
where e.deptid=d.deptid
)
where rank=3;
=====================================
--Display one of the phone numbers from the employee
--table. Display Ph_no1. If Ph_no1 is null, display
--ph_no2. If ph_no2 is null, display

select coalesce(phone_num1, phone_num2, phone_num3)
from employee
