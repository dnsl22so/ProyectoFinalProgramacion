ProyectoFinalProgramacion
src/
Nombre del Package: package com.mycompany.proyectofinal;

├── Cliente.java             # Datos del cliente, zona (1-4) y tarifa de envío  (Ya hecho.)

├── ProductoMenu.java        # Catálogo de pizzas y bebidas, tamaño y precio (De aqui a abajo faltan)

├── Repartidor.java          # Motorizados y límite de 3 pedidos activos en ruta 

├── DetallePedido.java       # Línea de producto, cantidad e importe por ítem 

├── Pedido.java              # Orden completa, totales, estados y comanda

├── RestaurantePizzeria.java # Arreglos, matriz de entregas, reportes y menús

└── Main.java                # Punto de arranque del programa con Scanner

-----------------------
[x] Cliente.java (Base del cliente): Guarda teléfono (^9[0-9]{8}$), nombre, dirección y zona (1 a 4). Función: Determina la tarifa de envío según la zona (S/ 4.00, S/ 6.00, S/ 8.00 o S/ 10.00) y valida los datos del cliente.

[ ] ProductoMenu.java (Catálogo del menú): Registra códigos (^PIZ-[0-9]{3}$ o ^BEB-[0-9]{3}$), nombre, categoría, tamaño (Personal, Mediana, Familiar) y precio positivo. Función: Representa cada artículo disponible para pedir y valida su formato y precio.

[ ] Repartidor.java (Control de motorizados): Maneja código (^REP-[0-9]{2}$), nombre, teléfono y contador de pedidos activos. Función: Controla que un repartidor no lleve más de 3 pedidos en ruta a la vez (puedeLlevarPedido(), asignarPedido(), liberarPedido()).

[ ] DetallePedido.java (Ítem dentro de un pedido): Relaciona un ProductoMenu con una cantidad entera positiva. Función: Calcula el importe de cada línea (cantidad * precioUnitario) para formar el pedido.

[ ] Pedido.java (Núcleo de la orden): Agrupa código (^PED-[0-9]{3}$), Cliente, Repartidor y arreglo de DetallePedido. Función: Calcula subtotal, costo de delivery y total, controla el flujo de estados (Registrado -> En Preparacion -> En Ruta -> Entregado / Cancelado) y arma la comanda con StringBuilder.

[ ] RestaurantePizzeria.java (Coordinador y lógica del turno): Administra arreglos del sistema, la matriz Repartidor × Zona de pedidos entregados y los menús de consola. Función: Coordina toma de pedidos, cocina, despacho, cobro, reportes con StringBuilder, validaciones con try-catch y flujos con 0. Volver.

[ ] Main.java (Ejecución): Contiene el método main y el Scanner. Función: Instancia RestaurantePizzeria, inicia el menú principal y cierra el Scanner al salir.

||||INSTRUCCIONES||||

-Envíame tu nombre de usuario de GitHub o el correo electrónico con el que te registraste para agregarte como colaborador. Por el grupo de whatsapp o privado.
-Guarden su archivo/class en netbeans, presiona 'Ctrl+S'
-Acuérdense de llamar los archivos/clases como los de arriba, 'ProductoMenu, Repartidor, etc'.
-Buscar tu clase archivo en tu PC. Si usas NetBeans:** Ve a `Documentos` > `NetBeansProjects` > `[NombreDeTuProyecto]` > `src` > `[NombreDeTuPaquete]` > `TuClase.java`
