package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public class TimeEntryController {

    private TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository inputTimeEntryRepository){
        this.timeEntryRepository = inputTimeEntryRepository;
    }


    public ResponseEntity<TimeEntry> create(TimeEntry timeEntry){
        return null;
    }

    public ResponseEntity<TimeEntry> read(Long timeEntryId){
        return null;

    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity<Void> delete(long timeEntryId){
        return null;
    }

    public ResponseEntity<TimeEntry> update(long timeEntryId,  TimeEntry timeEntry){
        return null;
    }
}
