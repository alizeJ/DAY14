import java.util.*;
/*
ȥ��ArrayList�������ظ��Ĳ���
*/


class  ArrayListDemo1
{
	//��������鼯�����Ѿ������Ԫ���˾Ͳ����

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
