package sky.pro.homeWork32.service;

import org.springframework.stereotype.Service;
import sky.pro.homeWork32.entities.Faculty;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(long id, Faculty faculty);

    void deleteFaculty(long id);
}
