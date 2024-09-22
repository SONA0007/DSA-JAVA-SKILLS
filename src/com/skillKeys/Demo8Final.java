package com.skillKeys;

// final keyword
class Final {
    //static int count = 50;
    final int count = 150;
    /*final void demo(){
      // now we cannot override this demo method in subclass
        // but we can inherit it
        System.out.println(" value\t"+count);
    }*/
	/*static{
		count++;
	}
    */
    void demo(){// after using final we can't change value again
        //count = 107 ;// show error
        System.out.println("Value\t"+count);
    }

    /*static void demo(){
    	count= 110;
    	System.out.println(" value\t"+count);
    }*/
}
class B extends Final
{
    void demo(){
        System.out.println("Value\t"+count);
    }
}

public class Demo8Final
{
    public static void main(String[] args) {
        Final d = new Final();
        d.demo();
        Final d1 = new Final();
        Final d2 = new Final();
        System.out.println("Value of count: "+d1.count);
        System.out.println("Value of count: "+d2.count );

        B ob = new B();
        System.out.println("Count of obj of B class - "+ob.count);

    }
}

