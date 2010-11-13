package springsprout.modules.location;

import org.springframework.stereotype.Repository;
import springsprout.common.dao.HibernateGenericDao;
import springsprout.domain.Location;

import java.util.List;

@Repository
public class LocationRepositoryImpl extends HibernateGenericDao<Location> implements LocationRepository {

}
