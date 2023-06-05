/**
* The main class file.
*
* @author Navin Balekomebole
* @version 1.0
* @since 2023-06-05
*/

public final class Main {
    public static void main(String[] args) {
        // Create tree object.
        final Tree pine = new Tree(10000, 10, "Pine", 1);

        // Print out original features.
        System.out.println("Height is: " + pine.feetTall);
        System.out.println("Number of leaves is: " + pine.numberOfLeaves);
        System.out.println("Age is: " + pine.age);
        System.out.println("Type is: " + pine.type);

        // Grow pine tree.
        pine.grow();
        System.out.println("Height is: " + pine.feetTall);
        System.out.println("Number of leaves is: " + pine.numberOfLeaves);
        System.out.println("Age is: " + pine.age);
        System.out.println("Type is: " + pine.type);

        // Grow pine tree slowly.
        pine.growSlow();
        System.out.println("Height is: " + pine.feetTall);
        System.out.println("Number of leaves is: " + pine.numberOfLeaves);
        System.out.println("Age is: " + pine.age);
        System.out.println("Type is: " + pine.type);

        // Grow pine tree with overloaded method.
        pine.grow(10, 5000);
        System.out.println("Height is: " + pine.feetTall);
        System.out.println("Number of leaves is: " + pine.numberOfLeaves);
        System.out.println("Age is: " + pine.age);
        System.out.println("Type is: " + pine.type);

        // Lose all leaves
        // for winter.
        pine.loseAllLeaves();
        System.out.println("Height is: " + pine.feetTall);
        System.out.println("Number of leaves is: " + pine.numberOfLeaves);
        System.out.println("Age is: " + pine.age);
        System.out.println("Type is: " + pine.type);
    }
}

