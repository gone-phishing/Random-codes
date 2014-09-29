
public class HelloWorldPersons {

	public static void main(String[] args) {
		Person [] persons = new Person[10];
		int i,j;
		Person john = new Person();
		john.name="John";
		john.age=19;
		
		Person mary = new Person();
		mary.name="Mary";
		mary.age=43;
		
		Person mike = new Person();
		mike.name="Mike";
		mike.age=11;
		
		Person samuels = new Person();
		samuels.name="Samuels";
		samuels.age=90;
		
		Person peter = new Person();
		peter.name="Peter";
		peter.age=50;
		
		Person temp = new Person();
		Person min  =  new Person();
		persons[0]=john;
		persons[1]=mary;
		persons[2]=mike;
		persons[3]=samuels;
		persons[4]=peter;
		
		for(i=0;i<5;i++)
		System.out.println(persons[i].name);
		
		
		min.age=persons[0].age;
		
		for(i=0;i<5;i++)
		{
			min=persons[i];
				
			for(j=i;j<5;j++)
				{
					if(persons[j].age<min.age)
					{
						temp=min;
						min=persons[j];
						persons[i]=persons[j];
						persons[j]=temp;
						
					}
				}
				
	    }
		
		for(i=0;i<5;i++)
			System.out.println("              "+persons[i].name);
	
	}
}
