package com.zensar;
enum Status{
NEW(0), REJECTED(-1), ACCEPTED(1), COMPLETED(2);
int value;
private Status(int value) {
this.value = value;
}
public int getValue()
{
return this.value;
}
}
class Order{
int orderId=1;
String orderName="ABC";
int quantity = 10;
double price = 1000;
Status s1 = Status.ACCEPTED;
@Override
public String toString() {
return "Order [orderId=" + orderId + ", orderName=" + orderName + ", quantity=" + quantity + ", price=" + price
+ ", s1=" + s1 + "]";
}



}
public class OrderTest {



public static void main(String[] args) {
// TODO Auto-generated method stub
// Status[] status =Status.values();
//
// for (Status sta : status)
// {
//
// System.out.println("STATUS : " + sta.name() +
// " Value: " + sta.getValue() );
// }
Order order = new Order();
System.out.println(order.toString());



}



}


