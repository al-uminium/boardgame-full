package bg.backend.bg.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import bg.backend.bg.model.BG;

@Repository
public class BGRepo {
  @Autowired private MongoTemplate template;

  /*
   db.boardgames.find({}) 
  */

  public List<BG> getListOfBGs() {
    Query query = Query.query(Criteria.where("gid").gt(0));
    return template.find(query, BG.class, "boardgames");
  }

  public List<BG> getBoardGame(int gid) {
    Criteria criteria = Criteria.where("gid").is(gid);
    Query query = Query.query(criteria);
    return template.find(query, BG.class, "boardgames");
  }
}
