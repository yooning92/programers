SELECT animal_id, name, 
	CASE WHEN sex_upon_intake Like '%Neutered%' THEN 'O'
         WHEN sex_upon_intake Like '%Spayed%' THEN 'O'
    ELSE 'X'
    END
FROM animal_ins
ORDER BY 1
;