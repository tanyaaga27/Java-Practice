interface I1{
public static final int a=10;
int b=20;
void show1();
default void display(){
}
static void move()
{
}
}
interface I2{
void show2();
}
class test implements I1,I2
{
public void show1() //throws error if public keyword is not used
{
System.out.println("1");
}
public void show2()
{
System.out.println("2");
}
public static void main(String args[])
{
test t=new test();
t.show1();
t.show2();
}
}