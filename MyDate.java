class MyDate

{
private int day, month, year;
MyDate()

{
day=20; month=10; year=2020;
}
int getDay()

{return day;}
void setDay(int d)
{day=d;}
void display()
{System.out.println(day+"/"+month+"/"+year);}
public static void main(String args[])
{
MyDate dc=new MyDate();
dc.display();
}

}