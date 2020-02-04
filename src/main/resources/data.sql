-- INSERT USERS DUMMY
INSERT INTO USER(id_user, name, email, password, created, modified, last_login, token, active)
VALUES('2a95a3ed-50e5-4573-9e0d-68ec489e1b44', 'Jaime', 'moreno.jlopez@gmail.com', 'password1', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'token1', 1),
      ('70c04f63-06f0-435d-890b-e3d302e29315', 'Jay', 'moreno@gmail.com', 'password2', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'token2', 1),
      ('999c0dbb-abeb-413f-a726-e879f99042e4', 'Tomas', 'jlopez@gmail.com', 'password3', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'token3', 1);

-- INSERT PHONE DUMMY
 INSERT INTO PHONE(number, city_code, country_code)
 VALUES('981805075', '09', '56'),
      ('981805074', '09', '56'),
      ('981805073', '09', '56'),
      ('981805072', '09', '56'),
      ('981805071', '09', '56');

-- INSERT USER_PHONE DUMMY
 INSERT INTO USER_PHONE(id_user, id_phone)
 VALUES('2a95a3ed-50e5-4573-9e0d-68ec489e1b44', 2),
       ('2a95a3ed-50e5-4573-9e0d-68ec489e1b44', 3);


-- SELECT U.*
-- FROM USER U
-- WHERE EMAIL = 'moreno.jlopez@gmail.com'

-- SELECT BY ID
-- SELECT id, title, comments, likes, unlikes FROM TBL_POST WHERE ID = 2;; Select by ID

-- INSERT NEW POST
-- INSERT INTO TBL_POST (title, comments, likes, unlikes) VALUES ('Atlanta', 'I really thinking dont, not real homeless', 0, 0); INSERT

-- SELECT ALL POSTS
-- SELECT id, title, comments, likes, unlikes FROM TBL_POST;

-- UPDATE POST
-- UPDATE TBL_POST
--   SET title = 'Atlanta',
--         comments = 'Look, I got a question, your mind racing',
--WHERE id=4;

-- UPDATE POST LIKE
-- UPDATE TBL_POST
--   SET likes = 3
--WHERE id=3;

-- UPDATE POST UNLIKE
-- UPDATE TBL_POST
--   SET unlikes = 2
--WHERE id=3;

-- DELETE POST
-- DELETE FROM TBL_POST WHERE ID = 4;