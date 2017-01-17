
import java.util.*;

/*
���Զ��������ΪԪ�ش浽ArrayList�����У���ȥ���ظ�Ԫ�ء�

���磺���˶���ͬ����ͬ���䣬��Ϊͬһ���ˡ�Ϊ�ظ�Ԫ�ء�


˼·��
1�����������������ݷ�װ���˶���
2���������������˴��롣
3��ȡ����



List�����ж�Ԫ���Ƿ���ͬ��������Ԫ�ص�equals������



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
		
		arr.add(new Person("����",33));
		arr.add(new Person("����",34));
		arr.add(new Person("����",32));
		arr.add(new Person("����",32));
		arr.add(new Person("����",33));
		arr.add(new Person("����",33));
		
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
			if(!al.contains(obj))  //�˴��ײ������equals������
				al.add(obj);
		}
		return al;
	}
}
