SELECT c.consultants_id AS ConID,
c.consultants_name AS Consultant,
cr.courses_name AS Course,
t.trainers_name AS Trainer,
cl.clients_name AS Client 
FROM consultants c
INNER JOIN consultants_has_courses chc ON c.consultants_id = chc.Consultants_consultants_id
INNER JOIN courses cr ON chc.Courses_courses_id = cr.courses_id
INNER JOIN courses_has_trainers cht ON cr.courses_id = cht.Courses_courses_id
INNER JOIN trainers t ON t.trainers_id = cht.Trainers_trainers_id
INNER JOIN clients_has_consultants chcl ON c.consultants_id = chcl.Consultants_consultants_id
INNER JOIN clients cl ON cl.clients_id = chcl.Clients_clients_id
ORDER BY c.consultants_id;