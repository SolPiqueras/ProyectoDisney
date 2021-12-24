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

INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 16, "Es valiente, atrevida, aventurera e independiente. Tiene talento con el arco y también con la espada, y disfruta montando con su caballo Angus por los bosques.", "https://i.imgur.com/PyYffe3.jpg", "Mérida de DunBroch");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 35, "Joe Kingman, es un jugador de fútbol americano profesional, que vive una vida de lujo, y se desempeña como mariscal de campo de su equipo: los Rebeldes de Boston.", "https://i.imgur.com/VCUVSgd.jpg", "Joe Kingman");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 5, "Simba es un juguetón e independiente cachorro de león a quien le gusta correr y explorar.", "https://i.imgur.com/MCrZIjJ.jpg", "Simba");
INSERT INTO `disneydb`.`personajes` (`historia`, `imagen_personaje`, `nombre_personaje`) VALUES ("Jack es un vivaz y carismático caballero, le gusta cantar entradas espectaculares y algunas veces expresa una situación o sentimientos. Siempre está buscando hacer nuevos amigos, pero generalmente asume que los otros quieren ser sus amigos también.", "https://i.imgur.com/ghKQwFV.jpg", "Jack Skellington");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 17, "Es una chica inteligente a la que le encanta leer libros y la literatura. Debido a esto, Bella es una chica muy educada con un buen vocabulario y una buena imaginación", "https://i.imgur.com/MCrZIjJ.jpg", "Princesa Bella");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 21, "Maldecido por una hechicera porque no tiene amor en su corazón, el príncipe se transforma en una terrible bestia. El terrible hechizo sólo puede romperse cuando se aprende a amar de verdad y puede ganar el amor de otro.", "https://i.imgur.com/jUsTQUG.jpg", "Bestia");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 16, "Ella se muestra aventurera, apasionada y tiene curiosidad por el mundo de los seres humanos, una fascinación que enoja a su padre, ya que Tritón tienen prohibido hacer contacto con el mundo de los humanos.", "https://i.imgur.com/qJiy6eu.png", "Princesa Ariel");
INSERT INTO `disneydb`.`personajes` (`historia`, `imagen_personaje`, `nombre_personaje`) VALUES ("Es una típica doncella de cuento de hadas, vive en una pequeña cabaña del bosque junto a su mejor amigo, una ardilla llamada Pip, y otros animales del bosque.", "https://i.imgur.com/rX5a2fI.jpg", "Princesa Giselle");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 30, "Está cansado de ser el Tipo Malo oficial y le gustaría que reconocieran su trabajo. Así que se embarca en una aventura salvaje por el increíble universo de los juegos de arcade.", "https://i.imgur.com/L4fb9Fg.png", "Ralph");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 12, "Vanellope es un error de programación en Sugar Rush, tiene enraizado en su código el espíritu de un piloto de carreras, así que está decidida a estar en la parrilla de salida con el resto de los pilotos.", "https://i.imgur.com/VF4N0mA.png", "Vanellope von Schweet");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 61, "Un capitán de moralidad y sobriedad dudosas, maestro de la auto-promoción e interés propio. El primer amor de Jack fue el mar,el segundo su amado barco el Perla Negra", "https://i.imgur.com/au48A0G.jpg", "Capitán Jack Sparrow");
INSERT INTO `disneydb`.`personajes` (`historia`, `imagen_personaje`, `nombre_personaje`) VALUES ("El último robot superviviente de una fuerza de limpieza de la tierra. Conoce a EVA cuando está buscando vida en el planeta y, cuando llega una nave para recogerla, la sigue hacia el espacio.", "https://i.imgur.com/YYw12JR.png", "WALL-E");
INSERT INTO `disneydb`.`personajes` (`historia`, `imagen_personaje`, `nombre_personaje`) VALUES ("Es una sonda blanca, enviada para buscar una señal de vida fotosintética (en este caso una planta). WALL·E se enamora de ella y la sigue en su vieja por el espacio.", "https://i.imgur.com/gd55hdl.jpg", "EVA");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 16, "Es un chico deportista, carismático y alegre, el más popular en el instituto y capitán del equipo de baloncesto. En secreto, tiene una pasión: cantar.", "https://i.imgur.com/S2qGGD9.jpg", "Troy Bolton");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 16, "Inteligente, amable, bondadosa y sincera. Troy y Gabriella deciden unir fuerzas y participar en la obra de comedia musical de su instituto, enfrentándose al orden social establecido.", "https://i.imgur.com/zJKA50o.jpg", "Gabriella Montez");
INSERT INTO `disneydb`.`personajes` (`historia`, `imagen_personaje`, `nombre_personaje`) VALUES ("Es un personaje no jugador (NPC), trabaja como cajero de un banco y pasa el tiempo con su mejor amigo Buddy, sin saber que su mundo es un videojuego, hasta que conoce a una jugadora, Molotov Girl", "https://i.imgur.com/JVDS4ya.png", "Guy");
INSERT INTO `disneydb`.`personajes` (`historia`, `imagen_personaje`, `nombre_personaje`) VALUES ("Es el personaje de una jugadora en el videojuego Free City. En la vida real, es una programadora que busca el código fuente de su juego, el cual fue robado y usado para crear Free City", "https://i.imgur.com/IJNmyQo.jpg", "Molotov Girl");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 19, "Un joven granjero sensible a la Fuerza. Se une a la rebelión contra el Imperio Galáctico cuando muere su familia y debe abandonar su hogar", "https://i.imgur.com/cjNkxku.jpg", "Luke Skywalker");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 29, "Contrabandista de renombre y dueño de la nave 'Halcón Milenario'. Acepta transportar a Luke y Obi-wan por dinero y eso le arrastra a una lucha contra el Imperio", "https://i.imgur.com/AhzLLkG.jpg", "Han Solo");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 19, "Princesa de Alderaan y miembro del senado imperial. Trabaja con los rebeldes para lograr la caída del Imperio, consiguiendo los planos de la Estrella de la Muerte y ocultándolos en su robot R2D2.", "https://i.imgur.com/QdQgZ7F.jpg", "Princesa Leia");
INSERT INTO `disneydb`.`personajes` (`edad`, `historia`, `imagen_personaje`, `nombre_personaje`) VALUES ( 40, "Lord sith de gran poder, mano derecha del Emperador. Vader sirve al Imperio con puño de hierro mientras intenta llevar a Luke al Lado Oscuro.", "https://i.imgur.com/oKziaSk.png", "Darth Vader");


/*Llenar la tabla casting*/

INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (4, 1);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (15, 2);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (9, 3);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (19, 4);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (1, 5);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (1, 6);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (2, 7);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (13, 8);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (3, 9);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (3, 10);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (5, 11);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (6, 11);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (7, 11);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (8, 12);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (8, 13);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (10, 14);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (10, 15);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (11, 14);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (11, 15);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (12, 14);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (12, 15);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (14, 16);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (14, 17);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (16, 18);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (16, 19);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (16, 20);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (16, 21);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (17, 18);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (17, 19);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (17, 20);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (17, 21);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (18, 18);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (18, 19);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (18, 20);
INSERT INTO `disneydb`.`casting` (`id_pelicula`, `id_personaje`) VALUES (18, 21);