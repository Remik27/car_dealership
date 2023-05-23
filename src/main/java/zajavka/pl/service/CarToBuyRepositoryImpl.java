package zajavka.pl.service;

import org.hibernate.Session;
import zajavka.pl.configuration.HibernateUtil;
import zajavka.pl.domain.CarToBuy;

import java.util.List;
import java.util.Objects;

public class CarToBuyRepositoryImpl implements CarToBuyRepository{
    @Override
    public void add(List<CarToBuy> records) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        records.forEach(session::persist);
        session.getTransaction().commit();
    }

    @Override
    public CarToBuy find(Integer id) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        CarToBuy carToBuy = session.get(CarToBuy.class, id);
        session.getTransaction().commit();
        return carToBuy;

    }

    @Override
    public void delete(CarToBuy record) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        session.remove(record);
        session.getTransaction().commit();
    }
}
