1. Iniciar Servicio MySQL
2. Crear base de datos springboot10_servicios
3. Crear paquete entities
4. Crear una clase en el paquete entities llamada Producto con campos:
    Long id, String marca, String modelo, Long stock
5. Anotar la clase con @Entity, @Id y @Table. En @Id indicar: @GeneratedValue(strategy = GenerationType.IDENTITY)
6. Iniciar la aplicación, se debe crear la tabla
7. Crear un paquete controllers
8. Crear un controlador llamado productos
    Llamará a un método de un servivio llamado getProductos
    renderizará una vista llamada listado-productos

