Select s.student_id, s.student_name, sb.subject_name, Count(e.student_id) attended_exams
From Students s
cross join Subjects sb
left join Examinations e
on s.student_id = e.student_id and e.subject_name = sb.subject_name
group by s.student_id, s.student_name,sb.subject_name
order by s.student_id, sb.subject_name;