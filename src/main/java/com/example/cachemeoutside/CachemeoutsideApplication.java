package com.example.cachemeoutside;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CachemeoutsideApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachemeoutsideApplication.class, args);




        /*
        int userId= 1;
        Cache userCache = new Cache();
        userCache.has(userId);
        userCache.set(userId, "super long string");
        userCache.has(userId);
        userCache.get(userId);
        userCache.delete(userId);
        userCache.has(userId);
*/
    }

}
