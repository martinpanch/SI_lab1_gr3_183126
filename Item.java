 class Item {
	int id;
	String name;
	double price;
	char taxType;

	public Item(int id, String name, double price, char taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTaxType() {
		return taxType;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}

	//TODO add variable.

	//TODO constructor

	//TODO setters and getters


	double taxReturn () {
		//TODO
		if (taxType == 'A')
		{
			return (15/100)*(price*(18/100));
		}
		else if (taxType == 'B')
		{
			return (15/100)*(price*(5/100));
		}
		else return 0;
	}
}