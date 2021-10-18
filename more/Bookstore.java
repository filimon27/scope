package scope.more;

import java.util.ArrayList;

class Bookstore {
	//private static final int DEFAULT_NO_OF_EMPLOYEES = 20;
	//private static final int DEFAULT_NO_OF_BOOKS = 100;
	private String id = null;
	private ArrayList<Book> books;
	private ArrayList<Employee> employees;

	public Bookstore(String theId) {
		id = theId;
		books = new ArrayList<>();
		employees = new ArrayList<>();
	}

	public int getNumBooks() {
		int i = 0;
		for (i = 0; i < books.toArray().length; i++) {
			if (books.get(i) == null) {
				break;
			}
		}
		return i;
	}

	public int getNumEmployees() {
		int count = 0;
		for (int i = 0; i < employees.toArray().length; i++) {
			if (employees.get(i) != null)
				count++;
		}
		return count;
	}

	public boolean addNewBook2(String bookId) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i) == null) {
				break;

			}
		}
		boolean added= books.add(new Book(bookId));
		return added;
		//throw new RuntimeException("The array is full");
	}

	public void addNewBook(String bookId) {
		int i = 0;
		for (i = 0; i < books.size(); i++) {
			if (books.get(i) == null)//
				break;
		}


		books.add( new Book(bookId));
		//if (i == books.size()) // the array is full, cannot add
			//throw new RuntimeException("The array is full.");
        // add successfully

	}

	public void printTheBooks() {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i) != null)
				System.out.print(books.get(i).getId() + " ");
			else
			System.out.print("null" + " ");
		}

		System.out.println();
	}

	public boolean addNewEmployee(String employeeId) {
		Employee e = new Employee(employeeId);
		int i = 0;
		for (i = 0; i < employees.size(); i++) {
			if (employees.get(i) == null)
				break;
		}
		 boolean add =employees.add(new Employee(employeeId));
		return add;

		}



	public boolean bookIsInStock(String bookId) {
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b != null && b.getId().equals(bookId))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Bookstore bs = new Bookstore("123");
		bs.printTheBooks();
		bs.addNewBook("101");
		bs.addNewBook("102");
		bs.addNewBook("103");
		bs.addNewBook("104");
		bs.printTheBooks();
		System.out.println(bs.bookIsInStock("102"));
		System.out.println(bs.bookIsInStock("106"));
	}
}
