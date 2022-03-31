package services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.news.model.NewspaperOrder;

import repo.Repo;

//@Service annotation
@Service
public class Services {
	private Repo repo;

	public Services(Repo repo) {
		super();
		this.repo = repo;
	}

	public boolean orderNewspaperDB(NewspaperOrder order) {
		NewspaperOrder save = repo.save(order);
		return true;
	}

	private ArrayList<NewspaperOrder> orderList = new ArrayList<>();
	private Object id;

	public boolean createOrderDB(NewspaperOrder order) {
		order.setId(orderList.size() + 1);
		orderList.add(order);
		return true;

	}

	public NewspaperOrder getByIndex(Object id) {
		this.id = id;
		return orderList.get((int) id);
	}

	public ArrayList<NewspaperOrder> getOrders() {
		return orderList;
	}

	public boolean remove(long id) {
		orderList.remove(id);
		return true;
	}

	public boolean update(long id, NewspaperOrder order) {
		orderList.set((int) id, order);
		return true;
	}

	public boolean deleteAll() {
		orderList.clear();
		return true;
	}
}