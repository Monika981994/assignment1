package mininet;
/**
 * Class Adult inherits the Person class
 * It has all the basic characteristics
 * In addition it has an array for children and a counter for it
 * The functions help to add friends, display profile, make changes, add a child, check friendship and so on
 * The functions are accessed by respective objects from the driver class
 * 
 * @author: Monika Vurigity
 */
public class Adult extends Person{
    public String Children[] = new String[5];
    int childrenCount;
    public Adult(String name,int age,String gender,String city, String country,char type,String status){
        Name=name;
        Age=age;
        Gender=gender;
        City=city;
        Country=country;
        Type=type;
        Status=status;
        childrenCount=0;
    }
    public int getChildrenCount(){
        return childrenCount;
    }
    public void display(){
        System.out.println("\nName: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Gender: "+Gender);
        System.out.println("City: "+City);
        System.out.println("Country: "+Country);  
        if(childrenCount!=0){
            System.out.println("Children: ");
            for(int i=0;i<childrenCount;i++)
                System.out.println(Children[i]);
        }
        System.out.println("\nStatus: "+Status);
    }
    public void update(String city,String country,String status){
        if(city!="")
            City=city;
        if(country!="")
            Country=country;
        if(status!="")
            Status=status;
        System.out.println("\nProfile Updated successfully!!");
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
    public void addChild(String child){
        Children[childrenCount++]=child;
    }
}
