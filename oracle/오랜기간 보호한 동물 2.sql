SELECT ai.animal_id, ai.name
FROM animal_ins ai
JOIN animal_outs ao
ON ai.animal_id = ao.animal_id
WHERE 1=1
ORDER BY ao.datetime - ai.datetime DESC
FETCH FIRST 2 ROWS ONLY
;