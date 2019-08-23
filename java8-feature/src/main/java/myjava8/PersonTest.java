package myjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author chris
 * @Date 2019-02-20 10:41
 * @Version 1.0
 **/

public class PersonTest {
    public static void main(String[] args) {
        Person person1=new Person("張三",20);
        Person person2=new Person("李四",30);
        Person person3=new Person("王五",40);
        List<Person> list2=Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();
        List<Person> list3=personTest.getPersonByUsername("王五",list2);
        list3.forEach(item-> System.out.println(item.getName()));
        List<Person> list4 = personTest.getPersonByAge(25, list2);
        list4.forEach(item-> System.out.println(item.getAge()));
        List<Person> list5=personTest.getPersonByAge2(20,list2,(age,personlist)->
                personlist.stream().filter(person -> person.getAge()<=age).collect(Collectors.toList()));
        list5.forEach(person -> System.out.println(person.getAge()));
    }
//    public List<Person> getPersonByUsername(String name,List<Person> list){
//        return list.stream().filter(new Predicate<Person>() {
//            @Override
//            public boolean ExceptionTest(Person person) {
//                return person.getName().equals(name);
//            }
//        }).collect(Collectors.toList());
//    }
    public List<Person> getPersonByUsername(String name,List<Person> list){
        return list.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }
    public List<Person> getPersonByAge(Integer age,List<Person>list) {
        BiFunction<Integer,List<Person>,List<Person>> biFunction=(ageOfPerson,personList)->{
            return personList.stream().filter(person -> person.age>ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, list);
    }
    public List<Person> getPersonByAge2(Integer age,List<Person>list,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age, list);
    }
}