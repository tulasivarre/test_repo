package com.zensar;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Fruits1{
public String name;
public int calories;
public int price;
public String color;



public Fruits1(String name, int calories, int price, String color) {
super();
this.name = name;
this.calories = calories;
this.price = price;
this.color = color;
}

public String getName() {
return name;
}



public int getCalories() {
return calories;
}



public int getPrice() {
return price;
}



public String getColor() {
return color;
}


/*
@Override
public String toString() {
return "Fruits [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
}
*/

@Override
public String toString() {
return "[name=" + name + ", calories=" + calories + "]";
}

}
public class StreamsAssignments {


private static final Predicate predicate = null;

public static void main(String[] args) {
// TODO Auto-generated method stub
/*1.Display the fruit names of low calories fruits
i.e. calories < 100 sorted in descending order of calories.*/
List<Fruits1> fruitsList = Arrays.asList(new Fruits1("orange", 47,20,"orange"), new Fruits1("apple",52,25,"red"),new Fruits1("guava",68,10,"green"));

friuts fruitsList1;
Predicate<Fruits1> predicate = p -> p.getCalories() > 200;
Map<Boolean, List<Fruits1>> lowCaloryFruits = fruitsList.stream().collect(Collectors.partitioningBy(predicate));
System.out.println(lowCaloryFruits);
//Comparator<Fruits> lowCaloryFruits = Comparator.comparing(Fruits::getCalories).reversed();
//List<Fruits> caloriesInDescendingOrder = fruitsList.stream().sorted(lowCaloryFruits).collect(Collectors.toList());
//System.out.println("caloriesInDescendingOrder : " + caloriesInDescendingOrder);
List<Fruits1> lowCalories = fruitsList.stream().filter(fruit -> fruit.getCalories() < 100).sorted(Comparator.comparing(Fruits1::getCalories).reversed())
.collect(Collectors.toList());
System.out.println("lowCalories Fruits : ");
lowCalories.forEach((s)->System.out.println(s));

Collection<Fruits1> newsList = null;
//Find out the newsId which has received maximum comments

Map<News, Long> commentsCountBynewId = newsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("NewsId: ");
//2.Display color wise list of fruits.
List<String> obj = fruitsList.stream().filter(a->a.getColor()=="red").map(a->a.name).collect(Collectors.toList());
System.out.println(obj );
List<String> obj1 = fruitsList.stream().filter(a->a.getColor()=="orange").map(a->a.name).collect(Collectors.toList());
System.out.println(obj1);


List<String> colorwiseList=fruitsList.stream().filter(p->p.color.equals("green")).map(p->p.name).sorted().collect(Collectors.toList());
System.out.println(colorwiseList);
List<String> app3= fruitsList.stream().filter(p->p.color.equals("red")).map(p->p.name).sorted().collect(Collectors.toList());
System.out.println(app3);

//3.Display only RED color fruits sorted as per their price in ascending order
List<Fruits1> redColorFruits = fruitsList.stream().filter(fruit -> fruit.getColor() == "red").sorted(Comparator.comparing(Fruits1::getColor))
.collect(Collectors.toList());
redColorFruits.forEach((x)->System.out.println(x));


}


}

