public class Product{
    private String _name;
    private float _price;

    public Product(String name, float price){
        _name = name;
        _price = price;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public float get_price() {
        return _price;
    }

    public void set_price(float _price) {
        this._price = _price;
    }
}