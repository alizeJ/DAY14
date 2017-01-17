import java.util.*;
/*
去除ArrayList集合中重复的部分
*/


class  ArrayListDemo1
{
	//当这个数组集合中已经有这个元素了就不添加

	public static ArrayList single(ArrayList arr)
	{
		ArrayList al = new ArrayList();
		Iterator it = arr.iterator();

		while(it.hasNext())
		{
			Object obj = it.next();

			if(!al.contains(obj))
				al.add(obj);
		}
		return al;
	}

	public static void main(String[] args)
	{
		ArrayList arr = new ArrayList();

		arr.add("java01");
		arr.add("java02");
		arr.add("java02");
		arr.add("java03");
		arr.add("java04");
		arr.add("java03");

		sop(arr);
		arr = single(arr);
		sop(arr);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
