package de.casestudy.casestudydb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("station/")
public class DBController {
    private final DBService dbService;

    @GetMapping public String getShortcut() {
        return dbService.getShortCode();
    }

}