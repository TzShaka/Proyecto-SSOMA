INSERT INTO `ssoma_puesto` (`id`, `nombre_puesto`)
VALUES (3, 'Ingeniero de Software');

INSERT INTO `ssoma_puesto` (`id`, `nombre_puesto`)
VALUES (4, 'Recursos Humanos');

INSERT INTO `ssoma_persona` (`id`, `apellido_completo`, `correo`, `direccion`, `dni`, `fecha_contratacion`, `fecha_nacimiento`, `matricula`, `nombre_completo`, `telefono`, `puesto_id`)
VALUES (1, 'Perez, Juan', 'jperez@company.com', 'Calle Los Pinos 123', '12345678', '2023-01-01', '1990-05-10', 'EMP00001', 'Juan Carlos Perez', '987654321', 2);

INSERT INTO `ssoma_persona` (`id`, `apellido_completo`, `correo`, `direccion`, `dni`, `fecha_contratacion`, `fecha_nacimiento`, `matricula`, `nombre_completo`, `telefono`, `puesto_id`)
VALUES (2, 'Diaz, Maria', 'mdiaz@company.com', 'Avenida del Sol 456', '87654321', '2024-02-15', '1985-12-25', 'EMP00002', 'Maria Fernanda Diaz', '543219876', 1);