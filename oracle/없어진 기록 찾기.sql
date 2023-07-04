SELECT ao.animal_id, ao.name
FROM animal_ins ai
RIGHT OUTER JOIN animal_outs ao
ON ai.animal_id = ao.animal_id
WHERE 1=1
AND ai.animal_id IS NULL
ORDER BY ao.animal_id
;