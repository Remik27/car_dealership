package zajavka.pl.service;

import org.hibernate.Session;
import zajavka.pl.configuration.HibernateUtil;
import zajavka.pl.domain.ServiceMechanic;

import java.util.List;
import java.util.Objects;

public class ServiceMechanicRepositoryImpl implements ServiceMechanicRepository{
    @Override
    public void add(List<ServiceMechanic> records) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        records.forEach(session::persist);
        session.getTransaction().commit();
    }

    @Override
    public ServiceMechanic find(Integer id) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        ServiceMechanic serviceMechanic = session.get(ServiceMechanic.class, id);
        session.getTransaction().commit();
        return serviceMechanic;

    }

    @Override
    public void delete(ServiceMechanic record) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        session.remove(record);
        session.getTransaction().commit();
    }
}
