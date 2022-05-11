
class Test{
int x=100;
static int y=200;
public static void main(String[] args){
Test t1=new Test();
t1.x=888; 
t1.y=999;
Test t2=new Test();
System.out.println(t2.x+"----"+t2.y);//100------- 999
}
}

