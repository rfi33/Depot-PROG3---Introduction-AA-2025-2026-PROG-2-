SELECT employee.first_name,employee.last_name FROM employee 
LEFT JOIN team on employee.id_team = team.id WHERE(id_team is null);

SELECT employee.first_name,employee.last_name FROM leave RIGHT JOIN employee 
ON leave employee on leave.id_employee = employee.id WHERE (id_team is null);

SELECT leave.id,leave.start_date,leave.end_date,employee.first_name,employee.last_name,
team.name FROM leave INNER JOIN employee ON leave.id_employee = employee.id
LEFT JOIN team ON employee.id_team = team.id;

SELECT employee.contract_type, COUNT(employee.contract_type) AS employee_count FROM 
employee GROUP BY (employee.contract_type); 

SELECT COUNT(DISTINCT leave.id_employee) AS number_of_employees_on_leave FROM employee
INNER JOIN leave ON leave.id_employee = employee.id
WHERE (NOW()>=leave.start_date
AND NOW()<= leave.end_date);

SELECT employee.id ,employee.first_name , employee.last_name , team.name AS team_name FROM employee
INNER JOIN leave ON leave.id_employee = employee.id
INNER JOIN team ON  employee.id_team = team.id
WHERE (NOW()>=leave.start_date
  AND NOW()<= leave.end_date);
