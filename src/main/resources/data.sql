INSERT INTO restriction(type, description) VALUES
  ('G – General Audiences', 'All ages admitted. Nothing that would offend parents for viewing by children.'),
  ('NC-17 – Adults Only', 'No One 17 and Under Admitted. Clearly adult. Children are not admitted.');

INSERT INTO genre(genre_name) VALUES
  ('Horror'),
  ('Comdey'),
  ('Drama'),
  ('Fantasy');

INSERT INTO film(title, short_description, long_description, duration, rating, restriction_id) VALUES
  ('Apokawixa', 'Lorem ipsum dolor sit amet',
   'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
  120,
  9.50,
  2),
  ('Co w duszy gra', 'Lorem ipsum dolor sit amet',
   'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
  90,
  8.00,
  1);
INSERT INTO film_genres VALUES
(1,1),
(1,2),
(2,2),
(2,3);


