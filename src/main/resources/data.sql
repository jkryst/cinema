INSERT INTO genre(genre_name) VALUES
  ('Horror'),
  ('Coemdy'),
  ('Drama'),
  ('Fantasy');

INSERT INTO movie(title, short_description, long_description, duration_in_minutes, rating, restriction) VALUES
  ('Apokawixa', 'Lorem ipsum dolor sit amet',
   'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
  120,
  9.50,
  'G'),
  ('Co w duszy gra', 'Lorem ipsum dolor sit amet',
   'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
  90,
  8.00,
  'R'),
('Avatar Istota Wody', 'Lorem ipsum dolor sit amet',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
    180,
    8.00,
    'R'),
('Babilon', 'Lorem ipsum dolor sit amet',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
    135,
    7.70,
    'G'),
('Gra Fortuny', 'Lorem ipsum dolor sit amet',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
    98,
    8.00,
    'R'),
('Kot w butach', 'Lorem ipsum dolor sit amet',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
    105,
    8.00,
    'PG'),
('M3gan', 'Lorem ipsum dolor sit amet',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
    120,
    9.00,
    'R'),
('Mężczyzna imieniem Otto', 'Lorem ipsum dolor sit amet',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua',
    120,
    9.00,
    'R');


INSERT INTO movie_genres(movie_id, genre_id) VALUES
(1,1),
(2,2),
(2,3),
(3,3),
(4,1),
(5,4),
(5,1),
(6,1),
(7,2),
(8,3),
(8,4);


INSERT INTO screen(seats_in_row, rows) VALUES
(4,4),
(5,4);

INSERT INTO seat_type(type) VALUES
('regular'),
('sofa');

INSERT INTO seat(num_in_row, row_num, seat_type_id, screen_id) VALUES
(1, 1, 1, 1),
(2, 1, 1, 1),
(3, 1, 1, 1),
(4, 1, 1, 1),
(1, 2, 1, 1),
(2, 2, 1, 1),
(3, 2, 1, 1),
(4, 2, 1, 1),
(1, 3, 2, 1),
(2, 3, 2, 1),
(3, 3, 2, 1),
(4, 3, 2, 1),
(1, 4, 1, 1),
(2, 4, 1, 1),
(3, 4, 1, 1),
(4, 4, 1, 1),

(1, 1, 1, 2),
(2, 1, 1, 2),
(3, 1, 1, 2),
(4, 1, 1, 2),
(5, 1, 1, 2),
(1, 2, 1, 2),
(2, 2, 1, 2),
(3, 2, 1, 2),
(4, 2, 1, 2),
(5, 2, 1, 2),
(1, 3, 2, 2),
(2, 3, 2, 2),
(3, 3, 1, 2),
(4, 3, 2, 2),
(5, 3, 2, 2),
(1, 4, 2, 2),
(2, 4, 2, 2),
(3, 4, 1, 2),
(4, 4, 2, 2),
(5, 4, 2, 2);

INSERT INTO pricelist(pricelist_name) VALUES
('alldays');

INSERT INTO pricelist_item(price_item_name) VALUES
('adult'),
('student');

INSERT INTO price(pricelist_id, pricelist_item_id, seat_type_id, price) VALUES
(1, 1, 1, 30.0),
(1, 1, 2, 35.0),
(1, 2, 1, 20.0),
(1, 2, 2, 25.0);

INSERT INTO show(movie_id, screen_id, pricelist_id, date, time) VALUES
(1, 1, 1, '2023-01-28', '12:00:00'),
(4, 1, 1, '2023-01-28', '16:00:00'),
(2, 1, 1, '2023-01-28', '18:30:00'),

(1, 2, 1, '2023-02-03', '12:00:00'),
(1, 2, 1, '2023-02-03', '18:00:00'),
(1, 2, 1, '2023-02-03', '22:00:00'),

(2, 2, 1, '2023-02-03', '11:00:00'),
(2, 1, 1, '2023-02-03', '19:00:00'),

(7, 1, 1, '2023-02-03', '17:30:00'),


(1, 2, 1, '2023-02-04', '12:00:00'),
(1, 2, 1, '2023-02-04', '18:00:00'),
(1, 2, 1, '2023-02-04', '22:00:00'),

(2, 2, 1, '2023-02-04', '11:00:00'),
(2, 1, 1, '2023-02-04', '19:00:00'),

(7, 1, 1, '2023-02-04', '17:30:00'),


(5, 2, 1, '2023-02-10', '15:00:00'),
(6, 1, 1, '2023-02-10', '18:00:00');

