INSERT INTO `usuario` (`id`, `created`, `emal`, `modified`, `name`, `password`) VALUES
(1, '2021-06-01', 'juan@gmail.com', '2021-06-08', 'juan', '123456'),
(2, '2021-06-01', 'juan2@gmail.com', '2021-06-08', 'juan2@gmail.com', '123456');

INSERT INTO `phone` (`id`, `citycode`, `contrycode`, `number`, `usuario_id`) VALUES
(1, '5', '50', '111111', 1),
(2, '5', '50', '222222', 1),
(3, '6', '60', '333333', 2),
(4, '6', '60', '444444', 2);