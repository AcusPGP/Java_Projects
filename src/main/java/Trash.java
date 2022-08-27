import java.util.Stack;

public class Trash {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        // At first, the stack is empty

        System.out.println(stack.empty()); // The result is true

        // Then, we add items by using stack.push(object)
        stack.push("Minecraft");
        stack.push("GTA5");
        stack.push("Call of duty");
        System.out.println(stack); // The result of the stack is [Minecraft, GTA5, Call of duty]

        // Then, we remove items by using stack.pop(object)
        stack.pop();
        System.out.println(stack); // The result of the stack is [Minecraft, GTA5]
        stack.pop();
        System.out.println(stack); // The result of the stack is [Minecraft]
        stack.pop();
        System.out.println(stack); // The result of the stack is []
        // If we stack.pop() again, it will be an error called "EmptyStackException"
        stack.pop();

        // Get the highest item's value in the stack
        String myFavoriteGame1 = stack.peek();
        System.out.println(stack); // The result of the stack is [Minecraft, GTA5, Call of duty]
        System.out.println(myFavoriteGame1); // We have a value for myFavoriteGame - "Call of duty"

        // Get the highest item's value in the stack and remove it
        String myFavoriteGame2 = stack.pop();
        System.out.println(stack); // The result of the stack is [Minecraft, GTA5]
        System.out.println(myFavoriteGame2); // We have a value for myFavoriteGame AFTER REMOVING - "Call of duty"
        // Warning after removing the highest value in the stack, the highest value in the stack now is "GTA5" - REMEMBER the difference

        // Check the position of each item in the stack: the highest is 1
        System.out.println(stack.search("Call of duty")); // Position : 1
        System.out.println(stack.search("GTA5")); // Position : 2
        System.out.println(stack.search("Minecraft")); // Position : 3
        // If the value we are looking for is not in the stack, it will return "-1"
        System.out.println(stack.search("Snake")); // Result : -1
    }
}
