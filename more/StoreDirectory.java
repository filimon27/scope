package scope.more;

public class StoreDirectory {
	private Bookstore bookstore;
	private Market market;
	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}
	public int getNumberOfBookstoreEmployees() {

		return  bookstore.getNumEmployees();
	}
	public boolean addNewEmployee(String employeeId){

       	return bookstore.addNewEmployee(employeeId);
	}
	public boolean bookIsInStock(String bookId){

			return bookstore.bookIsInStock(bookId);
	}
	public boolean addNewBook(String bookId){
		//implement
		return bookstore.addNewBook2(bookId);
	}
	public boolean marketCarriesFoodItem(String foodItem){
		//implement
		return market.carriesFoodItem(foodItem);
	}
}
