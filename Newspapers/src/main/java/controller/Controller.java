package controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.news.model.Newspapers;

@AutoConfigureMockMvc

public class Controller {

	public static ArrayList<NewspaperOrder> orderId;

	public enum Services {
		;

		void update(long id, NewspaperOrder order) {
			// TODO Auto-generated method stub

		}

		void deleteAll() {
			// TODO Auto-generated method stub

		}

		void remove(long id) {
			// TODO Auto-generated method stub

		}

		ArrayList<NewspaperOrder> getOrders() {
			// TODO Auto-generated method stub
			return orderId;
		}

		void createOrder(Newspapers order) {
			// TODO Auto-generated method stub

		}

	}

	private Services service;
	private String index;

	public Controller(Services service) {
		super();
		this.service = service;
	}

	public ResponseEntity createOrder(@RequestBody Newspapers order) {

		service.createOrder(order);

		ResponseEntity response = new ResponseEntity("Order added with ID: " + order.getId(), HttpStatus.CREATED);
		return response;
	}

	@GetMapping("/get/{index}")
	public int getByIndex(@PathVariable("index") int index) {
		return index;

	}

	@GetMapping("/get/{id}")
	public ResponseEntity getById(@PathVariable("id") ResponseEntity id) {
		return id;

	}

	@GetMapping("/getOrder")
	public ResponseEntity getOrders() {

		ArrayList<NewspaperOrder> response = service.getOrders();

		return null;

	}

	@DeleteMapping("/delete/{index}")
	public int deleteByIndex(@PathVariable("index") int index) {
		return index;

	}

	String response = "Order of index: " + index + " deleted";

	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteByid(@PathVariable("id") long id) {
		service.remove(id);
		String response = "Order of id: " + id + " deleted";
		return new ResponseEntity(response, HttpStatus.ACCEPTED);
	}

	@PutMapping("/update/{index}")
	public int updateByIndex(@PathVariable("index") int index, @RequestBody NewspaperOrder order) {
		return index;

	}

	@PutMapping("/update/{id}")
	public ResponseEntity updateByid(@PathVariable("id") long id, @RequestBody NewspaperOrder order) {

		service.update(id, order);

		String response = "Updating order of index: " + index;

		return new ResponseEntity(response, HttpStatus.OK);

	}

	public void Controller(controller.Services service) {

	}

	@DeleteMapping("/delete")
	public ResponseEntity deleteAll() {

		service.deleteAll();

		return new ResponseEntity("all orders deleted", HttpStatus.ACCEPTED);
	}
}