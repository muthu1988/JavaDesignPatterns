package solid;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

enum COLOR { RED, BLUE, GREEN }

enum SIZE { SMALL, MEDIUM, LARGE }

class Product {
	public String name;
	public COLOR color;
	public SIZE size;
	public Product(String name, COLOR color, SIZE size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	public String toString() {
		return "Product [name=" + name + ", color=" + color + ", size=" + size + "]";
	}
}

interface Condition<T> {
	boolean isSatisfied(T item);
}

interface Filter<T> {
	Stream<T> filterItem(List<T> items, Condition<T> condition);
}

class ProductAndCondition implements Condition<Product> {
	private Condition<Product> first;
	private Condition<Product> second;
	public ProductAndCondition(Condition<Product> first, Condition<Product> second) {
		this.first = first;
		this.second = second;
	}
	public boolean isSatisfied(Product item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}	
}

class ColorCondition implements Condition<Product> {
	private COLOR color;		
	public ColorCondition(COLOR color) {
		this.color = color;
	}
	public boolean isSatisfied(Product item) {
		return color == item.color;
	}
}

class SizeCondition implements Condition<Product> {
	private SIZE size;		
	public SizeCondition(SIZE size) {
		this.size = size;
	}
	public boolean isSatisfied(Product item) {
		return size == item.size;
	}
}

class ProductFilter implements Filter<Product> {
	public Stream<Product> filterItem(List<Product> items, Condition<Product> condition) {
		return items.stream().filter((i) -> condition.isSatisfied(i));
	}
}


class Ocl {
	public static void main(String[] args) {
		Product apple = new Product("Apple", COLOR.GREEN, SIZE.SMALL);
		Product tree = new Product("Tree", COLOR.GREEN, SIZE.LARGE);
		Product car = new Product("Car", COLOR.RED, SIZE.LARGE);
		List<Product> products = Arrays.asList(apple, tree, car);
		ProductFilter filter = new ProductFilter();
//		filter.filterItem(products, new ColorCondition(COLOR.GREEN)).forEach(System.out::println);
		ProductAndCondition andCondition = new ProductAndCondition(new ColorCondition(COLOR.GREEN), new SizeCondition(SIZE.LARGE));
		filter.filterItem(products, andCondition).forEach(System.out::println);
	}
}