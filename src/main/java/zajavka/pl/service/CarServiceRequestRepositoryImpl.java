package zajavka.pl.service;

import org.hibernate.Session;
import zajavka.pl.configuration.HibernateUtil;
import zajavka.pl.domain.CarServiceRequest;

import java.util.List;
import java.util.Objects;

public class CarServiceRequestRepositoryImpl implements CarServiceRequestRepository{
    @Override
    public void add(List<CarServiceRequest> records) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        records.forEach(session::persist);
        session.getTransaction().commit();
    }

    @Override
    public CarServiceRequest find(Integer id) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        CarServiceRequest carServiceRequest = session.get(CarServiceRequest.class, id);
        session.getTransaction().commit();
        return carServiceRequest;

    }

    @Override
    public void delete(CarServiceRequest record) {
        Session session = HibernateUtil.getSession();
        if (Objects.isNull(session)){
            throw new RuntimeException("Session is null");
        }
        session.beginTransaction();
        session.remove(record);
        session.getTransaction().commit();
    }
}
