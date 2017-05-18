class Dog
{
	String breed;
	String size;
	Integer age;
	String colour;

void eat()
{
	System.out.println(breed+" would like to drink milk");

}
void sleep()
{
	System.out.println(breed+" would like to sleep in its bed");
}
void sit()
{
	System.out.println(breed+" would like to sit outside");
}
 void run()
 {
 	if(age > 2)
 	{
 	  System.out.println(breed+" would like to run on road");
 	}
 	else
 	{
 	   System.out.println(breed+" can not run on road");	
 	}
 }
 public static void main(String[] args)
 {
  Dog d = new Dog();
  d.breed="Nepolian Mastiff";
  d.size="Large";
  d.age=5;
  d.colour="Black";
  Dog d1 = new Dog();
  d1.breed="Maltese";
  d1.size="small";
  d1.age=2;
  d1.colour="white";

   d1.eat();
   d1.sleep();
   d1.sit();
   d1.run();

  d.eat();
  d.sleep();
  d.sit();
  d.run();
  Dog d3 = new Dog();
  d3.breed="chowchow";
  d3.size="midium";
  d3.age=3;
  d3.colour="Brown";

  d3=d1;

  d3.eat();
  d3.sleep();
  d3.sit();
  d3.run();
 }

}
