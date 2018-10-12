/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seal.VideoService.video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author wdrdr
 */
@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    
    @GetMapping("/video/{id}")
    public ResponseEntity<Video> helloWorld(@PathVariable int id) {
        ResponseEntity<Video> video = videoService.findVideoById(id);
        return video;
    }

    @GetMapping("/video")
    public ArrayList getTest() {
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ArrayList> responseEntity = videoService.findAllVideo();
        return responseEntity.getBody();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
