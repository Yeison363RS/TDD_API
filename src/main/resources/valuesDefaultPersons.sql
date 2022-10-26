BEGIN;
DELETE FROM person CASCADE;
INSERT INTO person (id_person,
                         person_name, person_lastname,
                         person_county, person_department,
                         person_city)
VALUES
(1, 'juan', 'rodriguez', 'colombia', 'cundinamarca', 'Bogota'),
(2, 'fabio', 'mendez', 'colombia', 'Boyaca', 'Sogamoso'),
(3, 'maria', 'londoño', 'colombia', 'Amazonas', 'Leticia');
COMMIT;