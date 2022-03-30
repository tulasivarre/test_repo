package com.zensar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Account  implements Comparable<Account> {
String name;
double balance;
String city;

public Account(String name, double balance) {
this.name = name;
this.balance = balance;
}
public String getName() {
return this.name;
}
public double getBalance() {
return this.balance;
}
public String getCity() {
return this.city;
}
@Override
public String toString() {
return this.name + " - " + this.balance + " - " + this.city;
}
@Override
public int compareTo(Account o) {
	// TODO Auto-generated method stub
	return 0;
}
public static Stream<Integer> stream() {
	// TODO Auto-generated method stub
	return null;
}
}

public class StreamTest1 {

private static final String BalanceList = null;

public static void main(String[] args) {
// TODO Auto-generated method stub
	
List<String> list = new ArrayList<String>();
list.add("Shashank");
list.add("abc");
list.add("abcd");

List<Integer> temperatures = Arrays.asList(12, 34, 40, 37);
boolean isHot = temperatures.stream().anyMatch((Integer temperature)->temperature>30);
System.out.println(isHot);

Stream<List<Integer>> stream = Stream.of(Arrays.asList(1,2,3),Arrays.asList(1,12,30),Arrays.asList(11,2,13));
List<Integer>flatIntList = stream.flatMap(List::stream).collect(Collectors.toList());
Predicate<String> predicate = (String name)->name.length() % 2 != 0;
List<String> oddNameStudentList = list.stream().filter(predicate).collect(Collectors.toList());

System.out.println(oddNameStudentList);
List<Account> accountList = Arrays.asList(new Account("Tom",330000), new Account("Jerry",20000), new Account("Ivan",30000));
accountList.sort((Account s1, Account s2)->s1.getName().compareTo(s2.getName()));
accountList.forEach((s)->System.out.println(s));
Comparator<Account> accNameComparator = (Account acc1,Account acc2)->acc2.getName().compareTo(acc1.getName());
Comparator<Account> accBalanceComparator = (Account acc1,Account acc2)-> {
	if(acc1.getBalance()>acc2.getBalance())
		return 1;
	else if(acc1.getBalance()<acc2.getBalance())
		return 0;
	return 0;
};

List<Account> accountlist1 = Arrays.asList(new Account("Tom", 2000), new Account("Jerry", 5000));
Function<Account, Double> balfunc = (sortaccount)->sortaccount.getBalance();
Function<Account, String> namefunc = (account)->account.getName();

String accountNames = accountList.stream().map(Account::getName).collect(Collectors.joining(","));
Function<Account ,String> cityFunc = (Account account)->account.getCity();

Double totalCashBank = accountList.stream().collect(Collectors.summarizingDouble(Account::getBalance)).getSum();
Map<String, List<Account>> accountListByCity = accountList.stream().collect(Collectors.groupingBy(Account::getCity));
Map<String, Long> accountCountByCity = accountList.stream().collect(Collectors.groupingBy(Account::getCity, Collectors.counting()));
Map<Boolean, List<Account>> partionAccounts = accountList.stream().collect(Collectors.partitioningBy((Account account)->account.getBalance()>=10000));

List<Double> accountBalanceList = accountlist1.stream().map(balfunc).collect(Collectors.toList());
List<String> nameList = accountlist1.stream().map(namefunc).collect(Collectors.toList());
System.out.println(BalanceList + " " + nameList);
System.out.println(flatIntList);
}
}


