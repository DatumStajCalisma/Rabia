package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@Data
@Entity //anatasyon yaptım
@Table(name="products") //veri tabanında hangi tabloya karşılık geldiğini söylüyoruz
//@AllArgsConstructor
//@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //değerin nasıl artacağını söylüyor bir bir artacak
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	
	public Product() {
		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(short unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
	
}
