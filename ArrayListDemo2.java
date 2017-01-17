
import java.util.*;

/*
将自定义对象作为元素存到ArrayList集合中，并去除重复元素。

比如：存人对象。同姓名同年龄，视为同一个人。为重复元素。


思路：
1，对人描述，将数据封装进人对象。
2，定义容器，将人存入。
3，取出。



List集合判断元素是否相同，依据是元素的equals方法。



*/
class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Person))
		{
			return false;
		}

		Person p = (Person)obj;

		return this.name.equals(p.name) && this.age == p.age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

}


class  ArrayListDemo2
{
	public static void main(String[] args) 
	{
		ArrayList arr = new ArrayList();
		
		arr.add(new Person("李四",33));
		arr.add(new Person("王五",34));
		arr.add(new Person("张三",32));
		arr.add(new Person("张三",32));
		arr.add(new Person("李四",33));
		arr.add(new Person("赵四",33));
		
		arr = single(arr);

		Iterator it = arr.iterator();

		while(it.hasNext())
		{
			Person p = (Person)it.next();
			sop(p.getName()+"...."+p.getAge());
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static ArrayList single(ArrayList arr)
	{
		ArrayList al = new ArrayList();

		Iterator it = arr.iterator();

		while (it.hasNext())
		{
			Object obj = it.next();
			if(!al.contains(obj))  //此处底层调用了equals方法。
				al.add(obj);
		}
		return al;
	}
}
