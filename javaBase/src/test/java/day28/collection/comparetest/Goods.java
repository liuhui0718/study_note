package day28.collection.comparetest;

public class Goods implements Comparable{

    private  String name;
    private int price;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    //知名商品比较大小的方式，按照价格从小到大排序
    @Override
    public int compareTo(Object o) {
        System.out.println("@@@@@@@@@@@@@@@@@@");

        if (o instanceof Goods){
            Goods goods = (Goods) o;
            if (this.price > goods.price){
                return 1;
            }if (this.price < goods.price){
                return -1;
            }else {
                return this.name.compareTo(this.name);
            }
        }throw new RuntimeException("输入类型有误");
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (price != goods.price) return false;
        return name != null ? name.equals(goods.name) : goods.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
