select s.student_id, s.student_name,sb.subject_name,count(e.subject_name) as attended_exams
from Students s
cross join Subjects sb
left join Examinations e

on s.student_id = e.student_id AND sb.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, sb.subject_name
ORDER BY s.student_id, sb.subject_name;

