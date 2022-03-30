package com.zensar;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Date;


@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
@interface Animal{
String type() default "bird";
int height() default 10;
}

//type = "bird",,height=20

@Animal
class Cat{
String name = "jenny";

@Override
@Animal
public String toString() {
return this.name;
}
}
public class AnnotationTest {

// @Deprecated
//public static void testAnnotation() {

// }
public static void main(String[] args) throws NoSuchMethodException, SecurityException {
// TODO Auto-generated method stub
// testAnnotation();
//@SuppressWarnings("deprecation")
//Date dt = new Date(12,5,2022);
//Cat cat = new Cat();
//System.out.println("Cat = " + cat);
Class classCat = Cat.class;
Annotation annotations[] = classCat.getDeclaredAnnotations();
Method method = classCat.getDeclaredMethod("toString", null);
annotations = method.getAnnotations();
for (int i=0;i<annotations.length;i++)
System.out.println(annotations[i]);
}

}