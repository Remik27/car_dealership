package zajavka.pl.service;

import org.hibernate.Session;
import zajavka.pl.configuration.HibernateUtil;
import zajavka.pl.domain.Part;

import java.util.List;
import java.util.Objects;

public class PartRepositoryImpl implements PartRepository {
    @Override
    public void add(List<Part> records) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        records.forEach(session::persist);
        session.getTransaction().commit();
    }

    @Override
    public Part find(Integer id) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        Part part = session.get(Part.class, id);
        session.getTransaction().commit();
        return part;

    }

    @Override
    public void delete(Part record) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        session.remove(record);
        session.getTransaction().commit();
    }
}
