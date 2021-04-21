package io.pivotal.pal.tracker;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.noContent;

@RestController
@RequestMapping("/time-entries")
public class TimeEntryController {

    private final TimeEntryRepository timeEntriesRepo;

    public TimeEntryController(TimeEntryRepository inputTimeEntryRepository){
        this.timeEntriesRepo = inputTimeEntryRepository;
    }

    @PostMapping
    public ResponseEntity<TimeEntry> create(@RequestBody TimeEntry timeEntry){
        return created(null)
              .body(timeEntriesRepo.create(timeEntry));
    }
    @GetMapping("{timeEntryId}")
    public ResponseEntity<TimeEntry> read(@PathVariable Long timeEntryId){
        TimeEntry e = timeEntriesRepo.find(timeEntryId);
        if (e == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(e);
    }
    @GetMapping
    public ResponseEntity<List<TimeEntry>> list() {
        return ResponseEntity.ok(timeEntriesRepo.list());
    }
    @DeleteMapping("{timeEntryId}")
    public ResponseEntity<Void> delete(@PathVariable long timeEntryId){
        timeEntriesRepo.delete(timeEntryId);
        return noContent().build();
    }
    @PutMapping("{timeEntryId}")
    public ResponseEntity<TimeEntry> update(@PathVariable long timeEntryId, @RequestBody TimeEntry timeEntry){

        TimeEntry result = timeEntriesRepo.update(timeEntryId,timeEntry);
        if ( result == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }
}
