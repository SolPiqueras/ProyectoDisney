/*Llenar la tabla generos*/

INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/QJrcwUM.png", "Fantasía");
INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/KFt3ycw.png", "Animación");
INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/xtQDVD9.png", "Animación 3D");
INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/mXmwBfb.png", "Musical");
INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/Wlf5xbV.png", "Comedia");
INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/UFm3A49.png", "Ciencia Ficción");
INSERT INTO `disneydb`.`generos` (`imagen_genero`, `nombre_genero`) VALUES ("https://i.imgur.com/tcbdp0w.png", "Terror");


/*Llenar la tabla peliculas*/

INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 5, "1991-11-13", "https://i.imgur.com/NLyX1uJ.jpg", "La bella y la bestia", 2);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "1989-11-15", "https://i.imgur.com/kd1XtIn.jpg", "La sirenita", 2);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "2012-12-6", "https://i.imgur.com/KkFVo5k.jpg", "Ralph, el Demoledor", 3);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 5, "2012-7-12", "https://i.imgur.com/wFbBLjl.jpg", "Valiente", 3);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "2003-7-9", "https://i.imgur.com/os9IorW.jpg", "Piratas del Caribe: La maldición del Perla Negra", 1);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 3, "2006-7-7", "https://i.imgur.com/RjqQCxj.jpg", "Piratas del Caribe 2: El cofre de la Muerte", 1);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "2007-5-24", "https://i.imgur.com/AFR22HM.jpg", "Piratas del Caribe 3: En el fin del mundo", 1);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "2008-6-10", "https://i.imgur.com/p1HtRXQ.jpg", "WALL-E", 3);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 5, "1994-7-7", "https://i.imgur.com/CiJYwzh.jpg", "El rey león", 2);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 2, "2006-1-20", "https://i.imgur.com/VQhLHJF.jpg", "High School Musical", 4);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 2, "2007-8-17", "https://i.imgur.com/eYiVNWs.jpg", "High School Musical 2", 4);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 3, "2008-10-24", "https://i.imgur.com/902zC0e.jpg", "High School Musical 3: La Graduación", 4);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "2007-12-31", "https://i.imgur.com/tfS9YwG.jpg", "Encantada", 5);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 5, "2021-8-13", "https://i.imgur.com/ksee7uv.jpg", "Free Guy", 5);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "2008-2-14", "https://i.imgur.com/hADBhzp.jpg", "Entrenando a papá", 5);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "1977-5-25", "https://i.imgur.com/DWmSfQ5.jpg", "Star Wars: Episodio IV - Una nueva esperanza", 6);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 5, "1980-5-21", "https://i.imgur.com/jVPhNDa.jpg", "Star Wars: Episodio V - El imperio contraataca", 6);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 3, "1983-5-25", "https://i.imgur.com/AFTSuc1.jpg", "Star Wars: Episodio VI - El regreso del Jedi", 6);
INSERT INTO `disneydb`.`peliculas` (`calificacion`, `fecha`, `imagen_pelicula`, `titulo`, `id_genero`) VALUES ( 4, "1994-10-27", "https://i.imgur.com/59keuc8.jpg", "El extraño mundo de Jack", 7);


/*Llenar la tabla personajes*/

INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 16, "Es valiente, atrevida, aventurera e independiente. Tiene talento con el Arco y flecha también con la espada, y disfruta montando con su caballo Angus por los bosques.", "https://i.imgur.com/PyYffe3.jpg", "Mérida de DunBroch");
