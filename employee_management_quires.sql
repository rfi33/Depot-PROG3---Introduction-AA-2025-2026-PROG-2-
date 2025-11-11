select employee.first_name,employee.last_name from employee 
left join in employee.id_team = team.id where(id_team is null);


select employee.first_name,employee.last_name from leave right join employee 
on leave employee on leave.id_employee = employee.id where(id_team is null);


select leave.id,leave.start_date,leave.end_date,employee.first_name,employee.last_name,
team.name from leave inner join employee on leave.id_employee = employee.id
left join team on employee.id_team = team.id;


select employee.contract_type, count(employee.contract_type) as employee_count from 
employee group by (employee.contract_type); 