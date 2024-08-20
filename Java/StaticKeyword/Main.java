package StaticKeyword;

public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			the class "owns" the static member
		
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
		Friend.displayFriends();
		
		

	}

}
