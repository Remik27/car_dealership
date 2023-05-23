package zajavka.pl.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import zajavka.pl.domain.*;

import java.util.Map;

public class HibernateUtil {

    private static final Map<String, Object> SETTINGS =
            Map.ofEntries(
                    Map.entry(Environment.DRIVER, "org.postgresql.Driver"),
                    Map.entry(Environment.URL, "jdbc:postgresql://localhost:5432/car_dealership"),
                    Map.entry(Environment.USER, "postgres"),
                    Map.entry(Environment.PASS, "postgres"),
                    Map.entry(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect"),
                    Map.entry(Environment.HBM2DDL_AUTO, "none"),
                    Map.entry(Environment.SHOW_SQL, "true"),
                    Map.entry(Environment.FORMAT_SQL, "true")
            );

    private static SessionFactory sessionFactory;

    public static SessionFactory loadSessionFactory() {
        try {
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(SETTINGS)
                    .build();

            Metadata metadata = new MetadataSources(serviceRegistry)
                    .addAnnotatedClass(Address.class)
                    .addAnnotatedClass(CarServiceRequest.class)
                    .addAnnotatedClass(CarToBuy.class)
                    .addAnnotatedClass(CarToService.class)
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Invoice.class)
                    .addAnnotatedClass(Mechanic.class)
                    .addAnnotatedClass(Part.class)
                    .addAnnotatedClass(Salesman.class)
                    .addAnnotatedClass(Service.class)
                    .addAnnotatedClass(ServiceMechanic.class)
                    .addAnnotatedClass(ServicePart.class)
                    .getMetadataBuilder()
                    .build();
            return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    static void closeSessionFactory() {
        try {
            sessionFactory.close();
        } catch (Exception ex) {
            System.err.println("Exception while closing SessionFactroy" + ex.getMessage());
        }
    }

    static Session getSession() {
        try {
            return sessionFactory.openSession();
        } catch (Exception ex) {
            System.err.println("Exception while opening session " + ex.getMessage());
        }
        return null;
    }
}




