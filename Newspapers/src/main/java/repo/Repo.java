package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.model.NewspaperOrder;

//Repo stores methods
//creates and storesobjects in db

public interface Repo extends JpaRepository<NewspaperOrder, Long> {

}
