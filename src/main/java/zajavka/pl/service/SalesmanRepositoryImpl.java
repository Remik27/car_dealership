package zajavka.pl.service;

import org.hibernate.Session;
import zajavka.pl.configuration.HibernateUtil;
import zajavka.pl.domain.Salesman;

import java.util.List;
import java.util.Objects;

public class SalesmanRepositoryImpl implements SalesmanRepository {
    @Override
    public void add(List<Salesman> records) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        records.forEach(session::persist);
        session.getTransaction().commit();
    }

    @Override
    public Salesman find(Integer id) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        Salesman salesman = session.get(Salesman.class, id);
        session.getTransaction().commit();
        return salesman;

    }

    @Override
    public void delete(Salesman record) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        session.remove(record);
        session.getTransaction().commit();
    }
}
