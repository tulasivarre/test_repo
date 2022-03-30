package com.zensar;
abstract class Persistance{
abstract void Persist(int flag);

}

class FilePersistance extends Persistance{
void Persist(int flag) {

if (flag == 1)
System.out.println("data persisted in to file systems");
System.out.println("transaction failed");
}
}


class Databaspersistance extends Persistance{
void Persist(int flag) {
if (flag == 1)
System.out.println("data persisted in to file systems");
System.out.println("transaction failed");
}
}


public class Client {


public static void main(String[] args) {

Databaspersistance db = new Databaspersistance();
db.Persist(1);

FilePersistance fp = new FilePersistance();
fp.Persist(2);


}

}
