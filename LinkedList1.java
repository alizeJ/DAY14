/*
ʹ��LinkedListģ���ջ�Ͷ������ݽṹ

��ջ���Ƚ����
���У��Ƚ��ȳ�
*/
import java.util.*;

class DuiZhan
{
	private LinkedList link;
	DuiZhan()
	{
		link = new LinkedList();
	}

	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}

	public Object myGet()
	{
			return link.removeFirst();
	}

	public boolean isNull()
	{
		return link.isEmpty();
	}
}

class LinkedListDemo
{
	public static void main(String[] args)
	{
		DuiZhan d1 = new DuiZhan();
		d1.myAdd("java 01");
		d1.myAdd("java 02");
		d1.myAdd("java 03");
		d1.myAdd("java 04");
	
		while(!d1.isNull())
			sop(d1.myGet());


	}

	public static void sop(Object obj)
	{

		System.out.println(obj);
	}
}