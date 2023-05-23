package zajavka.pl.service;

import org.hibernate.Session;
import zajavka.pl.configuration.HibernateUtil;
import zajavka.pl.domain.Service;

import java.util.List;
import java.util.Objects;

public class ServiceRepositoryImpl implements ServiceRepository {
    @Override
    public void add(List<Service> records) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        records.forEach(session::persist);
        session.getTransaction().commit();
    }

    @Override
    public Service find(Integer id) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        Service service = session.get(Service.class, id);
        session.getTransaction().commit();
        return service;

    }

    @Override
    public void delete(Service record) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        session.remove(record);
        session.getTransaction().commit();
    }
}
