public class OperationSummary {
    private String _name;
    private float _quantity;
    private float _finalPrice;

    public OperationSummary(String name, float quantity, float finalPrice) {
        _name = name;
        _quantity = quantity;
        _finalPrice = finalPrice;
    }

    public String printOperationSummary() {
        String opSum = "Sumar operatiune:"+"\n"+_name+"\n"+_quantity+"\n"+_finalPrice;
        return opSum;
    }

}