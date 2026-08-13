-- Write your query below
with rankedScores as(
select student_id,exam_id,score, 
Row_NUMBER() over(partition by student_id order by score desc, exam_id asc) as rn from exam_results
)
select student_id,exam_id ,score from rankedScores where rn=1 order by student_id

--select * from rankedScores