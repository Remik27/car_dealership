package zajavka.pl.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Map;

public class HibernateUtil {

    private static final Map<String, Object> SETTINGS =
            Map.of(
                    Environment.DRIVER, "org.postgreSql.Driver",
                    Environment.URL, ""
            )

        private static SessionFactory sessionFactory;

        public static SessionFactory getSessionFactory() {
            if (sessionFactory == null) {
                try {
                    Configuration configuration = new Configuration();


                    configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
                    configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/nazwa_bazy_danych");
                    configuration.setProperty("hibernate.connection.username", "nazwa_użytkownika");
                    configuration.setProperty("hibernate.connection.password", "hasło");

                    // Konfiguracja dialektu bazy danych
                    configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

                    // Dodaj klasy encji
                    configuration.addAnnotatedClass(YourEntityClass.class);
                    // Dodaj kolejne klasy encji, jeśli istnieją

                    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties());

                    sessionFactory = configuration.buildSessionFactory(builder.build());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sessionFactory;
        }
    }
    W powyższym przykładzie należy dostosować ustawienia połączenia do odpowiednich wartości dla twojej bazy danych, a także dodać klasy encji, które chcesz mapować za pomocą Hibernate.

            Teraz, aby uzyskać instancję SessionFactory, można wywołać metodę getSessionFactory() z klasy HibernateConfig. Możesz użyć tej instancji do otwierania sesji Hibernate i wykonywania operacji na bazie danych.

            java
    Copy code
    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
    Session session = sessionFactory.openSession();

// Wykonaj operacje na bazie danych

session.close();
    To jest podstawowa konfiguracja Hibernate bez użycia Springa w klasie Java. Pamiętaj, że musisz dodać odpowiednie zależności do swojego projektu i dostosować ustawienia do swojej konfiguracji bazy danych.








