package mininet;
/**
 * Class Dependant inherits the Person class
 * It has all the basic characteristics
 * In addition it has two variables to link to parents from the adult class
 * The functions help to add friends, display profile, make changes, check friendship,
 * check age difference with other dependants, check if age is 2 years and so on
 * The functions are accessed by respective objects from the driver class
 * @author: Monika Vurigity
 */
public class Dependant extends Person{
    public String Parent1;
    public String Parent2;
    
    public Dependant(String name,int age,String gender,String city, String country, char type, String status, String parent1, String parent2){
        Name=name;
        Age=age;
        Gender=gender;
        City=city;
        Country=country;
        Type=type;
        Status=status;
        Parent1=parent1;
        Parent2=parent2;
    }
    public void display(){
        System.out.println("\nName: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Gender: "+Gender);
        System.out.println("City: "+City);
        System.out.println("Country: "+Country);
        System.out.println("\nParents are...\nParent1: "+Parent1);
        System.out.println("Parent2: "+Parent2);
        System.out.println("\nStatus: "+Status);
    }
    public void update(String city,String country,String status){
        if(city!="")
            City=city;
        if(country!="")
            Country=country;
        if(status!="")
            Status=status;
        System.out.println("Profile Updated successfully!!");
    }
    public int checkAge(){
        if(Age==2){
            return 0;
        }
        return 1;
    }
    public int checkDiff(Dependant ob){
        if(Age>ob.Age){
            if((Age-ob.Age)>3)
                return 0;
            else
                return 1;
        }
        else if(Age<ob.Age){
            if((ob.Age-Age)>3)
                return 0;
            else
                return 1;
        }
        return 1;
    }
    public void addAFriend(String name){
        Friends[FriendsCount++]=name;
    }
    public void checkFriendship(String fName){
        int flag=0;
        for(int i=0;i<FriendsCount;i++){
            if(Friends[i].equalsIgnoreCase(fName)){
                flag=1;
                System.out.println("Yes, they are friends!!");
                break;
            }   
        }
        if(flag==0)
            System.out.println("No friendship exists between them!!");
    }
    public void listFriends(){
        if(FriendsCount==0)
            System.out.println("\n"+Name+" currently has no friends.");
        else{
            System.out.println("The friends of "+Name+" are: ");
            for(int i=0;i<FriendsCount;i++){
                System.out.println("Friend 1: "+Friends[i]);
            }
        }
    }
}
