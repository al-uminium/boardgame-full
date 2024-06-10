package bg.backend.bg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import bg.backend.bg.model.BG;
import bg.backend.bg.repo.BGRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class BGRestController {
  @Autowired private BGRepo repo; 

  @GetMapping("/games")
  public ResponseEntity<List<BG>> getGames() {
    List<BG> bgList = repo.getListOfBGs();
    System.out.println(">>> /games API accessed");
    return new ResponseEntity<>(bgList, HttpStatus.OK);
  }
  
  @GetMapping("/game/{gid}")
  public ResponseEntity<BG> getBoardGameByGID(@PathVariable int gid) {
      List<BG> result = repo.getBoardGame(gid);
      System.out.println(">>> /game/" + gid + " API accessed");
      if (result.size()>0){
        return new ResponseEntity<BG>(result.get(0), HttpStatus.OK);
      } else {
        BG emptyBg = new BG();
        emptyBg.setName("GAME NOT FOUND");
        emptyBg.setGid(-1);
        return new ResponseEntity<BG>(emptyBg, HttpStatus.NOT_FOUND);
      }
  }
  
}
