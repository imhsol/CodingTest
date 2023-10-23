select name
from (select 
      row_number() over (order by datetime) as rank,
      name
      from animal_ins) a
where a.rank = 1