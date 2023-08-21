//package com.example.demo;


/*
@Singleton
@Startup
public class Conection {
    @PersistenceContext(unitName ="myDatabase")
    private EntityManager entityManager;
    //@Resource(lookup = "java:global/jdbc/MyDataSource")
    //private DataSource dataSource;
        @PostConstruct
        public void init() {
            try {
                // Verificar conexión a la base de datos
                if (entityManager != null) {
                    System.out.println(entityManager.toString());
                    System.out.println("Conexión a la base de datos establecida.");
                }

            } catch (PersistenceException e) {
                System.err.println("Error al establecer conexión o generar tablas: " + e.getMessage());
                e.printStackTrace();
            }
        }

}
*/